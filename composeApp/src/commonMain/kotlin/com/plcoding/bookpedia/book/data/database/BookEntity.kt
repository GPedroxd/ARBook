package com.plcoding.bookpedia.book.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BookEntity(
    @PrimaryKey(autoGenerate = false) val id: String,
    val title: String,
    val description: String?,
    val imageUrl: String?,
    val authors: List<String>,
    val publishYear: String?,
    val ratingAverage: Double?,
    val numPages: Int
)