package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

public class HomePageLogin extends base {

	@Test
	public void basePageNavigation(String username, String password, String text) throws IOException {
		driver = initializeDriver();
		driver.get("http://qaclickacademy.com");
	}
}
