package eu.senla.task5;

import java.util.Arrays;

class Port {
    private Ship[] port = {};
    private int counter = 0;
    private double massWaterInPort;

    Port(int max) {
        createLengthShip(max);
    }

    void addShipToPort(Ship ship) {
        if (counter < port.length){
            port[counter] = ship;
            counter++;
        }
    }

    int getCounter() {
        return counter;
    }

    int getNumberOfShips(){
        return port.length;
    }

    private void createLengthShip(int max) {
        for (int i = 0; i < max ; i++) {
            port = Arrays.copyOf(port, port.length+1);
        }
    }

    void calculateMassWaterInPort(){
        for (Ship ship : port) {
            massWaterInPort = massWaterInPort + (ship.getMassWaterInShip());
        }
    }

    @Override
    public String toString() {
        StringBuilder array  = new StringBuilder();
        for (int i = 0; i < port.length; i++) {
            array.append((port[i]));
            if (i == port.length-1){
                array.append(']').append("\n");
                break;
            }
        }
        return "Port : " + "\n" +
                "Total mass of water on the port = " + massWaterInPort + "\n" +
                "Quantity ships in the port = " + port.length + "\n" + "\n" +
                array;
    }
}
