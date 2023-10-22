package me.caiorocha.copa.catar.domain.usecase

import me.caiorocha.copa.catar.domain.repositories.MatchesRepository
import javax.inject.Inject

class DisableNotificationUseCase @Inject constructor(
    private val repository: MatchesRepository
) {
    suspend operator fun invoke(id: String){
        return repository.disableNotificationFor(id)
    }
}