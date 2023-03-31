package com.boriskaloshin.composition.domain.repository

import com.boriskaloshin.composition.domain.entity.GameSettings
import com.boriskaloshin.composition.domain.entity.Level
import com.boriskaloshin.composition.domain.entity.Question

interface GameRepository {
    fun generateQuestion (
        maxSumValue: Int,
        countOfOptions: Int //количество вариантов ответов, сколько их надо генерировать
    ): Question
    fun getGameSettings (level: Level) : GameSettings
}