package com.plcoding.composepaging3caching.data

import com.plcoding.composepaging3caching.data.local.BeerEntity
import com.plcoding.composepaging3caching.data.remote.BeerDto
import com.plcoding.composepaging3caching.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        firstBrew = firstBrew,
        description = description,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        firstBrew = firstBrew.toString(),
        description = description,
        imageUrl = imageUrl
    )
}