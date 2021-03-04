package br.com.algoritimos;

import java.util.ArrayList;
import java.util.Scanner;

public class ConjuntosBonsOuRuins {
	
	static Scanner sc;
	
	public static void main(String[] args) {
		 
	  boolean encontrouPrefixo = false, naoPara = true;
	  int numeroDigitado = 0;
	  String descricaoLista;
	
	  sc = new Scanner(System.in);
	  			
      while(naoPara) {		
        		        		
    	numeroDigitado = sc.nextInt();				
				        		       
	    if (numeroDigitado == 0) {
	      naoPara = false;
		  continue;
		}
		        
		ArrayList<String>lista = new ArrayList<>();		
		   
		for(int i = 0; i < numeroDigitado; i++) {
		        			  		      			        
		  lista.add(sc.next().toLowerCase());
		        	
		}
		loop1:        
		while(lista.size()>0) { 
		        
		  descricaoLista = lista.get(0);
		  lista.remove(0);		        		 
		        
		  for(int i=0; i < lista.size();i++) {
		        			  		    		        			        			        			        
		    encontrouPrefixo = (descricaoLista.length() >= lista.get(i).length())? lista.get(i).equals(descricaoLista.substring(0, lista.get(i).length())): descricaoLista.equals(lista.get(i).substring(0, descricaoLista.length()));		        		
		        	
		    if (encontrouPrefixo) {
	          System.out.println("Conjunto Ruim");
	          break loop1;
	        			
	        }		        			        	
		  }		       
	    }
		 
	    if (!encontrouPrefixo) {
	      System.out.println("Conjunto Bom");
	    }
		        
	    encontrouPrefixo = false;
				
      }
	    
	}
}
