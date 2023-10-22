package me.caiorocha.copa.catar.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import me.caiorocha.copa.catar.data.di.DataModule
import me.caiorocha.copa.catar.local.di.LocalModule
import me.caiorocha.copa.catar.remote.di.NetworkModule
import me.caiorocha.copa.catar.remote.di.RemoteModule
import me.caiorocha.copa.catar.remote.di.ServiceModules

@Module(
    includes = [
        DataModule::class,
        LocalModule::class,
        RemoteModule::class,
        NetworkModule::class,
        ServiceModules::class,
    ]
)
@InstallIn(SingletonComponent::class)
abstract class ApplicationModule {
    @Binds
    abstract fun bindContext(application: Application): Context
}
