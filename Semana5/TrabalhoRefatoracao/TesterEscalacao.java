package TrabalhoRefatoracao;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class TesterEscalacao {
    
    public static void main(String[] args) {

        Time time = new Time();
        Escalacao escalacao = new Escalacao();
    
        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
        Scanner scanner = new Scanner(System.in);
    
        Jogador jog1 = new Jogador();
        Jogador jog2 = new Jogador();
        Jogador jog3 = new Jogador();
        Jogador jog4 = new Jogador();
        Jogador jog5 = new Jogador();
    
        time.setNome(JOptionPane.showInputDialog("Entre com nome do time:"));
    
        System.out.println("Informe o nome do jogador 1: ");
        jog1.setNome(scanner.nextLine());
        jogadores.add(jog1);
    
        System.out.println("Informe o nome do jogador 2: ");
        jog2.setNome(scanner.nextLine());
        jogadores.add(jog2);
    
        System.out.println("Informe o nome do jogador 3: ");
        jog3.setNome(scanner.nextLine());
        jogadores.add(jog1);
    
        System.out.println("Informe o nome do jogador 4: ");
        jog4.setNome(scanner.nextLine());
        jogadores.add(jog4);
    
        System.out.println("Informe o nome do jogador 5: ");
        jog5.setNome(scanner.nextLine());
        jogadores.add(jog5);

    	System.out.print("Digite o dia do jogo: ");
    	int dia = scanner.nextInt();
    	System.out.print("Digite o mês do jogo: ");
    	int mes = scanner.nextInt();
        System.out.print("Digite o ano do jogo: ");
    	int ano = scanner.nextInt();
    
        System.out.println(escalacao.getImprimir(jogadores));
        System.out.println("Data do jogo: "+dia+"/"+mes+"/"+ano);
        System.out.println("Time: " + time.getNome());
        System.out.println("---------------");
    
        System.out.println("1 - " + jog1.getNome());
        System.out.println("2 - " + jog2.getNome());
        System.out.println("3 - " + jog3.getNome());
        System.out.println("4 - " + jog4.getNome());
        System.out.println("5 - " + jog5.getNome());
    }
}


