package com.plcoding.composepaging3caching.data.remote

data class BeerDto(
    val id:Int,
    val name:String,
    val tagline:String,
    val description:String,
    val firstBrew:String,
    val image_url:String?
)
