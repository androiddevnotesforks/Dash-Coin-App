package com.mathroda.internetconnectivity

import kotlinx.coroutines.flow.Flow

sealed class InternetState {
    data object Available: InternetState()
    data object NotAvailable: InternetState()
    data object IDLE: InternetState()
}
interface InternetConnectivityManger {
    fun getState(): Flow<InternetState>
}