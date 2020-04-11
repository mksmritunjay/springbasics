package demo.spring.a;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] arg) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println("Result :" + theCoach.getDailyWorkOut());
		System.out.println("Reuslt1:" + theCoach.getDailyFortune());

		context.close();
	}
}
 