package selenium;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class LearnPropertyClass {

	public static void main(String[] args) {
		Properties prop = new Properties();

		try {
			InputStream in = new FileInputStream("src/main/resources/Env_SIT.properties");

			prop.load(in);

			System.out.println(prop.get("host"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
