package de.neuefische.book.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.http.converter.json.Jackson2ObjectMapperBuilder.json;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@SpringBootTest
@AutoConfigureMockMvc
public class ControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void isGetAllBooksReturningAllBooks() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/api/all"))
                .andExpect(content().json("[]"));

    }


}
