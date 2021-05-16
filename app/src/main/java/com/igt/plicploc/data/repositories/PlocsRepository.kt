package com.igt.plicploc.data.repositories

import com.igt.plicploc.data.datasources.LocalPlocsDataSource
import com.igt.plicploc.data.datasources.RemotePlocsDataSource

class PlocsRepository(
    private val localPlocsDataSource: LocalPlocsDataSource,
    private val remotePlocsDataSource: RemotePlocsDataSource
) {
    suspend fun getAllPlocsFrom(user: User): List<Ploc> {
        TODO("Pendiente de implementación")
    }

    suspend fun savePloc(ploc: User): Ploc {
        TODO("Pendiente de implementación")
    }

    suspend fun getPloc(ploc: Ploc): Ploc {
        TODO("Pendiente de implementación")
    }

    suspend fun likePloc(ploc: Ploc): Ploc {
        TODO("Pendiente de implementación")
    }

    suspend fun rePloc(ploc: Ploc): Ploc {
        TODO("Pendiente de implementación")
    }

    suspend fun deletePloc(ploc: Ploc) {
        TODO("Pendiente de implementación")
    }

    suspend fun search(text: String): List<Ploc> {
        TODO("Pendiente de implementación")
    }

    suspend fun searchByHashtag(text: String): List<Ploc> {
        TODO("Pendiente de implementación")
    }
}

object Ploc {}