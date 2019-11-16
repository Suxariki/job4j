package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        // проверить. что массив word имеет последние элементы одинаковые с post
        for (int i = post.length - 1; i >= 0; i--) {
            for (int j = 0; j < post.length; j++) {
                if (word[word.length-1-j] == post[post.length - 1-j]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
