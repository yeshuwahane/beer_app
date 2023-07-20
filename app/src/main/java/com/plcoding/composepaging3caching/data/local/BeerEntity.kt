package com.plcoding.composepaging3caching.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BeerEntity(
    @PrimaryKey
    val id:Int,
    val name:String,
    val tagline:String,
    val description:String,
    val firstBrew:String?,
    val imageUrl:String?
)
