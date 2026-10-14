package com.example.singleton;

import com.example.singleton.entidades.Carro;
import com.example.singleton.entidades.Singleton;
import com.example.singleton.entidades.Teste;
import javafx.application.Application;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
//        Application.launch(HelloApplication.class, args);
        Carro c1 = new Carro("azul neon", "camionete", "corola", 1500);
        Carro c2 = new Carro("rosa pink", "uno", "mitsubhishe", 1300);
        Carro c3 = new Carro("rosa", "golf", "volkswagen", 1945);

        Singleton.getInstancia().carros.add(c1);
        Singleton.getInstancia().carros.add(c2);
        Singleton.getInstancia().carros.add(c3);

        Teste teste = new Teste();
        teste.testar();

    }

}



