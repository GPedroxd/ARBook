package com.plcoding.bookpedia.book.data.database

import androidx.room.Query
import androidx.room.Upsert
import com.plcoding.bookpedia.book.domain.Book
import kotlinx.coroutines.flow.Flow

interface BookDao {
    @Upsert
    suspend fun upsert(book:BookEntity)

    @Query("Select * from BookEntity")
    fun getBooks():Flow<List<BookEntity>>

    @Query("select * from BookEntity where id = :id")
    suspend fun getBookById(id: String):BookEntity?

    @Query("Delete from BookEntity where id = :id")
    suspend fun deleteBook(id: String)
}