import java.util.Scanner;

public class SalHoras2 {
        public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Float sal, horas;
        
        sal= horas*10.50 ;

        System.out.println("Digite horas trabalhadas: ");
        horas = ler.nextInt();

        if (sal<50){
            System.out.println("Atenção,dirija-se a direção do hotel!");
        } 
        else{
            System.out.println("Seu salário é de:"+sal);   
        }

    }
}
