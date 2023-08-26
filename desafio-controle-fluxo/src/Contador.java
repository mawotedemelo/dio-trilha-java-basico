import java.util.Scanner;

public class Contador{

    public static void main(String [] args){
        int parametroUm, parametroDois;
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        parametroUm = terminal.nextInt();
        
        System.out.println("Digite o segundo parametro: ");
        parametroDois = terminal.nextInt();

        try{
              contar(parametroUm, parametroDois);

        }
        catch(ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        int contagem;
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
    
        contagem = parametroDois - parametroUm;

        for(int indice = 1; indice <= contagem; indice++){
            System.out.print("Imprimindo o numero " + indice);
            if(indice != contagem){
                System.out.print(", ");
            }
            else{
                System.out.print(".");
            }
        }

       

    }
}