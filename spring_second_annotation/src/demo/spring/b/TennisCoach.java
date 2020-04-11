package demo.spring.b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	//For the field injection--> it will happen with the help of reflection 
	@Autowired
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;
	public TennisCoach() {
		System.out.println("Tennis Coach with default constructor");
	}
	//define Setter injection
//	@Autowired
//	public void setFortuneService(FortuneService thefortuneService) {
//		fortuneService = thefortuneService;
//	}
	//now I will give our own custom method name
	@Autowired
//	public void doSomeCrazyStuff(FortuneService theFortuneService) {
//		System.out.println("inside the doSomeCrazzyStuff method");
//		fortuneService=theFortuneService;
//	}
	
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
