package org.prog.cars;

public class CargoTrackLorry {
    public class Turn {
        public class Vehicle {


            public static final Object TURN_LEFT = new Object();
            public static final Object TURN_RIGHT = new Object();

            public void turn(Object direction) {
                turn(direction == org.prog.Turn.Vehicle.TURN_LEFT ? -40 : 40);
            }
        }
    }
}

