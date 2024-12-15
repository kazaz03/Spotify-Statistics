package com.example.spotifystatistics

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface Api {
    @GET("me/player/currently-playing")
    suspend fun getCurrentlyPlayingTrack(
        @Header("Authorization") authHeader: String
    ): Response<GetCurrentlyPlayingResponse>

    @GET("me")
    suspend fun getCurrentUsersProfile(
        @Header("Authorization") authHeader: String?
    ):Response<User>
}