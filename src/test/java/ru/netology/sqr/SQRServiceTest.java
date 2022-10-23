package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void calculateTest() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calculate(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateNextTest() {
        SQRService service = new SQRService();
        int actual = service.calculate(10, 150);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateThreeTest() {
        SQRService service = new SQRService();
        int actual = service.calculate(500, 900);
        int expected = 8;
        Assertions.assertEquals(expected, actual);

    }


}