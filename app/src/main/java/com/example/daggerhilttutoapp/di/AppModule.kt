package com.example.daggerhilttutoapp.di

import com.example.daggerhilttutoapp.data.remote.MyApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)   //Defines the lifecycle of the injected object: SingletonComponent, ActivityComponent, ViewModel, Retained, Service ...
object AppModule {

   //Define how dagger will provide the instances
    @Provides   //annotate dagger-hilt provide function
    @Singleton  //annotate the scope of the injected objects: only one instance of MyApi will be injected eah time needed
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }
}

