package se.iths;

public class TextProcessor {

    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public String upperString(String str) {
        return str.toUpperCase();
    }

    public String lowerString(String str) {
        return str.toLowerCase();
    }

}
