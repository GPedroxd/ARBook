package com.plcoding.bookpedia.book.presentation.book_details.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.plcoding.bookpedia.core.presentation.LightBlue

enum class ChipSize {
    SMALL, REGULAR
}

@Composable
fun BookChip(
    size: ChipSize = ChipSize.REGULAR,
    modifier: Modifier = Modifier,
    chipContent: @Composable RowScope.() -> Unit
) {
    Box(
        modifier = Modifier
            .widthIn(
                min = when (size) {
                    ChipSize.REGULAR -> 50.dp
                    ChipSize.SMALL -> 80.dp
                }
            )
            .clip(RoundedCornerShape(16.dp))
            .background(LightBlue)
            .padding(
                vertical = 8.dp,
                horizontal = 12.dp
            ),
        contentAlignment = Alignment.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            chipContent()
        }
    }
}
