import java.util.Scanner;

public class Menu{
    public static void main(String[] args){
    	int opcao;
    	
    	@SuppressWarnings("resource")
		Scanner menu = new Scanner(System.in);
    		    	
    	do {
    		System.out.println("|**********MENU********************|");
    		System.out.println("|**********Digite 1 para Opção 1*****************|");
    		System.out.println("|**********Digite 2 para Opção 2 *****************|");
    		System.out.println("|**********Digite 3 para Opção 3 - Sair**********|");
    		   		
		    		   
    		opcao = menu.nextInt();
        
    		switch(opcao){
            		case 1:
            			System.out.println("Você escolheu a primeira opção");
            		break;

            		case 2:
            			System.out.println("Você escolheu a segunda opção");
            		break;
            		
            		case 3:
            			System.out.println("O programa foi encerrado");
            		break;
            		
            		default:
            			System.out.println("Opcao Invalida!!!!!");

    		}
    		
    	}while (opcao != 3);{
			
		}  	
      		
    	
    }    	
    
}