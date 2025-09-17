package karateframe;

import com.intuit.karate.junit5.Karate;
import com.intuit.karate.junit5.Karate.Test;

public class frame {
	//@Test
	//public Karate  test() {
		//return Karate.run("Get").relativeTo(getClass());
		
	//}
	@Test
	public Karate  ma() {
		return Karate.run("konfig").relativeTo(getClass());
		
	}


}
