package karateframe;

import com.intuit.karate.junit5.Karate;
import com.intuit.karate.junit5.Karate.Test;

public class Postcall {
	@Test
	public Karate  test() {
		return Karate.run("Testdatagenrator").relativeTo(getClass());
	}
}
