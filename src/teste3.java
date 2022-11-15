import java.util.Random;

import java.util.Scanner;
public class teste3 {
    
    static void numRand(){
        
        int sair = 0;
        int[] numero = new int [6];
        Random rand = new Random();
        Scanner luna = new Scanner(System.in);
        boolean check=false;
        int pos = 0;
        int nono =0;
        
        do{
            Principal.limpaTela();
        for (int i = 0; i < numero.length; i++) {
            numero[i] = rand.nextInt(11);
        }

        System.out.println("TENTE ADIVINHAR UM NUMERO QUE POSSUA DENTRO DA MATRIZ: ");
        int guess = luna.nextInt();

            int cont =0;
            for(int x : numero ){
            cont++;
            if(x == guess){
                check = true;
                pos +=cont;
                nono +=x;
                
                break;
            }
            } 
      
        if(check==true){
            System.out.println("Voce encontrou um numero! \nNumero: "+nono);
            System.out.println("Posicao: "+pos);
            System.out.println("########################################");
            System.out.println("GABARITO:");
            for (int i = 0; i < numero.length; i++) {
                System.out.println(numero[i]);
            }
        }else{
            System.out.println("Voce nao encontrou nenhum numero :(");
            System.out.println("########################################");
            System.out.println("GABARITO:");
            for (int i = 0; i < numero.length; i++) {
                System.out.println(numero[i]);
            }
        }


        
        Scanner ju = new Scanner (System.in);
        System.out.println("Para voltar ao menu anterior digite '0' ");
        sair = ju.nextInt();
        if(sair == 0){
            return;
        }
    }while(sair == 1);
    
    
}

}
