import java.util.Scanner;

public class CalcApp {

    
    
    static public void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        Double numUm;
        Double numDois;
        String operacao;
        Boolean continuar;

         do{
        System.out.println("Digite o valor 1: ");
        numUm = scan.nextDouble();
        
        System.out.println("O que deseja fazer (+, -, * ou /) ");
        operacao = scan.next();
        
        System.out.println("Digite o valor 2: ");
        numDois = scan.nextDouble();
        
        System.out.println("resultado: " + realizarOperacao(numUm, numDois, operacao) + "\n" );
       
        continuar = verificarOperacaoNova();
        
        }while(continuar);

        
   
    }
    public static boolean verificarOperacaoNova(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Deseja continuar operando ? (S ou N)");
        return !sc.nextLine().toUpperCase().equals("N");
    }
    
    public static Double realizarOperacao( Double numUm,Double numDois, String operacao ){
        
        Double resul = 0.0;
        
        switch(operacao){
            case "+":
                resul = numUm + numDois;
            break;
            case "-":
                resul = numUm - numDois;
            break;
            case "*":
                resul = numUm * numDois;
            break;
            case "/":
                resul = numUm / numDois;
            break;
            
            default:
                System.out.println("Digite uma operação válida");
            break;
        }
            
        return resul;
    }
}

