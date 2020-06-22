package com.twschool.practice.Controll;

import com.twschool.practice.Service.GameService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

public class gameControll {
    private GameService gameService;

    @PostMapping("/game/guessNumber")
    public Map<String,String> guess(@RequestBody Map<String,String> requestBody)
    {
        String number = requestBody.get("number");
        Map<String,String> responseBody = new HashMap<>();
        responseBody.put("input",number);
        responseBody.put("result",gameService.(number));
        return responseBody;
    }




}
