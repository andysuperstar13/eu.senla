package eu.senla.task5;

import java.util.Arrays;

public class Ship {

    private int counter = 0;

    private double massWaterInShip;
    private Deck[] shipDeck = {};
    Ship() {
        determineQuantityShip();
    }

    void addDeckToShip(Deck deck) {
        if (counter < shipDeck.length){
            shipDeck[counter] = deck;
            counter++;
        }
    }

    int getCounter() {
        return counter;
    }

    double getMassWaterInShip() {
        return massWaterInShip;
    }

    int getNumberOfDecks(){
        return shipDeck.length;
    }

    void calculateMassWaterShip(){
        for (Deck deck : shipDeck) {
            massWaterInShip = massWaterInShip + (deck.getWeightDeck());
        }
    }

    private void determineQuantityShip(){
        if((int) (Math.random()*2)+1 == 1){
            createLengthShip(1);
        } else {
            createLengthShip(2);
        }
    }

    private void createLengthShip(int max) {
        for (int i = 0; i < max ; i++) {
            shipDeck = Arrays.copyOf(shipDeck, shipDeck.length+1);
        }
    }

    @Override
    public String toString() {
        StringBuilder array  = new StringBuilder();
        array.append("\n").append('{');
        for (int i = 0; i < shipDeck.length; i++) {
            if (i == 0){
                array.append((shipDeck[i]));
            }else {
                array.append(' ').append((shipDeck[i]));
            }
            if (i == shipDeck.length-1){
                array.append('}').append("\n");
                break;
            }
        }
        return "Ship " + "\n" + "Mass of water on the ship = " + massWaterInShip + array;
    }
}
