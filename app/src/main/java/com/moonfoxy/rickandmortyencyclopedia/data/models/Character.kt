package com.moonfoxy.rickandmortyencyclopedia.data.models

data class Character(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: CharacterOrigin,
    val location: CharacterLocation,
    val image: String,
    val episode: List<String> = emptyList(),
    val url: String,
    val created: String
)
