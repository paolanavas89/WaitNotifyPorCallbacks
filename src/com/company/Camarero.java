package com.company;

public class Camarero  extends Thread{
    PrincipalCamarero principalCamarero;
    Cliente cliente;
    public Camarero(PrincipalCamarero principalCamarero){
        this.principalCamarero = principalCamarero;
    }
    public static String cocacola = "Coca-Cola";
    public static String fanta = "Fanta";
    public static String vino = "Vino";
    @Override
    public void run() {
        try {
            Main.barraDelBar.add(cocacola);
            principalCamarero.coca();
            Main.barraDelBar.add(fanta);
            principalCamarero.fanta();
            Main.barraDelBar.add(vino);
            principalCamarero.vino();
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
