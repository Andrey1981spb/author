package ru.spb.dreamwhite.web;

import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static ru.spb.dreamwhite.testdata.UserTestData.ADMIN;

class RootControllerTest extends AbstractControllerTest {

    RootControllerTest() {
        super("");
    }

    @Test
    void getUsers() throws Exception {
        perform(doGet("users").auth(ADMIN))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("users"))
                .andExpect(forwardedUrl("/WEB-INF/jsp/users.jsp"));
    }

    @Test
    void unAuth() throws Exception {
        perform(doGet("users"))
                .andDo(print())
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("http://localhost/login"));
    }
}
