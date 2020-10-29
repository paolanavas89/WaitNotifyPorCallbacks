package com.company;

import java.util.ArrayList;

public class Main {
    public static final ArrayList<String> barraDelBar = new ArrayList<>();
    public static void main(String[] args) {
        try {
                PrincipalCamarero cam = new PrincipalCamarero();
                PrincipalCliente cli = new PrincipalCliente();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
