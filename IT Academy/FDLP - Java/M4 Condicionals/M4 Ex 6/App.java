import java.util.Scanner;
public class App {
	

    public static void main (String[] arg) {
    	
    
        Scanner input = new Scanner (System.in);
       
        System.out.println("Pon tu día de nacimiento");
       
        int dia = input.nextInt ();
       
        System.out.println ("Inserta el numero de tu mes de nacimiento");
       
        int mes = input.nextInt ();
        
        
        	switch (mes) {
        
        		
        		case 1 : if (dia<=19) {
        			
        					System.out.println("Eres capricornio");
        		}
        		
        				else if (dia>=20) {
        					
        					System.out.println("Eres acuario");
        					
        				}
        		break;
        	
        		
        		case 2 : if (dia<=18) {
        			
							System.out.println("Eres acuario");
        		}
		
						else if (dia>=19) {
					
							System.out.println("Eres piscis");
					
				}
        		break;
        		
        		
        		case 3 : if (dia<=20) {
        			
							System.out.println("Eres piscis");
        		}
		
						else if (dia>=21) {
					
							System.out.println("Eres Aries");
					
				}
        		break;
        		
        		
        		case 4 : if (dia<=19) {
        			
							System.out.println("Eres Aries ");
        		}

						else if (dia>=20) {
			
							System.out.println("Eres Tauro");
			
				}
        		break;
        		
        		
        		case 5 : if (dia<=20) {
        			
							System.out.println("Eres Tauro");
        		}

						else if (dia>=21) {
			
							System.out.println("Eres Geminis");
			
				}
        		break;
        		
        		
        		
        		case 6 : if (dia<=20) {
        			
							System.out.println("Eres Geminis");
        		}

						else if (dia>=21) {
			
							System.out.println("Eres Cancer");
			
				}
        		break;
        		
        		
        		
        		case 7 : if (dia<=22) {
        			
							System.out.println("Eres Cancer");
        		}

						else if (dia>=23) {
			
							System.out.println("Eres Leo");
			
				}
        		break;
        		
        		
        		
        		case 8 : if (dia<=23) {
        			
							System.out.println("Eres Leo");
        		}

						else if (dia>=24) {
			
							System.out.println("Eres Virgo");
			
				}
        		break;
        		
        		
        		
        		case 9 : if (dia<=22) {
        			
							System.out.println("Eres Virgo");
        		}

						else if (dia>=23) {
			
							System.out.println("Eres Libra");
			
				}
        		break;
        		
        		
        		
        		case 10 : if (dia<=22) {
        			
							System.out.println("Eres Libra");
        		}

						else if (dia>=23) {
			
							System.out.println("Eres Escorpio");
			
				}
        		break;
        		
        		
        		
        		case 11 : if (dia<=21) {
        			
							System.out.println("Eres Escorpio");
        		}

						else if (dia>=22) {
			
							System.out.println("Eres Sagitario");
			
				}
        		break;
        		
        		
        		
        		case 12 : if (dia<=21) {
        			
							System.out.println("Eres Sagitario");
        		}

						else if (dia>=22) {
			
							System.out.println("Eres Capricornio");
			
				}
        		break;

        		 default:
     			    System.out.println("Prueba con otra fecha");
     		
        
        
        
        }
        
        
        
        
        
    }
    
}   