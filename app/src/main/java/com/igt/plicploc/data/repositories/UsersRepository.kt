package com.igt.plicploc.data.repositories

import com.igt.plicploc.data.datasources.LocalUsersDataSource
import com.igt.plicploc.data.datasources.RemoteUsersDataSource
import java.io.File

class UsersRepository(
    private val localUsersDataSource: LocalUsersDataSource,
    private val remoteUsersDataSource: RemoteUsersDataSource
) {
    suspend fun searchUser(username: String): User {
        TODO("Pendiente de implementación")
    }

    suspend fun updateUser(user: User): User {
        TODO("Pendiente de implementación")
    }

    suspend fun signIn(user: User): User {
        TODO("Pendiente de implementación")
    }

    suspend fun signInWithProvider(user: User): User {
        TODO("Pendiente de implementación")
    }

    suspend fun unfollowUser(user: User) {
        TODO("Pendiente de implementación")
    }

    suspend fun followUser(user: User) {
        TODO("Pendiente de implementación")
    }

    suspend fun changeProfilePicture(picture: File): User {
        TODO("Pendiente de implementación")
    }

    suspend fun register(user: User): User {
        TODO("Pendiente de implementación")
    }

    suspend fun updatePassword(user: User) {
        TODO("Pendiente de implementación")
    }

    suspend fun resetPassword(user: User) {
        TODO("Pendiente de implementación")
    }

    suspend fun requestUserPassword(email: String) {
        TODO("Pendiente de implementación")
    }
}

object User {}