import java.util.Random;
import java.util.Scanner;

public class teste4 {
    
    static void sortNum(){
        
        Random rand = new Random();
        Random bluble = new Random();
        int[] num1 = new int [20];
        int[] num2 = new int [20];
        int resposta =1;
        Scanner tutu = new Scanner (System.in);
        do{
        Principal.limpaTela();
        //assimilando random primeira array
        System.out.print("Vetor 1: ");
        for (int i = 0; i < num1.length; i++) {
            num1[i] = rand.nextInt(51);
        }for (int i = 0; i < num1.length; i++) {
            System.out.print(" "+ num1[i]+" ");
        }
        System.out.println();


        //assimilando random segunda array
        System.out.println("__________________________________________________________________________________\n");
        System.out.print("Vetor 2: ");
        for (int i = 0; i < num2.length; i++) {
            num2[i] = bluble.nextInt(51);
        }for (int i = 0; i < num2.length; i++) {
            System.out.print(" "+num2[i]+" ");
        }
        System.out.println();
        System.out.println("__________________________________________________________________________________\n");
        System.out.println("Numeros encontrados em ambas matrizes: ");
        for(int x : num1){ 
            for(int y : num2){
                if(x == y){
                    System.out.print("["+x+", "+y+"]\n");
                    break;
                }
            }

        }
    
    System.out.println("Para voltar digite 0 (zero) ");
    resposta = tutu.nextInt();
    }while(resposta == 1);

    }


}
