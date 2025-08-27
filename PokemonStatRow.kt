
package com.uvg.mypokedex.ui.detail

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PokemonStatRow(
    statName: String,
    statValue: Int,
    maxValue: Int,
    modifier: Modifier = Modifier
) {
    val progress = statValue.toFloat() / maxValue.toFloat()
    
    Text(
        text = statName,
        modifier = Modifier.padding(horizontal = 16.dp)
    )
    LinearProgressIndicator(
        progress = progress,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    )
    Text(
        text = "$statValue/$maxValue",
        modifier = Modifier.padding(horizontal = 16.dp)
    )
}
