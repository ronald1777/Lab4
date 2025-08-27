package com.uvg.mypokedex.ui.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.uvg.mypokedex.data.model.Pokemon

@Composable
fun DetailScreen(
    pokemon: Pokemon,
    onBackClick: () -> Unit,
    onFavoriteClick: () -> Unit,
    isFavorite: Boolean
) {
    Scaffold(
        topBar = {
            PokemonDetailTopBar(
                pokemonName = pokemon.name,
                isFavorite = isFavorite,
                onBackClick = onBackClick,
                onFavoriteClick = onFavoriteClick
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
        ) {
            Image(
                painter = rememberImagePainter(pokemon.imageUrl),
                contentDescription = null,
                modifier = Modifier
                    .size(200.dp)
                    .padding(16.dp),
                contentScale = ContentScale.Fit
            )
            
            PokemonMeasurements(
                height = pokemon.height,
                weight = pokemon.weight,
                modifier = Modifier.padding(vertical = 16.dp)
            )
            
            pokemon.stats.forEach { stat ->
                PokemonStatRow(
                    statName = stat.name,
                    statValue = stat.value,
                    maxValue = stat.maxValue
                )
            }
        }
    }
}
