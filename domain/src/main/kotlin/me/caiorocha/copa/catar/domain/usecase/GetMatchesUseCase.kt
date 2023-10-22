package me.caiorocha.copa.catar.domain.usecase

import kotlinx.coroutines.flow.Flow
import me.caiorocha.copa.catar.domain.model.Match
import me.caiorocha.copa.catar.domain.repositories.MatchesRepository
import javax.inject.Inject

class GetMatchesUseCase @Inject constructor(
    private val repository: MatchesRepository
) {
    suspend operator fun invoke(): Flow<List<Match>> {
        return repository.getMatches()
    }
}