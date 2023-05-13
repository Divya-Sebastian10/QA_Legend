package com.qalegend.utilities;

import java.util.Random;

public class RandomUtility {

  public static String getRandomEmail() {
	String alphabet ="abcdefghijklmnopqrstuvxyz";
	StringBuilder builder = new StringBuilder();
	Random random = new Random();
	int length =5;
	for(int i=0;i<length;i++) {
		int index=random.nextInt(alphabet.length());
		char randomChar = alphabet.charAt(index);
		builder.append(randomChar);
	}
	String randomString = builder.toString() +"@gmail.com";
	return randomString;
	  
  }
  
}
