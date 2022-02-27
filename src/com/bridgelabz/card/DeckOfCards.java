package com.bridgelabz.card;

import java.util.Random;

public class DeckOfCards {
	
	 public static void shuffle(String card[])
	    {        
	        Random random = new Random();    
	        for (int i = 0; i < card.length; i++)
	        {
	            int r = i + random.nextInt(52 - i);
	              
	             //swapping the elements
	            String temp = card[r];
	             card[r] = card[i];
	             card[i] = temp;
	        }
	        }
    
	public static void main(String[] args) {
		
	    String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
	    String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	    String[][] playCards = new String[4][9];
	    
	    String[] card = new String[52];
	    shuffle(rank);
	    

	}

}
