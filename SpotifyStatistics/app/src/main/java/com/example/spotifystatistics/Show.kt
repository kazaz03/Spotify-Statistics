package com.example.spotifystatistics

import com.google.gson.annotations.SerializedName

data class Show(
    @SerializedName("descprition") val description: String,
    @SerializedName("href") val linkToDetailsOfShow: String,
    @SerializedName("id") val id: String,
    @SerializedName("uri") val uri: String,
    @SerializedName("publisher") val publisher: String,
    @SerializedName("total_episodes") val totalEpisodes: Int
)
