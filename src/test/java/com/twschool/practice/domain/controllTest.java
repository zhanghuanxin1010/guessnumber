package com.twschool.practice.domain;
import com.twschool.practice.Service.GameService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class controllTest {
    @MockBean
    private GameService gameService;

    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setUp(){
        Mockito.when(gameService.Guess(Mockito.any())).thenReturn("4A0B");
    }

    @Test
    public void should_return_guess_result_when_guess_number() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/game/guessNumber")
                .contentType(MediaType.APPLICATION_JSON).content("{\"number\":\"1 2 3 4\"}"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.input").value("1 2 3 4"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.result").value("4A0B"));


    }



}