package com.kotlin.currencyconverter.util

/**
 *@author Rizki Rian Anandita
 * Create By rizki
 */
sealed class Resource<T>(val data: T?, val message: String?) {
    class Success<T>(data: T) : Resource<T>(data, null)
    class Error<T>(message: String) : Resource<T>(null, message)
}