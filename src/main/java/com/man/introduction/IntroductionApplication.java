package com.man.introduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableJpaAuditing // JPA Auditing 활성화
public class IntroductionApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntroductionApplication.class, args);
        System.out.println("Hello World!");
    }

}
