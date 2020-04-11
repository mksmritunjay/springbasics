package demo.spring.b;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAppMain {
	public static void main(String[] arg) {
		//load spring cofig file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		//in this example we have use the @Scope if we are not using the @Scope then it will behave as singleton and 
		//inside the @Scope we can pass prototype which make each time object 
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		Coach beetaCoach=context.getBean("tennisCoach",Coach.class);
		boolean result=alphaCoach==beetaCoach;
		System.out.println("Final result : "+result);
		System.out.println("With the help of equal operator : "+alphaCoach.equals(beetaCoach));
		
		context.close();
	}

}
