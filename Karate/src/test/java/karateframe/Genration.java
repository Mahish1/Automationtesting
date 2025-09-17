package karateframe;

import com.github.javafaker.Faker;

public class Genration {
	
	public static String love() {
		
		Faker maa=new Faker();
		
		String name = maa.name().name().toLowerCase()+maa.random().toString();
		return name;
	}
		//public static String mahesh() {
		//	Faker dad=new Faker();

		//String job = dad.name().lastName().toUpperCase()+dad.random().nextInt(1,25);
		//return job;
		
		
	}

//}
