package org.prog.cars;


import org.prog.Turn;

//TODO: create classes Lorry -> Cargo Truck -> Truck -> Car
//TODO: write method that describes how this Car turns
//TODO: Override turn method for Cargo Truck and Lorry (see Samsung generations for example)
// TODO: Add any method to ICar interface and implement it in Ford, Honda and Tesla
public class Car {


    public class Turn {
        public class Vechicle {


            public static final Object TURN_LEFT = new Object();
            public static final Object TURN_RIGHT = new Object();

            public void turn(Object direction) {
                turn(direction == org.prog.Turn.Vehicle.TURN_LEFT ? -40 : 90);
            }
        }
    }
}
