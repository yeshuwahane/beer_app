package com.plcoding.composepaging3caching.domain

data class Beer(
    val id: Int,
    val name: String,
    val tagline: String,
    val description: String,
    val firstBrew: String,
    val imageUrl: String?
)
