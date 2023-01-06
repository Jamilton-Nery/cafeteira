import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static String entrada2;

    public static void main(String[] args) {

        int [] opcoes = {1, 2, 3, 4};
        int cafe = opcoes[0];
        int leite = opcoes[1];
        int chocolate = opcoes[2];
        int chaMate = opcoes[3];

        System.out.println("O que gostaria de beber?");
        System.out.println(cafe + "-Café");
        System.out.println(leite + "-Leite");
        System.out.println(chocolate + "-Chocolate");
        System.out.println(chaMate + "-Cha Mate");

            Scanner input1 = new Scanner(System.in);
            int entrada1 = Integer.valueOf(input1.next());

            if (entrada1 == cafe){
                System.out.println("1 = Não, 2 = Sim.");
                System.out.println("Algo mais?");

                Scanner in1 = new Scanner(System.in);
                int out1 = Integer.valueOf(in1.next());

                if (out1 == opcoes[0]){
                    System.out.println("Seu café estará pronto em 30s!");
                    return;
                } else {
                    System.out.println("Por favor qual a segunda opção?");

                    Scanner in12 = new Scanner(System.in);
                    int out12 = Integer.valueOf(in12.next());

                    if (out12 == leite){
                        System.out.println("Seu Café com leite estará pronto em 30s!");
                        return;
                    } else {
                        System.out.println("Opção invalida!");
                        return;
                    }
                }
            } else if (entrada1 == leite){
                System.out.println("1 = Não, 2 = Sim.");
                System.out.println("Algo mais?");

                Scanner in2 = new Scanner(System.in);
                int out2 = Integer.valueOf(in2.next());

                if (out2 == opcoes[0]){
                    System.out.println("Seu leite estará pronto em 30s!");
                } else {
                    System.out.println("Por favor qual a segunda opção?");

                    Scanner in21 = new Scanner(System.in);
                    int out21 = Integer.valueOf(in21.next());

                    if (out21 == chocolate){
                        System.out.println("Seu Achocolatado estará pronto em 30s!");
                        return;
                    } else {
                        System.out.println("Seu Leite está pronto em 30s!");
                        return;
                    }
                }

            } else if (entrada1 == chocolate){
                System.out.println("1 = Quente, 2 = Gelado.");

                Scanner in3 = new Scanner(System.in);
                int out3 = Integer.valueOf(in3.next());

                if (out3 == opcoes[0]){
                    System.out.println("Seu chocolate quente estará pronto em 30s!");
                } else {
                    System.out.println("Seu chocolate gelado estará pronto em 30s!");
                }
            } else if (entrada1 == chaMate) {
                System.out.println("Seu chá estará pronto em 30s");
            }
            return;
        }
    }
