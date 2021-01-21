package com.kotlin.currencyconverter.main

import com.kotlin.currencyconverter.data.models.CurrencyApi
import com.kotlin.currencyconverter.data.models.CurrencyResponse
import com.kotlin.currencyconverter.util.Resource
import java.lang.Exception
import javax.inject.Inject

/**
 *@author Rizki Rian Anandita
 * Create By rizki
 */
class DefaultMainRepository @Inject constructor(
    private val api: CurrencyApi
) : MainRepository {

    override suspend fun getRates(base: String): Resource<CurrencyResponse> {
        return try {
            val response = api.getRates(base)
            val result = response.body()
            if (response.isSuccessful && result != null) {
                Resource.Success(result)
            } else {
                Resource.Error(response.message())
            }
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An error occured")
        }
    }
}