package com.java.lang;

public class DoubleDemo {

    public static void main(String[] args) {
        @SuppressWarnings("removal")
		Double d1 = new Double(3.14159);
        @SuppressWarnings("removal")
		Double d2 = new Double(314159E-5);
        System.out.println(d1 + " = " + d2 + "-> " + d1.equals(d2));
    }
}
