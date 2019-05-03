package project_stant;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class stant_test {

	public static void main(String[] args) {

		String fileName = "C:\\proposals.txt";

		File arq = new File(fileName);

		System.out.println("Organization of lectures\n");
		System.out.println("Track A:\n");
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader fileBuffer = new BufferedReader(fileReader);

			String line = fileBuffer.readLine();

			int time = 0;
			int lineTime;

			while (line != null) {

				if (line.matches("(.*)lightning(.*)")) {
					lineTime = Integer.parseInt(line.replaceAll("(.*)lightning(.*)", "5"));
					time += lineTime;
					System.out.println("\n" + lineTime);
					System.out.println(line);
					// System.out.println(time);
				} else {
					lineTime = Integer.parseInt(line.replaceAll("[^0-9]+", ""));
					time += lineTime;
					System.out.println("\n" + lineTime);
					// System.out.println(time);

					System.out.println(line);
				}

				if (time == 180) {
					System.out.println("\nAlmoço");
				}

				// System.out.printf("%s\n", line + "\n");
				// int firstTime = Integer.parseInt(line.replaceAll("[^0-9]+",
				// ""));
				// System.out.println(firstTime);
				line = fileBuffer.readLine();

				// if (firstAccountant == 4) {
				// System.out.println("Almoço\n");

				// }

			}

			System.out.println("\nTrack B:\n");

			// int secondAccountant = 11;
			// while (line != null && secondAccountant < 21) {
			// System.out.printf("%s\n", line + "\n");
			// int secondTime = Integer.parseInt(linha.replaceAll("[^0-9]+",
			// " "));
			// System.out.println(secondTime);
			// line = fileBuffer.readLine();

			// secondAccountant++;

			// if (secondAccountant == 15) {
			// System.out.println("Almoço\n");

			// }

			// }

			fileBuffer.close();

		} catch (IOException e) {
			System.err.printf("Error opening file: %s.\n", e.getMessage());

		}

	}

}
