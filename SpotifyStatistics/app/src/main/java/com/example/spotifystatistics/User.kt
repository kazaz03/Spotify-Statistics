package com.example.spotifystatistics

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("display_name") val displayName: String,
    @SerializedName("id") val id: String,
    @SerializedName("images") val images: List<SpotifyImage>,
    @SerializedName("product") val subscriptionLevel: String,
    @SerializedName("uri") val uri: String
)
