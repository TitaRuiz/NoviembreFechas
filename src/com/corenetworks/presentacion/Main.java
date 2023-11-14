package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o1.getClass());


        Producto p1 = new Producto(1,5);

        Producto p2 = new Producto(1,5);
        Producto p3 = p1;

        System.out.println(p1.toString());
        System.out.println("Equals de producto " + p1.equals(p2));
        System.out.println("Equals de producto " + p1.equals(p3));
        System.out.println("Hash code -> " + p1.hashCode());
        System.out.println("Hash code -> " + p2.hashCode());
        System.out.println(p1.getClass());
        //Probar método iva
        System.out.println("IVA -> " + p1.iva());
        LocalDate hoy = LocalDate.now();

    }
}