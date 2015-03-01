package Marty.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by marty.farley on 3/1/2015.
 */
public class DiscardPile {
    private ArrayList<Card> discardPile;

    public Card drawFromDiscard()
    {
        Random generator = new Random();
        int index = generator.nextInt(discardPile.size());
        return discardPile.remove(index);
    }
}
