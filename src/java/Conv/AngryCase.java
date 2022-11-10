/*
 * Copyright (C) 2020 Mark Blokker ~ Ad-Blokker
 */
package Conv;

/**
 *
 * @author Mark Blokker ~ Ad-Blokker
 */
public class AngryCase {

	String output = "";

    public static String realAngryCase(String input) {
		// store result in builder
		StringBuilder builder = new StringBuilder();

		// shouldPlaceMarker indicates whether a period should be added or has already been added for the current
		// whitespace
		boolean shouldPlaceMarker = false;

		// convert input to upper case, as all characters will otherwise be uppercased in the loop
		input = input.toUpperCase();

		// iterate over input characters
		for (int i = 0; i < input.length(); i++) {
			char current = input.charAt(i);

			// check if current character is whitespace
			if (Character.isWhitespace(current)) {
				// append a period to the output if that has not been done already
				if (shouldPlaceMarker) {
					builder.append(".");
					shouldPlaceMarker = false;
				}

				// append current whitespace to the output buffer
				builder.append(current);

				// continue with the next character
				continue;
			}

			// append current character (non-whitespace) to the output buffer
			builder.append(current);

			// indicative to the next iteration that the previous character was not a whitespace character,
			// so that a period may be appended to the output buffer if a whitespace character was found.
			shouldPlaceMarker = true;
		}

		// end the sentence with a period.
		if (shouldPlaceMarker) {
			builder.append(".");
		}

		// return resulting output buffer
		return builder.toString();
    }

    void angryCaseConv(String input) {

		boolean lastCharDot = false;
		output += input.toUpperCase().charAt(0);

		for (int i = 1; i < input.length(); i++) {
			char text = input.charAt(i);
			if (text == '.') {
				continue;
			}

			if (Character.isWhitespace(text)) {
				output += ". ";
				if (i + 1 < input.length()) {
					i++;
					output += input.toUpperCase().charAt(i);
				}
			} else {
				output += input.charAt(i);
			}

			text = input.charAt(i);
			lastCharDot = text == '.' || text == '!' || text == '?';

		}
		if (!lastCharDot) {
			output += ".";
		}
	}
	
	String getAngryCase() {
        return output;
    }
}
