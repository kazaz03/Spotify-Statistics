package com.example.spotifystatistics

import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SpotifyDAO {
    private lateinit var context: Context

    fun setContext(context: Context)
    {
        this.context=context
    }

    suspend fun getUserDetails(token: String?): User? = withContext(Dispatchers.IO){
        try{
            val response=ApiAdapter.retrofit.getCurrentUsersProfile(token)
            if(response.isSuccessful){
                val userDetails=response.body()
                if(userDetails!=null){
                    return@withContext userDetails
                }
            }
        }catch(e: Exception){
            e.printStackTrace()
        }
        return@withContext null
    }
}