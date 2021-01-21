package com.kotlin.currencyconverter.data.models

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *@author Rizki Rian Anandita
 * Create By rizki
 */
interface CurrencyApi {

    @GET("/latest")
    suspend fun getRates(
        @Query("base") base: String
    ): Response<CurrencyResponse>

}