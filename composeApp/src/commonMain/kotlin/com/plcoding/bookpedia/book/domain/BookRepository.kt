package com.plcoding.bookpedia.book.domain

import com.plcoding.bookpedia.core.domain.DataError
import com.plcoding.bookpedia.core.domain.Result
import kotlinx.coroutines.flow.Flow

interface BookRepository {
    suspend fun  searchBooks(query: String): Result<List<Book>, DataError.Remote>

    fun  getDownloadedBooks():Flow<List<Book>>
    suspend fun downloadBook(book: Book): Result<Unit, DataError.Local>
    suspend fun deleteDownloadedBook(id: String)
}