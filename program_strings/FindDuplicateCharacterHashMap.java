package program_strings;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacterHashMap {

	public static void main(String[] args) {
		find_Duplicate("maarjavamitjava");

	}

	public static void find_Duplicate(String word) {

		char[] wo = word.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (Character ch : wo) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}

		}
		System.out.println(charMap);

	}
}
