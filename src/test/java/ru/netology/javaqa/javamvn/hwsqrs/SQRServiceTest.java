package ru.netology.javaqa.javamvn.hwsqrs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrs.csv")
    void testAllOptions(int expected, int a, int b) {
        SQRService service = new SQRService();
        int actual = service.calcSqrService(a, b);

        assertEquals(expected, actual);

    }

}

