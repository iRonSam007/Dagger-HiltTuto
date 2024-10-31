package com.example.daggerhilttutoapp.data.repository

import com.example.daggerhilttutoapp.data.remote.MyApi
import com.example.daggerhilttutoapp.domain.repository.MyRepository

class MyRepositoryImp(private val api: MyApi): MyRepository {
    override suspend fun doNetworkCall() {

    }

}