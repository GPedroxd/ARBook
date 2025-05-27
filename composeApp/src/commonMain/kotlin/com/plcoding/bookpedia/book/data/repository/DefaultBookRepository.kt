package com.plcoding.bookpedia.book.data.repository

import androidx.sqlite.SQLiteException
import com.plcoding.bookpedia.book.data.database.BookDao
import com.plcoding.bookpedia.book.data.mappers.toBook
import com.plcoding.bookpedia.book.data.mappers.toBookEntity
import com.plcoding.bookpedia.book.data.network.RemoteBookDataSource
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.domain.BookRepository
import com.plcoding.bookpedia.core.domain.DataError
import com.plcoding.bookpedia.core.domain.Result
import com.plcoding.bookpedia.core.domain.map
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource,
    private val bookDao: BookDao
): BookRepository {
    override  suspend fun searchBooks(query:String) : Result<List<Book>, DataError.Remote>{
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto->
                dto.results.map { it.toBook() }
            }
    }

    override fun getDownloadedBooks(): Flow<List<Book>> {
        return bookDao
            .getBooks()
            .map { bookEntities ->
                bookEntities.map{ it.toBook()}
            }
    }

    override suspend fun downloadBook(book: Book): Result<Unit, DataError.Local> {
        return try {
            bookDao.upsert(book.toBookEntity())
            Result.Success(Unit)
        } catch (e: SQLiteException){
            Result.Error(DataError.Local.DISK_FULL)
        }
    }

    override suspend fun deleteDownloadedBook(id: String) {
        bookDao.deleteBook(id)
    }
}