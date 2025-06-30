package posto_de_combustivel;

import java.util.Scanner;


public class PostoDeCombustivel 
{
    private double valor, litros;
    private String escolha;
    
    Scanner leia = new Scanner(System.in);
      
public void Inicio()
{
    System.out.println("Vai querer gasolina ou álcool?\n");
    escolha =leia.next();
    switch(escolha)
        {
            case "gasolina":
                System.out.println("quantos litros?: ");
                litros=leia.nextDouble();
                if(litros<=20)
                {
                    //erro
                    valor = (((litros*5.50)*4)/100);
                    System.out.println("O total: "+valor);
                }
                else if(litros>20)
                {
                    valor = (((litros*5.50)*6)/100);
                    System.out.println("O total: "+valor);
                    
                }
            break;
            case "álcool":
                System.out.println("quantos litros?: ");
                litros=leia.nextDouble();
                if(litros<=20)
                {
                    //erro
                    valor = (((litros*4.50)*3)/100);
                    System.out.println("O total: "+valor);
                }
                else if (litros>20)
                {
                    valor = (((litros*4.50)*5)/100);
                    System.out.println("O total: "+valor);
                }
            break;
            default:
                System.out.println("Não entendi, tente novamente.");
        }
    }
}