package Semana3;

public class Bike {
    //Atributos
    public String marca;
    public Integer qtdMarchas;
    public String cor;

    //metodos
    public void andar()
    {
        System.out.println("\nAndando na Bike da " + this.marca + " com " + this.qtdMarchas + " marchas e da cor " + this.cor);
    }

    public void frear()
    {
        System.out.println("\nFreiando na Bike da " + this.marca + " com " + this.qtdMarchas + " marchas e da cor " + this.cor);
    }
}
