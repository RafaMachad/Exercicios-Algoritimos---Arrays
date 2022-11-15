import java.util.Scanner;

public class teste2 {
    
    static void addNum(){
        Principal.limpaTela();

        Scanner sc = new Scanner (System.in);
        Scanner abiledebob = new Scanner (System.in);
        int[] numeros = new int [10];
        int resposta =2;

        while(resposta !=1){
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Insira um numero:");
                numeros[i] = sc.nextInt();
            }
                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] %2 == 0) {
                        System.out.println("Numero par: "+numeros[i] +" -e sua posição na matriz é: "+i);
                        }
                        }
            System.out.println("Gostaria de voltar ao menu inicial? \n[1] - Sim.\n[2] - Nao.");
            resposta = abiledebob.nextInt();
        }
        
    }


}
