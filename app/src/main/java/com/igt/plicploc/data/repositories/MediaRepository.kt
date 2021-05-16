package com.igt.plicploc.data.repositories

import android.net.Uri
import com.igt.plicploc.data.datasources.LocalMediaDataSource
import com.igt.plicploc.data.datasources.RemoteMediaDataSource
import java.io.File

class MediaRepository(
    private val localMediaDataSource: LocalMediaDataSource,
    private val remoteMediaDataSource: RemoteMediaDataSource
) {
    suspend fun uploadPicture(picture: File, ploc: Ploc): Uri {
        TODO("Pendiente de implementación")
    }

    suspend fun uploadVideo(video: File, ploc: Ploc): Uri {
        TODO("Pendiente de implementación")
    }

    suspend fun deletePicture(ploc: Ploc) {
        TODO("Pendiente de implementación")
    }

    suspend fun deleteVideo(ploc: Ploc) {
        TODO("Pendiente de implementación")
    }

    suspend fun getPicture(ploc: Ploc): Uri {
        TODO("Pendiente de implementación")
    }

    suspend fun getVideo(ploc: Ploc): Uri {
        TODO("Pendiente de implementación")
    }
}