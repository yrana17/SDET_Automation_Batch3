package excelhandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LearnCSV {

	public static void main(String[] args) {

		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("src/main/resources/test.csv")));
			String line;

			while ((line = reader.readLine()) != null) {

				System.out.println(line);

				String[] ar = line.split(",");

				for (String string : ar) {
					System.out.println(string);
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
