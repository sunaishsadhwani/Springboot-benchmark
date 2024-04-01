package com.example.sunishthesisexperiment;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SunishThesisExperimentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunishThesisExperimentApplication.class, args);
    }

    @GetMapping
    public double[] generateRandom() {
        return IntStream.rangeClosed(1, 100).mapToDouble(it -> Math.random() * it * 100).toArray();
    }

}

