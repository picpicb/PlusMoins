package esipe.fr;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Bienvenue dans le jeu Plus ou Moins !" );
        System.out.println( "Quel est votre prénom ?" );
        Scanner scan = new Scanner(System.in);
        User user = new User();
        user.setPrenom(scan.nextLine());
        while(true){
            GameEngine game = new GameEngine(user,new NbAleatoireService(1,1000));
            game.startGame();
            System.out.println( "Voulez-vous rejouer ? (y/n)" );
            String ans = scan.nextLine();
            switch (ans) {
                case "y":
                    break;
                case "n":
                    System.exit(0);
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }
}
