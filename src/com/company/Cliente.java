package com.company;

public class Cliente extends Thread{

    PrincipalCliente principalCliente;
    public Cliente(PrincipalCliente principalCliente){
        this.principalCliente = principalCliente;
    }

    @Override
    public void run() {
        try {
                if (!Main.barraDelBar.isEmpty()) {
                    principalCliente.beber();
                    Main.barraDelBar.remove(0);
                    sleep(500);
                } else {
                    principalCliente.espera();
                }
            } catch(InterruptedException e){
                e.printStackTrace();
            }

    }

}
