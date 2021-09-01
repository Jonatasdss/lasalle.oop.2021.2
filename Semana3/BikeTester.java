package Semana3;

public class BikeTester {
    public static void main(String[] args) {
        Bike bike = new Bike();

        bike.marca = "Soul";
        bike.qtdMarchas = 6;
        bike.cor = "Preta";

        bike.andar();
        bike.frear();
    }
}
