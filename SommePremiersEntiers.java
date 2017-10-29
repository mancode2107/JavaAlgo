import java.util.Scanner;

/**
 * Cette classe clacul la somme des n premiers entiers
 * on utilsant trois algorithmes :
 *
 * l'itération, la méthode de Gauss et la récursivité.
 *
 * @author Mohammed GHALMI
 * @version 1.0
 *
 */

public class SommePremiersEntiers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int limiteCalcul;
        System.out.print("Limite du calcul de la somme: ");
        limiteCalcul = input.nextInt();

        System.out.println("La somme par itération " + sommeIteation(limiteCalcul));
        System.out.println("La somme méthode Gauss " + sommeGauss(limiteCalcul));
        System.out.println("La somme récursive     " + sommeRecursive(limiteCalcul));
    }

     static int sommeIteation( int n) {
         int result = 0;
         for (int i = 0; i <= n; i++)
             result += i;

         return result;
    }

    static int sommeRecursive(int n) {
        if (n == 0)
            return 0;
        else
            return( n + sommeRecursive(n - 1));
    }

    static int sommeGauss(int n ) {

        return (n*(n + 1)) / 2;
    }

}
