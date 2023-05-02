package com.alusionista;
import java.util.Scanner;

public class Leitura {
    public static String inData(String descricao) {
        Scanner sc = new Scanner(System.in);
        System.out.print(descricao + ": ");
        return sc.nextLine();
    }
}
