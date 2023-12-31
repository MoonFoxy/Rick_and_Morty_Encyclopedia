package com.moonfoxy.rickandmortyencyclopedia.local.mappers


interface EntityMapper<M, E> {
    fun mapFromModel(model: M): E
    fun mapToModel(entity: E): M
}