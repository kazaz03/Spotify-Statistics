package com.example.spotifystatistics

import com.google.gson.annotations.SerializedName

data class Album(
    @SerializedName("album_type") val albumType: String,
    @SerializedName("total_tracks") val numberOfTracks: Int,
    @SerializedName("href") val linkToDetailsOfAlbum: String,
    @SerializedName("id") val idOfAlbum: Int,
    @SerializedName("images") val imagesOfAlbum: List<SpotifyImage>,
    @SerializedName("name") val nameOfAlbum: String,
    @SerializedName("release_date") val releaseDate: String,
    @SerializedName("uri") val uriForAlbum: String,
    @SerializedName("artists") val artists: List<Artist>
 )
