package com.example.spotifystatistics

import android.media.Image
import com.google.gson.annotations.SerializedName

sealed class CurrentItem {
    //the same name for different type of objects
    data class TrackObject(
        @SerializedName("album") val album: Album,
        @SerializedName("artists") val artists: List<Artist>,
        @SerializedName("duration_ms") val durationMs: Int,
        @SerializedName("explicit") val explicitLyrics: Boolean,
        @SerializedName("href") val linkToDetailsOfTrack: String,
        @SerializedName("id") val idOfTrack: String,
        @SerializedName("name") val nameOfTrack: String,
        @SerializedName("popularity") val popularityOfTrack: Int,
        @SerializedName("preview_url") val previewOfTrack: String?,
    )

    data class EpisodeObject(
        @SerializedName("audio_preview_url") val previewOfEpisode: String?,
        @SerializedName("description") val description: String,
        @SerializedName("duration_ms") val durationMs: Int,
        @SerializedName("href") val linkToFullDetailsOfEpisode: String,
        @SerializedName("images") val image: List<SpotifyImage>,
        @SerializedName("name") val nameOfEpisode: String,
        @SerializedName("release_date") val releaseDate: String,
        @SerializedName("show") val show: Show
        )
}