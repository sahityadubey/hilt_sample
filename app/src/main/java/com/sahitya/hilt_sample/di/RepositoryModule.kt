package com.sahitya.hilt_sample.di

import com.sahitya.hilt_sample.repository.MainRepository
import com.sahitya.hilt_sample.retrofit.BlogRetrofit
import com.sahitya.hilt_sample.retrofit.NetworkMapper
import com.sahitya.hilt_sample.room.BlogDao
import com.sahitya.hilt_sample.room.CacheMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object RepositoryModule {

    @Singleton
    @Provides
    fun provideMainRepository(blogDao: BlogDao, retrofit: BlogRetrofit, cacheMapper: CacheMapper, networkMapper: NetworkMapper): MainRepository {
        return MainRepository(blogDao, retrofit, cacheMapper, networkMapper)
    }
}