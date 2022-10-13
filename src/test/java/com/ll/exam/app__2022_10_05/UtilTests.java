package com.ll.exam.app__2022_10_05;

import com.ll.exam.app__2022_10_05.util.Util;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.transaction.annotation.Transactional;

import java.nio.charset.StandardCharsets;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class UtilTests {
    @Test
    @DisplayName("Util.mapOf")
    void t1() {
        Map<String, Integer> ages = Util.mapOf("영수", 22, "철수", 33, "영희", 44, "민수", 55);

        assertThat(ages.get("영수")).isEqualTo(22);
        assertThat(ages.get("철수")).isEqualTo(33);
        assertThat(ages.get("영희")).isEqualTo(44);
        assertThat(ages.get("민수")).isEqualTo(55);
    }
}