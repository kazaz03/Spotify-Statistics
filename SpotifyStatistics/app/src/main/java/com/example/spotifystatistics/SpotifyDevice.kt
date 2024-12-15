package com.example.spotifystatistics

import com.google.gson.annotations.SerializedName

data class SpotifyDevice(
    @SerializedName("id") val idOfDevice: String,
    @SerializedName("is_active") val is_active: Boolean,
    @SerializedName("name") val name: String,
    @SerializedName("type") val type: String,
    @SerializedName("volume_percent") val volumePercent: Int?
)
