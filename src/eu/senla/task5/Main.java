package eu.senla.task5;

import eu.senla.task5.container.Container;
import eu.senla.task5.container.ContainerCone;
import eu.senla.task5.container.ContainerCube;
import eu.senla.task5.container.ContainerCylinder;

public class Main {
    public static void main(String[] args) {

        Port port = new Port((int)(Math.random()*10)+1);
        while (port.getCounter() < port.getNumberOfShips()){
            port.addShipToPort(createShip());
        }
        port.calculateMassWaterInPort();
        System.out.println(port);
    }

    private static Ship createShip() {
        Ship ship = new Ship();
        ship.addDeckToShip(createDeck());
        while (ship.getCounter() < ship.getNumberOfDecks() ){
            ship.addDeckToShip(createDeck());
        }
        ship.calculateMassWaterShip();
        return ship;
    }

    private static Deck createDeck() {
        Deck deck = new Deck(createContainer());
        while (deck.getCounter() < deck.getLengthToDeck() ){
            deck.addContainerToDeck(createContainer());
        }
        deck.calculateMassWaterDeck();
        return deck;
    }

    private static Container createContainer(){
        Container container = null;
        switch ((int)(Math.random()*3)+1){
            case 1: {
                container = new ContainerCone();
                break;
            }
            case 2: {
                container = new ContainerCube();
                break;
            }
            case 3: {
                container =  new ContainerCylinder();
                break;
            }
        }
        return container;
    }
}
