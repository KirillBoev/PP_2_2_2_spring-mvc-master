package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Mitsubishi", 10, 2013));
        carList.add(new Car("Ferrari", 6, 1999));
        carList.add(new Car("Mercedes", 8, 1983));
        carList.add(new Car("Skoda", 11, 2010));
        carList.add(new Car("BMW", 3, 2020));
    }

    @Override
    public List<Car> getListCars(int count) {
        if (count > 0 && count <= 5) {
            return carList.stream().limit(count).collect(Collectors.toList());
        } else {
            return carList;
        }
    }
}
