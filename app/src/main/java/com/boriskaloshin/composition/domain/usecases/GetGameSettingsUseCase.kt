package com.boriskaloshin.composition.domain.usecases

import com.boriskaloshin.composition.domain.entity.GameSettings
import com.boriskaloshin.composition.domain.entity.Level
import com.boriskaloshin.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}