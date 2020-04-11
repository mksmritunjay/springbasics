package demo.spring.b;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "implemented in HappyFortune class for getFortune";
	}
	

}
