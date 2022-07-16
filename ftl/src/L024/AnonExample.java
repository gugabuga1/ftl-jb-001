package L024;

import animals.Flight;

public class AnonExample {
    public static void run(){
        Flight flight = new Flight() {
            @Override
            public void takeoff() {

            }

            @Override
            public void landing() {

            }
        };

        flight.landing();
        flight.takeoff();
    }
}
