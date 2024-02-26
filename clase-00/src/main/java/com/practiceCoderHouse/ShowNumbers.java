package com.practiceCoderHouse;

public class ShowNumbers {

	public static void ShowDecimalAndInteger (float numeroFloat) {
        // obtiene la parte entera
        int parteEntera = (int) Math.floor(numeroFloat);

        // obtiene la parte decimal
        double parteDecimal = numeroFloat - parteEntera;

        // imprime resultados
        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);
	}
}
