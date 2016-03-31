package me.lpk.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexr {
	/**
	 * Returns a list of all class matches in a description.
	 * 
	 * @param desc
	 * @return
	 */
	public static List<String> matchDescriptionClasses(String desc) {
		String pattern = "(?<=L).*?(?=[<;(])";
		Pattern pat = Pattern.compile(pattern);
		Matcher m = pat.matcher(desc);
		List<String> matches = new ArrayList<String>();
		while (m.find()) {
			matches.add(m.group());
		}
		return matches;
	}
}
