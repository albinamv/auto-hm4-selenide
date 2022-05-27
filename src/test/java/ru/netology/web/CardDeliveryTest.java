package ru.netology.web;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class CardDeliveryTest {
    @Test
    public void shouldSentForm() {
        open("http://localhost:9999/");

    }
}
