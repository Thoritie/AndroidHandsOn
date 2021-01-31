package com.example.androidhandson.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class UserRepository constructor(
    private val userApi: UserApi
){
    fun getUser(id: String): Flow<UserResponse> {
        return flow {
            emit(userApi.getUser(id))
        }
    }
}