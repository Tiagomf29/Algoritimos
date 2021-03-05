package br.com.algoritimos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class EncontreMaiorSubstring {

  static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	
  public static void main(String[] args) throws IOException {
		
    String nome1, nome2, variavel = "";
    int vlr = 0;
    Queue<Integer>resultadoFinal = new LinkedList<>();
		
    while((nome1=sc.readLine())!=null && !nome1.isEmpty()){			
    nome2 = sc.readLine();
     	  
    nome1 = (nome1.length() > 50 ? nome1.substring(1,50) : nome1).replaceAll("[^a-zA-Z ]", "");
    nome2 = (nome2.length() > 50 ? nome2.substring(1,50) : nome2).replaceAll("[^a-zA-Z ]", "");
     	  
    for(int i=0; i < nome1.length();i++) { 
      if(variavel.equals(""))
        variavel = String.valueOf(nome1.charAt(i));
      else		 
        variavel = variavel+String.valueOf(nome1.charAt(i));		  				 		
       
      if(nome2.contains(variavel)) {		 					         		 				
        if(vlr < variavel.length()){
	  vlr = variavel.length();
	 }	 				
      }else
      {		 			  		 			  		 			  		 			  
        if(variavel.length() > 1) {
          i--;		 				  		 				  
        }
        variavel = "";
      }		 					 				 				 				 				 				 			
    }
		 			 			 	
    resultadoFinal.add(vlr);
    variavel = "";
    vlr = 0;		
 }       
 for(int a : resultadoFinal) {
   System.out.println(a);
 }
}
}
