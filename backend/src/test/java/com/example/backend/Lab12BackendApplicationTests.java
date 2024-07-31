// package com.example.backend;

// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;

// @SpringBootTest
// class Lab12BackendApplicationTests {

//     @Test
//     void contextLoads() {
//     }

// }


package com.example.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.context.annotation.Import;

@SpringBootTest
@ActiveProfiles("test")
@Import(TestConfiguration.class)
class Lab12BackendApplicationTests {

    @Test
    void contextLoads() {
    }
}
