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
        Utilisateur user = new Utilisateur();
        user.setPrenom(scan.nextLine());
        GameEngine game = new GameEngine(user,new NbAleatoireService(1,10));
        while(true){
            game.startGame();
            System.out.println( "Voulez-vous rejouer ? (y/n)" );
            String ans = scan.nextLine();
            if(ans.equals("y")){
                game = new GameEngine(user,new NbAleatoireService(1,10));
                game.startGame();
            }else if(ans.equals("n")){
                System.exit(0);
            }else{
                System.exit(0);
            }
        }
    }
}
