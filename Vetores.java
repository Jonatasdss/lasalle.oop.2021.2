/* 
 nome: Jonatas dos Santos de Sales
 matricula: 0050015649 
*/ 
import java.util.*;

    public class Vetores{
        public static void main(String[] args) {

            Scanner x = new Scanner(System.in);
            int n = 10;
            Vector<Integer> vet = new Vector<Integer>(n);

            for(int i=0; i<10; i++)
            {
                System.out.printf("Digite um número: ");
                    vet.add(x.nextInt());
            }
            Collections.sort(vet);
            System.out.println("Números na ordem crescente: " + vet);
        }
    }
