package com.dwivedy.poker;

public class PokerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new Deck().getRandom(Deck.DECKS));
		
		Child c = new Child();
    	System.out.println(c.name);
    	System.out.println(c.age);
//    	Child cm = (Child) new Parent();
    	
    	Parent p = new Child();
    	System.out.println(p.name);
    	//System.out.println(p.age); //compile error
//    	System.out.println(cm.age);

	}
	
	

}



class Parent {
	String name = "Vivek";
}
class Child extends Parent{
	int age = 30;
}
