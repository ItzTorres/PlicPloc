package com.igt.plicploc.data.repositories

import com.igt.plicploc.data.datasources.LocalPreferencesDataSource

class PreferencesRepository(
    private val localPreferencesDataSource: LocalPreferencesDataSource
) {
    fun saveUserColor(color: String) {
        TODO("Pendiente de implementación")
    }

    fun getUserColor(): String {
        TODO("Pendiente de implementación")
    }
}