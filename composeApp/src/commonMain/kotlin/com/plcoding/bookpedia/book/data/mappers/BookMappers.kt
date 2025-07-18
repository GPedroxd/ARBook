package com.plcoding.bookpedia.book.data.mappers

import com.plcoding.bookpedia.book.data.database.BookEntity
import com.plcoding.bookpedia.book.data.dto.SearchedBookDto
import com.plcoding.bookpedia.book.domain.Book

fun SearchedBookDto.toBook(): Book {
    return Book(
        id = id.substringAfterLast("/"),
        title = title,
        imageUrl = if (coverKey != null) {
            "https://covers.openlibrary.org/b/olid/${coverKey}-L.jpg"
        } else {
            "https://covers.openlibrary.org/b/olid/${coverAlternativeKey}-L.jpg"
        },
        authors = authorNames ?: emptyList(),
        description = "",
        publishYear = firstPublishYear.toString(),
        averageRating = ratingsAverage,
        numPages = numPagesMedian ?: 0
    )
}

fun Book.toBookEntity(): BookEntity{
    return BookEntity(
        id = id,
        title = title,
        description = description,
        imageUrl = imageUrl,
        authors = authors,
        ratingAverage = averageRating,
        publishYear = publishYear,
        numPages = numPages
    )
}

fun BookEntity.toBook(): Book{
    return Book(
        id = id,
        title = title,
        description = description,
        imageUrl = imageUrl ?: "",
        authors = authors,
        averageRating = ratingAverage,
        publishYear = publishYear,
        numPages = numPages
    )
}