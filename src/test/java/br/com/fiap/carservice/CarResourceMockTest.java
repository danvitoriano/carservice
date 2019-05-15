package br.com.fiap.carservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

// use mockito to run tests
@RunWith(MockitoJUnitRunner.class)
public class CarResourceMockTest {

    @Mock // mock resource
    private CarResource carResource;

    // test should return a car given a color string name
    @Test // junit test
    public void shouldFindCarByColor(){
        // Stub
        // car attributes
        String color = "yellow";
        String model = "camaro";
        // new Car object
        Car car = new Car();
        // setter methods
        car.setColor(color);
        car.setModel(model);

        // create empty list of Car
        List<Car> cars = Arrays.asList(car);

        //teste mockito
        // quando for ao carResource e procurar pela cor
        // retornar os carros encontrados na lista cars
        Mockito.when(carResource.findCarByColor(color)).thenReturn(cars);
    }


}
