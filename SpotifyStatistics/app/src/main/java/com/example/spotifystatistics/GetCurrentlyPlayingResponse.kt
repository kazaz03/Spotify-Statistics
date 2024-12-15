package com.example.spotifystatistics

import com.google.gson.annotations.SerializedName

data class GetCurrentlyPlayingResponse(
    @SerializedName("device") val device:SpotifyDevice,
    @SerializedName("context") val context: SpotifyContext?,
    @SerializedName("timestamp") val timestamp: Int,
    @SerializedName("progress_ms") val progressMs: Int,
    @SerializedName("is_playing") val isPlaying: Boolean,
    @SerializedName("item") val item: CurrentItem,
    @SerializedName("currently_playing_type") val currently_playing_type: String,
    @SerializedName("actions") val actions: SpotifyActions
    )
