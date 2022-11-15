import java.util.Scanner;

public class teste6 {
    static void sortVetor(){
        //[0,1,0,1,1,0,0,1,1,0,0,0,1,1,1,0,1,0,0,1
        Scanner sc = new Scanner (System.in);
        int resposta = 1;
        int[] v1 = {0,1,0,1,1,0,0,1,1,0,0,0,1,1,1,0,1,0,0,1};
        Principal.limpaTela();
        do{
        System.out.println("Array antes de sortear: ");
        for (int i = 0; i < v1.length; i++) {
            System.out.print(" ["+v1[i]+"] ");
        }

        System.out.println("\n___________________________________________________________________________");
        Sortear(v1, 20);
        System.out.println("Apos sorteio: ");
        for (int i = 0; i < v1.length; i++) {
            System.out.print(" ["+v1[i]+"] ");
        } 

        System.out.println("\nPara retornar digite 0 (zero)");

        resposta = sc.nextInt();
        if(resposta == 0){
            break;          
        }
    }while(resposta != 0);
    

    }
    public static int Sortear(int[]lol, int total){
        int temp;
    for (int i = 0; i < total; i++){   
                  
        for (int j = i + 1; j < total; j++) {   
            //colocando em ordem crescente:
            if (lol[i] > lol[j])   
                {  
                    temp = lol[i];  
                    lol[i] = lol[j];  
                    lol[j] = temp;  
                }  
        }  
    
    }
    return lol[0];
    }
}
