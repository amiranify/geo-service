package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

class LocalizationServiceImplTest {

    @Test
    void locale() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        localizationService.locale(Country.RUSSIA);
        Assertions.assertEquals("Добро пожаловать", localizationService.locale(Country.RUSSIA));
        System.out.println(localizationService.locale(Country.RUSSIA));
    }
}