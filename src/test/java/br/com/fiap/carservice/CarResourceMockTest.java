package br.com.fiap.carservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

// use mockito to run tests
@RunWith(MockitoJUnitRunner.class)
public class CarResourceMockTest {

    @Mock // mock resource
    private CarResource carResource;

    // test should return car given color string name
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

        //test mockito language
        // when gone to carResource and look for color
        // return all cars found into cars array
        Mockito.when(carResource.findCarByColor(color)).thenReturn(cars);

        // execute test
        // populate list with cars found by color at resource
        List<Car> carsResponse = carResource.findCarByColor(color);

        //assertion car response color and model is equal color and model
        assertEquals(carsResponse.get(0).getColor(), color);
        assertEquals(carsResponse.get(0).getModel(), model);
    }


}
