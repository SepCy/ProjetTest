package projettest;



import java.util.Scanner;

public class FigureGeometrique{
    int longueur;
    int largeur;




      Scanner sc = new Scanner (System.in);
   
     public void shapeRectangle(){
      
       
       System.out.println("Entrez la longueur");   
       
       longueur=sc.nextInt();
      
       System.out.println("Entrez la larguer"); 
       largeur=sc.nextInt();
       
      for(int i=1; i<=largeur; i++){
          for(int j=2; j<=longueur; j++){
              System.out.print("* ");
          }
          System.out.println("* ");
              
   
        }
    
    }
}



