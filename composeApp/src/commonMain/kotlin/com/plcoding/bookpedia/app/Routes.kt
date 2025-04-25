package com.plcoding.bookpedia.app

import androidx.navigation.NavBackStackEntry
import kotlinx.serialization.Serializable

sealed interface Route {

    @Serializable
    data object BookGraph: Route

    @Serializable
    data object  BookList: Route

    @Serializable
    data class  BookDetail(val id: String): Route

    @Serializable
    data object  ReadingGraph: Route


    @Serializable
    data object  Reading: Route

    fun NavBackStackEntry.asRoute(): Route? {
        val route = this.destination.route ?: return null
        return when {
            route == Route.BookList::class.qualifiedName -> Route.BookList
            route == Route.Reading::class.qualifiedName -> Route.Reading
            route.startsWith("${Route.BookDetail::class.qualifiedName}/") -> {
                val id = route.removePrefix("${Route.BookDetail::class.qualifiedName}/")
                Route.BookDetail(id = id)
            }
            else -> null
        }
    }
}