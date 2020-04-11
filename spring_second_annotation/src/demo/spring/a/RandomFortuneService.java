package demo.spring.a;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	//Create an array of String
	private String[] data= {"beaware of the wolg","delegation of the person ","my journy to bangalore"};
	
	//create a random number generator 
	private Random myRandom=new Random();
	
	@Override
	public String getFortune() {
	
		//pick a random string form the array 
		int index=myRandom.nextInt(data.length);
		String theFortune=data[index];
		
		return theFortune;
	}

}
