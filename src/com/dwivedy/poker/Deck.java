package com.dwivedy.poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Deck {
	
	static final  List<String> DECKS=Arrays.asList("A","K","Q","J","10","9","8","7","6","5","4","3","2",
			"A","K","Q","J","10","9","8","7","6","5","4","3","2",
			"A","K","Q","J","10","9","8","7","6","5","4","3","2"
			);
	
	public List<Hand> getRandom(List<String> deck){
		List<Hand> hands=new ArrayList<>();
		Random random = new Random();
		for(int p=0;p<4;p++) {
			List<String> handValue=new ArrayList<>();
			for(int h=0;h<3;h++) {
				handValue.add(deck.get(random.nextInt(deck.size())));
			}
			
			Hand hand= new Hand();
			hand.setHand(handValue);
			hands.add(hand);
		}
		
		return hands;
	}

}
