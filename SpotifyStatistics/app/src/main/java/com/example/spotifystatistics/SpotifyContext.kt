package com.example.spotifystatistics

import com.google.gson.annotations.SerializedName

data class SpotifyContext(
    @SerializedName("type") val type: String,
    @SerializedName("href") val linkToDetailsOfTrack: String,
    @SerializedName("uri") val uri: String
)
