package com.plcoding.bookpedia


import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreen
import com.plcoding.bookpedia.book.presentation.book_list.BookListState

private val books = (1 .. 20).map{
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://asdfasdf.com",
        authors = listOf("Pedro"),
        description = "Desc $it",
        averageRating = 4.4534,
        publishYear = null
    )
}

@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResults = books
        ),
        onAction = { }
    )
}