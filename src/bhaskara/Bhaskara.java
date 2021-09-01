package bhaskara;

import java.util.Scanner;

public class Bhaskara {
        
    public static void main(String[] args){
       
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Calculando a fórmula de Bhaskara");
       System.out.println("Digite o valor de A: ");
       double a = scan.nextDouble();
       System.out.println("Digite o valor de B: ");
       double b = scan.nextDouble();
       System.out.println("Digite o valor de C: ");
       double c = scan.nextDouble();
       
       
        try{
            double delta = (b*b)-(4*a*c);
            if(delta<0){
                throw new excecaoDelta ();
            }
            else{
                double x1 = ((-b + Math.sqrt(delta))/(2*a));
                double x2 = ((-b - Math.sqrt(delta))/(2*a));

                System.out.println("x1 = " +(x1)+ "," + "x2 = " +(x2));
            }

        }catch(excecaoDelta e){
            System.out.println("Por favor, insira valores válidos!");
        }
   }
       
}
