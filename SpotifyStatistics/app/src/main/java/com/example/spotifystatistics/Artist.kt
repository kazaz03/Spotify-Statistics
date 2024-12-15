package com.example.spotifystatistics

import com.google.gson.annotations.SerializedName

data class Artist(
    @SerializedName("href") val linkToDetailsOfArtist: String,
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String,
    @SerializedName("uri") val uri: String
)
