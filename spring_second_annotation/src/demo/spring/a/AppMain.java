package demo.spring.a;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] arg) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach beetaCoach = context.getBean("tennisCoach", Coach.class);
		
		//System.out.println("Reuslt1:" + theCoach.getDailyFortune());
		//System.out.println("Result :" + theCoach.getDailyWorkOut());
		System.out.println("Address of the first object "+theCoach);
		System.out.println("Address of the second object "+beetaCoach);
		System.out.println("Result of equals method:"+theCoach.equals(beetaCoach));
		boolean result=theCoach==beetaCoach;
		System.out.println("Result with the help of equal operator : "+result);

		context.close();
	}
}
 