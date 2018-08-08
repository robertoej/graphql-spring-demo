package br.com.rjr.graphqlspringdemo;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class CarDAO {
    List<Car> database = Arrays.asList(new Car(1l, "Car 1"), new Car(2l, "Car 2"));

    public List<Car> list() {
        return database;
    }


    public Optional<Car> getById(Long id) {
        return database
                .stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }

    public Car save(Car car) {
        database.add(car);

        return car;
    }


    public void deleteById(Long id) {
        database = database
                .stream()
                .filter(c -> !c.getId().equals(id))
                .collect(Collectors.toList());
    }
}
