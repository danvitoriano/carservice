package br.com.fiap.carservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

// use mockito to run tests
@RunWith(MockitoJUnitRunner.class)
public class CarResourceMockTest {

    @Mock // mock resource
    private CarResource carResource;

    // test should return a car given a color string name
    @Test // junit test
    public void shouldFindCarByColor(){
        // Stub
        String color = "yellow";
        String model = "camaro";
        Car car = new Car();
        car.setColor(color);
        car.setModel(model);
    }


}
