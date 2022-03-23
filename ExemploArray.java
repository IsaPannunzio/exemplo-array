package com.company.array;

import java.util.Arrays;

public class ExemploArray {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};

        System.out.println("As notas do aluno A são: " + Arrays.toString(notasAlunoA));

        double totalAlunoA = 0;

        for(int i = 0; i < notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }

        System.out.println("A média do aluno A é: " + totalAlunoA / notasAlunoA.length);

        System.out.println("As notas do aluno B são: " + Arrays.toString(notasAlunoB));

        double totalAlunoB = 0;

        for(int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }

        System.out.println("A média do aluno B é: " + totalAlunoB / notasAlunoB.length);

        //Para exibir o valor em uma posição específica:
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoB[2]);


    }
}
