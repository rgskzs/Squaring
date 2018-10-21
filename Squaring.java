package src;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

	/**
	 * Iterate through each line of input.
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		while ((line = in.readLine()) != null) {
			try {
				int lineInt = Integer.parseInt(line);
				int line2 = lineInt * lineInt;
				System.out.println(line2);
			} catch (NumberFormatException e) {
				System.out.println("整数でないため終了");
				return;
			}
		}
	}
}
