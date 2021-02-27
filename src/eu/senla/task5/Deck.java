package eu.senla.task5;

import eu.senla.task5.container.Container;

import java.util.Arrays;

public class Deck {

    private Container[] deck = {};
    private int counter = 1;
    private double massDeck;

    double getWeightDeck() {
        return massDeck;
    }
    Deck(Container container) {
        int diagonal = container.getDiagonal();
        determineLengthDeck(diagonal);
        deck[0] = container;
    }

    void addContainerToDeck(Container container){
        if (container.getDiagonal() == deck[0].getDiagonal()){
            deck[counter] = container;
            counter++;

        }
    }

    int getCounter() {
        return counter;
    }

    int getLengthToDeck(){
        return deck.length;
    }

    private void determineLengthDeck(int diagonal) {
        if (diagonal == 10){
            createLengthDeck(4);
        }
        if (diagonal == 20){
            createLengthDeck(2);
        }
    }

    private void createLengthDeck(int max) {
        for (int i = 0; i < max ; i++) {
            deck = Arrays.copyOf(deck, deck.length+1);
        }
    }

    void calculateMassWaterDeck(){
        for (Container value : deck) {
            massDeck = massDeck + (value.getVolume() * value.getDensity());
        }
    }

    @Override
    public String toString() {
        StringBuilder array  = new StringBuilder();
        for (int i = 0; i < deck.length; i++) {
            if (i == 0){
                array.append((deck[i]));
            } else {
                array.append("       ").append((deck[i]));
            }
            if (i == deck.length-1){
                array.append("\n").append("      ]");
                break;
            }
            array.append(", ").append("\n");
        }
        return "Deck [" + array +  "\n";
    }
}
