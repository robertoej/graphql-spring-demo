package br.com.rjr.graphqlspringdemo;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private CarDAO carDAO;

    public CarService(@Autowired CarDAO carRepository) {
        this.carDAO = carRepository;
    }

    @GraphQLQuery(name = "cars")
    public List<Car> getCars(){
        return carDAO.list();
    }

    @GraphQLQuery(name = "car")
    public Optional<Car> getCarById(@GraphQLArgument(name = "id") Long id){
        return carDAO.getById(id);
    }

    @GraphQLMutation(name = "saveCar")
    public Car saveCar(@GraphQLArgument(name = "car") Car car){
        return carDAO.save(car);
    }

    @GraphQLMutation(name = "deleteCar")
    public void deleteCar(@GraphQLArgument(name = "id") Long id){
        carDAO.deleteById(id);
    }
}
