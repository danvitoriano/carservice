package br.com.fiap.carservice;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

// repository custom mapping and rel
// path
// collection resource
@RepositoryRestResource(path = "cars",collectionResourceRel = "cars")
public interface CarResource extends PagingAndSortingRepository<Car, Integer> {

    // a list of cars method find by color param
    List<Car> findCarByColor(@Param("color") String color);
}
