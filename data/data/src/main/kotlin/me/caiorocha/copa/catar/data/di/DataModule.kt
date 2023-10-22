package me.caiorocha.copa.catar.data.di

import dagger.Binds
import dagger.Module
import me.caiorocha.copa.catar.data.repository.MatchesRepositoryImpl
import me.caiorocha.copa.catar.domain.repositories.MatchesRepository

@Module
interface DataModule {

    @Binds
    fun providesMatchesRepository(impl: MatchesRepositoryImpl): MatchesRepository
}
