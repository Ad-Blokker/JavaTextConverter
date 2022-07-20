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
