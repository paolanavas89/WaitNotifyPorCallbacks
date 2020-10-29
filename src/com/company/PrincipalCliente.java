package com.company;

public class PrincipalCliente {
    public PrincipalCliente() throws InterruptedException {

                Cliente cli = new Cliente(this);
                cli.start();
    }
    public void beber(){
        for (int i = 0; i < Main.barraDelBar.size(); i++) {
            System.out.println("Voy a beberme un " + Main.barraDelBar.get(i));
        }
    }
    public void espera(){
        System.out.println("Espero a que traigan más comida ");
    }
}
