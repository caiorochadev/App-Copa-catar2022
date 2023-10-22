package me.caiorocha.copa.catar.remote.di

import dagger.Binds
import dagger.Module
import me.caiorocha.copa.catar.data.source.MatchesDataSource
import me.caiorocha.copa.catar.remote.source.MatchDataSourceRemote

@Module
interface RemoteModule {

    @Binds
    fun providesMatchDataSourceRemote(impl: MatchDataSourceRemote): MatchesDataSource.Remote
}
