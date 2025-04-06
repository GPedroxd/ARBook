package com.plcoding.bookpedia.core.presentation

import cmp_bookpedia.composeapp.generated.resources.Res
import cmp_bookpedia.composeapp.generated.resources.error_disk_full
import com.plcoding.bookpedia.core.domain.DataError

fun DataError.toUiText():UiText {
    val stringRes = when (this){
        DataError.Local.DISK_FULL -> Res.string.error_disk_full
        DataError.Local.UNKNOWN -> Res.string.error_disk_full
        DataError.Remote.REQUEST_TIMEOUT -> Res.string.error_disk_full
        DataError.Remote.TOO_MANY_REQUEST -> Res.string.error_disk_full
        DataError.Remote.NO_INTERNET -> Res.string.error_disk_full
        DataError.Remote.SERVER -> Res.string.error_disk_full
        DataError.Remote.SERIALIZATION -> Res.string.error_disk_full
        DataError.Remote.UNKNOWN -> Res.string.error_disk_full
    }

    return UiText.StringResourceId(stringRes)
}