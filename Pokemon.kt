package com.uvg.mypokedex.data.model

data class Pokemon(
    val id: Int,
    val name: String,
    val types: List<PokemonType>,
    val stats: List<PokemonStat>,
    val height: Float, // en metros
    val weight: Float, // en kilogramos
    val imageUrl: String
)

data class PokemonStat(
    val name: String,
    val value: Int,
    val maxValue: Int = 100
)

data class PokemonType(
    val name: String,
    val color: String // color hexadecimal
)
