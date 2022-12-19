package com.example.basicretrofitsample.di

import com.example.basicretrofitsample.feature_getRequest.data.data_source.MyApi
import com.example.basicretrofitsample.feature_getRequest.data.repository.MyRepositoryImpl
import com.example.basicretrofitsample.feature_getRequest.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideApiInstance(): MyApi {
        return Retrofit.Builder()
            .baseUrl("https://dummyjson.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MyApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRepositoryInstance(api: MyApi) : MyRepository {
        return MyRepositoryImpl(api)
    }


}