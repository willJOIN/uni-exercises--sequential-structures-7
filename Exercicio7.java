import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        float ladoQuadrado, areaQuadrado = 0;

        try {
            System.out.println("Digite o lado do quadrado:\n");
            Scanner scanner1 = new Scanner(System.in);
            ladoQuadrado = scanner1.nextFloat();

            scanner1.close();

            areaQuadrado = (ladoQuadrado * 2);
        } catch (Exception ex) {
            System.out.println("Erro ao pegar ladoQuadrado e/ou areaQuadrado no Exercicio7:\n" + ex);
        }
        System.out.println("O dobro da area do quadrado eh:\n" + areaQuadrado * 2 + "m²");
    }
}