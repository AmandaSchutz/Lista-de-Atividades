import java.util.Scanner;

public class SalHoras {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

         Float horas;
         Float sal;
                  
          sal = (horas*10.50);

         System.out.println("Digite horas trabalhadas: ");
         horas = ler.nextFloat();

         System.out.println(sal);
}
}
            
