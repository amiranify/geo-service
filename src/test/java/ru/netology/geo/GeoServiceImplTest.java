package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

class GeoServiceImplTest {

    @Test
    void byIp() {
        GeoService geoService = new GeoServiceImpl();
        Country country = Country.RUSSIA;
        Country byIpResult = geoService.byIp(GeoServiceImpl.MOSCOW_IP).getCountry();
        Assertions.assertEquals(country, byIpResult);
        System.out.println(country);
    }
}