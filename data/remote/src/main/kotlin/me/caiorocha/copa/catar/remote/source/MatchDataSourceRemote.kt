package me.caiorocha.copa.catar.remote.source

import me.caiorocha.copa.catar.data.source.MatchesDataSource
import me.caiorocha.copa.catar.domain.model.MatchDomain
import me.caiorocha.copa.catar.remote.extensions.getOrThrowDomainError
import me.caiorocha.copa.catar.remote.mapper.toDomain
import me.caiorocha.copa.catar.remote.services.MatchesServices
import javax.inject.Inject

class MatchDataSourceRemote @Inject constructor(
    private val service: MatchesServices
) : MatchesDataSource.Remote {

    override suspend fun getMatches(): List<MatchDomain> {
        return runCatching {
            service.getMatches()
        }.getOrThrowDomainError().toDomain()
    }
}
