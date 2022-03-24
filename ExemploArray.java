package com.company.array;

import java.util.Arrays;
import java.util.Scanner;

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

        System.out.println("\nAs notas do aluno B são: " + Arrays.toString(notasAlunoB));

        double totalAlunoB = 0;

        for(int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }

        System.out.println("A média do aluno B é: " + totalAlunoB / notasAlunoB.length);

        //Utilizando foreach
        System.out.println("\nNotas do aluno A: ");
        for(double notaA: notasAlunoA){
            System.out.println(notaA);


        }
        System.out.println("\nNotas do aluno B: ");
        for(double notaB: notasAlunoB){
            System.out.println(notaB);
        }

        //Para exibir o valor em uma posição específica:
        System.out.println("\nA nota do aluno A na posição 0 é: " + notasAlunoA[0]);
        System.out.println("A nota do aluno B na posição 2 é: " + notasAlunoB[2]);

        //Utilizando scanner
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nQuantas notas o aluno C possui? ");

        int qtdNotasC = entrada.nextInt();

        double[] notasAlunoC = new double[qtdNotasC];

        for(int i = 0; i < notasAlunoC.length; i++){
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notasAlunoC[i] = entrada.nextDouble(); //Dependendo da máquina, pode ser necessário informar o valor com vírgula ao invés de ponto
        }

        double totalAlunoC = 0;
        for(double notaC: notasAlunoC){
            totalAlunoC += notaC;

        }

        System.out.println("\nA média das notas do aluno C é: " + (totalAlunoC / notasAlunoC.length));
        entrada.close();
    }
}
