package org.prog.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapsDemo {

    public static void main(String[] args) {
        
HashMap<String, List<Car>> carOwners= new HashMap<>();
        carOwners.put("John", new ArrayList<>());
        carOwners.put("Jane", new ArrayList<>());
        carOwners.put("Bob", new ArrayList<>());
        carOwners.put("Alice", new ArrayList<>());
        carOwners.put("Pete", new ArrayList<>());
        carOwners.put("Kate", new ArrayList<>());

        registerCar("John",new  Car(CarColors.BLACK),carOwners);
        registerCar("John",new  Car(CarColors.RED),carOwners);
        registerCar("Jane",new  Car(CarColors.GREEN),carOwners);
        registerCar("Bob",new  Car(CarColors.WHITE),carOwners);
        registerCar("Alice",new  Car(CarColors.RED),carOwners);
        registerCar("Pete",new  Car(CarColors.BLACK),carOwners);
        registerCar("Kate",new  Car(CarColors.WHITE),carOwners);
        List<String> ownerOfCarsWithSpecificColor= new ArrayList<>();
        Set<String>ownersNames=carOwners.keySet();
        for (String owner : ownersNames) {
            List<Car> carsBelongingToThisOwner = carOwners.get(owner);
            for (Car c : carsBelongingToThisOwner){
                if (c.carColor.equals(CarColors.WHITE)){
                    ownerOfCarsWithSpecificColor.add(owner);
                }
            }
        }
        for(String o : ownerOfCarsWithSpecificColor){
            System.out.println(o);
        }
    }
    private static void registerCar(String owner,Car car,HashMap<String, List<Car>>cars){
        List<Car> johnsCars= cars.get(owner);
        johnsCars.add(car);
        System.out.println(johnsCars);

        }
    }

