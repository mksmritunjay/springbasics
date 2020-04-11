package demo.spring.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	FortuneService fortuneService;
	public TennisCoach() {
		System.out.println("Tennis Coach with default constructor");
	}
	//define Setter injection
	@Autowired
	public void setFortuneService(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	
	//with the help of constructor injection
//	@Autowired
//	public TennisCoach(FortuneService thefortuneService) {
//		fortuneService = thefortuneService;
//	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "We need to do workOut for Tennis Coach of getDailyWorkOut";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
