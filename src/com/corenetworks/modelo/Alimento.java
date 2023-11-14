package com.corenetworks.modelo;

public class Alimento extends Producto
{

    public Alimento(int idProducto) {
        super(idProducto);
    }
    /*
    No se puede sobre escribir un método final
    public  double iva(){
        return precio * 0.21;
    }*/

}
