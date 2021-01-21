package com.kotlin.currencyconverter.main

import com.kotlin.currencyconverter.data.models.CurrencyResponse
import com.kotlin.currencyconverter.util.Resource

/**
 *@author Rizki Rian Anandita
 * Create By rizki
 */
interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>

}