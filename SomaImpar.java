package ex1;

public class SomaImpar {
    public static void main(String[] args) {
       
       int somaImp = 0, multPar = 1;

             for(int i=0;i<=30;++i){  

                    if(i%2==0){

                           multPar *= i;  

                    } else {
                         
                       somaImp += i; 

                    }
               }

             System.out.println("A soma dos números ímpares de 0 a 30: "+ somaImp);
             System.out.println("A multiplicação dos números pares entre 0 e 30: "+ multPar);

      }

}