package com.twschool.practice.repository;

import com.twschool.practice.domain.AnswerGenerator;
import com.twschool.practice.domain.GuessNumberGame;

import java.security.PrivateKey;

public class GameRepository {

    private GuessNumberGame guessNumberGame = new GuessNumberGame(new AnswerGenerator());



    public GuessNumberGame find() {

        return guessNumberGame;

    }
}
