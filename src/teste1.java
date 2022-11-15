import java.util.Scanner;

public class teste1 {
    
    static void addNum(){
        Principal.limpaTela();

        Scanner sc = new Scanner (System.in);
        
        int[] numeros = new int [8];
        int soma =0;
        
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Insira um numero:");
                numeros[i] = sc.nextInt();
            }
            for (int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i]);

                soma += numeros[i];
            }
            
        System.out.println("A media dos numeros informados é: "+soma/numeros.length);
        System.out.println("###################################");
        System.out.println("VOLTANDO AO MENU INICIAL");
        for (int i = 0; i < 5; i++) {
            System.out.print(".");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
       
    }

    }




}
