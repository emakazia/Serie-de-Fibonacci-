/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofibonacci;

/**
 *
 * @author Omar
 */
public class Fibonacci {
    
    private int tamaño;

    public Fibonacci() {
    }

    public Fibonacci(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    
    public int calculoFibonacci(int n){
    
    if(n>1){
       return calculoFibonacci(n-1)+calculoFibonacci(n-2);
    }
    else if(n==1){
      
        return 1;  
    }
    else if(n==0){
      
        return 0;
    }
    else{
        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
        return -1;
      }
    }
  
    
   public void imprimir(){
       
        for(int i=0; i<tamaño; i++){
        
            System.out.println(calculoFibonacci(i)+" ");
        }
    
    }
}
