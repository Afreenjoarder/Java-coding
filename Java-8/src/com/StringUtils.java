package com;
public class StringUtils {
	public static String replaceSpaces(String str) {
	    if (str == null) {
	        return null;
	    }
	    int spaceCount = 0;
	    for (int i = 0; i < str.length(); i++) {
	        if (str.charAt(i) == ' ') {
	            spaceCount++;
	        }
	    }
	    char[] charArray = new char[str.length() + (spaceCount * 2)];
	    int index = 0;
	    for (int i = 0; i < str.length(); i++) {
	        if (str.charAt(i) == ' ') {
	            charArray[index++] = '%';
	            charArray[index++] = '2';
	            charArray[index++] = '0';
	        } else {
	            charArray[index++] = str.charAt(i);
	        }
	    }
	    return new String(charArray);
	}

	
}

