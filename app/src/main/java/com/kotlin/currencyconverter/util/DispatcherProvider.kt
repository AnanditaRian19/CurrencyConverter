package com.kotlin.currencyconverter.util

import kotlinx.coroutines.CoroutineDispatcher

/**
 *@author Rizki Rian Anandita
 * Create By rizki
 */
interface DispatcherProvider {
    val main: CoroutineDispatcher
    val io: CoroutineDispatcher
    val default: CoroutineDispatcher
    val unconfined: CoroutineDispatcher
}