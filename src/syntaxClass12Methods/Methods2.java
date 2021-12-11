package com.syntaxClass12Methods;

public class Methods2 {
	
	void repeatWords(String word, int times) {
		for(int i=0;i<times;i++) {
			System.out.println(word);
		}
	}
	
	void isItRaning(boolean israin) {
		if(israin) {
			System.out.println("please take umbrella");
		}else {
			System.out.println("lets go for a walk");
		}
	}

}
