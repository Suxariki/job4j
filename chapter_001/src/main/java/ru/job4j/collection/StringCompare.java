package ru.job4j.collection;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Comparator;
import java.util.Iterator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int length = Math.min(left.length(), right.length());
        int result = 0;

        for (int index = 0; index < length; index++) {
            int char1 = left.charAt(index);
            int char2 = right.charAt(index);
            if (char1 != char2) {
                result = char1 - char2;
                break;
            }
        }

        if (result == 0 && left.length() != right.length()) {
            result = left.length() - right.length();
        }

        return result;
    }
}