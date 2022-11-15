import java.util.Random;
import java.util.Scanner;

public class teste5 {
    
    
    static void sortNum(){
        Random momo = new Random();
        int[] numeros = new int[10];
        int resposta =0;
        int opcao=0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = momo.nextInt(51);
        }
        Scanner sc = new Scanner(System.in);
        Scanner lolo = new Scanner(System.in);
        int temp=0;  
        
        do {
            Principal.limpaTela();
            System.out.println("ESCOLHA UMA OPCAO: ");
            System.out.println("[1] - Exibir Array");
            System.out.println("[2] - Exibir maior e menor numero da Array");
            System.out.println("[3] - sortear Array novamente");
            System.out.println("[4] - Voltar ao menu inicial.");
            opcao = sc.nextInt();
            switch (opcao){
            case 1:
                Principal.limpaTela();
                System.out.println("Array gerada randomicamente: ");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.print(" ["+numeros[i]+"] ");
                }
                System.out.print("Pra voltar digite 0: ");
                resposta = lolo.nextInt();
            break;

            case 2:
                Principal.limpaTela();
                for (int i = 0; i < numeros.length; i++){   
                      
                    for (int j = i + 1; j < numeros.length; j++) {   
                        //colocando em ordem crescente:
                        if (numeros[i] > numeros[j])   
                            {  
                                temp = numeros[i];  
                                numeros[i] = numeros[j];  
                                numeros[j] = temp;  
                            }  
                    }  
                }
                for (int i = 0; i < numeros.length; i++) {
                
                }
                System.out.println("Menor numero da Array: "+numeros[0]+"\nMaior numero da array: "+numeros[9]); 
                System.out.print("Pra voltar digite 0: ");
                resposta = lolo.nextInt();
            break;

            case 3:

                System.out.println("Sorteando ...");
                     try { Thread.sleep(1000);
                        } catch (InterruptedException e) {
                             e.printStackTrace();}                      
                for (int i = 0; i < numeros.length; i++) {
                numeros[i] = momo.nextInt(51);
                }
                System.out.println("Pronto!");
                System.out.print("\nPra voltar digite 0: ");
                resposta = lolo.nextInt();
            break;

            case 4: 
            System.out.println("SAINDO");
                    try {Thread.sleep(1200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();}
            resposta = 25;
            break;

                    }//acaba switch
        }while(resposta==0);
    }
}
