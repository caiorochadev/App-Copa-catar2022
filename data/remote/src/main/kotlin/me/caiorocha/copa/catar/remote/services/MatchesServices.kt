package me.caiorocha.copa.catar.remote.services

import me.caiorocha.copa.catar.remote.model.MatchRemote
import retrofit2.http.GET

interface MatchesServices {
    @GET("api.json")
    suspend fun getMatches(): List<MatchRemote>
}
