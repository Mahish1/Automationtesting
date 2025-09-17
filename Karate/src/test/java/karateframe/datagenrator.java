package karateframe;

import com.intuit.karate.junit5.Karate;
import com.intuit.karate.junit5.Karate.Test;

public class datagenrator {
	@Test
	public Karate  niha() {
		return Karate.run("anthor").relativeTo(getClass());
		
	}

}
