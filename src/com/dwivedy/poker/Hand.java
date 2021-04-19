package com.dwivedy.poker;

import java.util.List;

public class Hand {
	
	List<String> hand;

	public List<String> getHand() {
		return hand;
	}

	public void setHand(List<String> hand) {
		this.hand = hand;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hand == null) ? 0 : hand.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hand other = (Hand) obj;
		if (hand == null) {
			if (other.hand != null)
				return false;
		} else if (!hand.equals(other.hand))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Hand [hand=" + hand + "]";
	}
	
	

}
