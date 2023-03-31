package com.boriskaloshin.composition.domain.usecases

import com.boriskaloshin.composition.domain.entity.Question
import com.boriskaloshin.composition.domain.repository.GameRepository

class GenerateQuestionUseCase (
    private val repository: GameRepository
) {
    //Ниже команда, позволяющая вызывать класс как метод например generateQuestionUseCase() или generateQuestionUseCase.invoke
    //нет смысла метод называть как класс
    operator fun invoke(maxSumValue: Int) : Question{
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }


    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}