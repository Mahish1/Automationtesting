package karateframe;

import com.github.javafaker.Faker;

public class anthor {
	public static String random() {
		
		Faker faker=new Faker();
		String name=faker.name().firstName().toLowerCase()+faker.random().nextInt(1,4);
		return name;
	}
		public static String relly() {
			Faker faker=new Faker();

		
		 String job=faker.name().lastName().toUpperCase()+faker.random().nextInt(1, 88);
		return job;
		
	}

		}
