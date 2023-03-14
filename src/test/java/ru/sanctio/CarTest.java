package ru.sanctio;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void getManufacturer() {
        Car car = Mockito.mock(Car.class);
        assertEquals(null, car.getManufacturer());
    }
}