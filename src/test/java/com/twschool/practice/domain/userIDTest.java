package com.twschool.practice.domain;


import com.twschool.practice.repository.UserID;
import com.twschool.practice.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;

public class userIDTest {

@Test
    public void should_return_userid()
    {
        //given
        UserID userID=new UserID("xiaoming",new GuessNumberGame(new AnswerGenerator()));
        UserRepository userRepository = new UserRepository();

        //when
        userRepository.setUserId("xiaoming",userID);

        //then
        UserID result = userRepository.getUserInfoById("xiaoming");
        Assert.assertNotNull(result);








    }

}
