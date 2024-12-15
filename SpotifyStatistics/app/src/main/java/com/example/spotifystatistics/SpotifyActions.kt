package com.example.spotifystatistics

import com.google.gson.annotations.SerializedName

data class SpotifyActions(
    //we can see what kind of state the track is in
    // pausing, resuming, seeking, skipping next, skipping_prev
    @SerializedName("pausing") val pausing: Boolean,
    @SerializedName("resuming") val resuming: Boolean,
    @SerializedName("skipping_next") val skippingNext: Boolean,
    @SerializedName("skipping_prev") val skippingPrev: Boolean
)
