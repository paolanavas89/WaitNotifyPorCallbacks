package com.company;

public class PrincipalCamarero  {

    public PrincipalCamarero() throws InterruptedException {

        Camarero cam = new Camarero(this);
        cam.start();

    }
    public void coca(){
        System.out.println("Soy el camarero y Voy a añadir una " + Camarero.cocacola);
    }
    public void fanta(){
        System.out.println("Soy el camarero y Voy a añadir una " + Camarero.fanta);
    }
    public void vino(){
        System.out.println("Soy el camarero y Voy a añadir una " + Camarero.vino);
    }

}
