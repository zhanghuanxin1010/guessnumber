package com.twschool.practice.Service;

import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.repository.GameRepository;

public class GameService {

    private GameRepository gameRepository;

    public GameService(GameRepository gameRepository)
    {
        this.gameRepository = gameRepository;

    }
    public String Guess(String number) {
        GuessNumberGame guessNumberGame = gameRepository.find();
        return guessNumberGame.guess(number);

    }
}
