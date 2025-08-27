// ui/detail/
package com.uvg.mypokedex.ui.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.uvg.mypokedex.R

@Composable
fun PokemonMeasurements(
    height: Float,
    weight: Float,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = stringResource(R.string.height_format, height))
        Text(text = stringResource(R.string.weight_format, weight))
    }
}
