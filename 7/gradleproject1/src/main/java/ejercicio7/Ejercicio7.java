
/*Zavala Concha Silvia Nallely*/


package ejercicio7;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio7 {
    
    
    
    
    public static void main(String[] args){
     Scanner sc = new Scanner (System.in);
        int x,y;
        System.out.println("Ingrese el numero de filas: ");
        x=sc.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        y=sc.nextInt();
        
        
        int[][] matriz = new int[x][y];
        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        inicializar(matriz);
        System.out.println("\nMatriz original\n");
        visualizar(matriz);     
        transponerMatriz(matriz, transpuesta);
        System.out.println("\n\nMatriz transpuesta\n");
        visualizar(transpuesta);
    }
     
    static void transponerMatriz(int[][] matriz, int[][] transpuesta){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                transpuesta[j][i] = matriz[i][j];
            }
        }
    }
    
    static void inicializar(int[][] matriz){
         Random r = new Random();
          Scanner sc = new Scanner (System.in);
          int a;
         System.out.println("Ingresa hasta que numero termina los numeros aleatorios: ");
         a=sc.nextInt();
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j] = r.nextInt(a) + 1; 
            }
        }
    }
 
    static void visualizar(int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        }
}