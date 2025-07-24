package com.fuze.codechallengecstv.match.presentation.matchList.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fuze.codechallengecstv.ui.theme.CodeChallengeCSTVTheme

@Composable
fun MatchStatus(isMatchActive: Boolean, matchTime: String? = null) {
    val backgroundColor = if (isMatchActive) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary
    val textStyle = if (isMatchActive) MaterialTheme.typography.labelSmall else MaterialTheme.typography.bodySmall
    val text = if (isMatchActive) "AGORA" else matchTime ?: ""

    Row {
        Text(text,
            style = textStyle,
            color = MaterialTheme.colorScheme.onPrimary,
            modifier = Modifier
                .background(backgroundColor, shape = MaterialTheme.shapes.small
                    .copy(topStart = CornerSize(0.dp), bottomEnd = CornerSize(0.dp))

                )
                .padding(horizontal = 8.dp, vertical = 4.dp)
        )

    }

}


@Preview(showBackground = true)
@Composable
fun PreviewMatchStatus() {
    CodeChallengeCSTVTheme {
        Column {
            MatchStatus(isMatchActive = true)

            Spacer(modifier = Modifier.height(5.dp))

            MatchStatus(isMatchActive = false, matchTime = "Hoje, 21:00")
        }
    }


}