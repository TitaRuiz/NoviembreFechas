package com.corenetworks.presentacion;

public class ProbarClasesEnvolventes {

    public static void main(String[] args) {
        //Tipos primitivos -> Convertirlos a objetos
        //BOXING
        int i = 5;
        Integer iEnvolvente = i;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        String numero = "5";
        System.out.println(Integer.parseInt(numero));
        System.out.println("Maximo valor de Long " +Long.MAX_VALUE);
        System.out.println("Mínimo valor de Long " +Long.MIN_VALUE);

        float sueldo = 1_500.50f;
        Float sEnvolvente = sueldo;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.parseFloat("1500.5"));
        System.out.println("Valor máximo de Character ->" +Character.MAX_VALUE);
        System.out.println("Valor mínimo de Character ->" +Character.MIN_VALUE);


        char letra = 'a';
        Character lEnvolvente = letra;
        System.out.println("Caracter envolvente -> " + lEnvolvente);
        //UNBOXING
        int i2 = iEnvolvente;
        System.out.println("Clase envolvente convertida a primitivo "+ i2);
        char letra2 = lEnvolvente;
        System.out.println("Character envolvente convertido a char  " + letra2);

    }
}
