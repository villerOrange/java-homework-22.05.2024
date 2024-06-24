package org.example.hw_22_05_2024;

public class NumberConversion {
    public static void main(String[] args) {
        // Перевод из 16-ричной в 10-ричную
        String hexNumber = "333";
        int decimalFromHex = Integer.parseInt(hexNumber, 16);
        System.out.println("333 в 16-ричной системе равно " + decimalFromHex + " в 10-ричной системе");

        // Перевод из 10-ричной в 16-ричную
        int decimalNumber = 819;
        String hexFromDecimal = Integer.toHexString(decimalNumber);
        System.out.println("819 в 10-ричной системе равно " + hexFromDecimal + " в 16-ричной системе");

        // Перевод из 2-ричной в 10-ричную
        String binaryNumber = "101101";
        int decimalFromBinary = Integer.parseInt(binaryNumber, 2);
        System.out.println("101101 в 2-ричной системе равно " + decimalFromBinary + " в 10-ричной системе");

        // Перевод из 10-ричной в 2-ричную
        int decimalToConvert = 124;
        String binaryFromDecimal = Integer.toBinaryString(decimalToConvert);
        System.out.println("124 в 10-ричной системе равно " + binaryFromDecimal + " в 2-ричной системе");
    }
}
