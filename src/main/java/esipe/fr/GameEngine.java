package esipe.fr;

import java.util.Scanner;

public class GameEngine{
    private int nb;
    private INBAleatoireService randService;
    private User user;
    private boolean stop;
    Scanner scan;

    public GameEngine(User user, INBAleatoireService randService){
            scan = new Scanner(System.in);
            this.randService = randService;
            this.user = user;
            stop = false;
            nb = randService.getNbAlea();
    }


    public void startGame(){
        stop = false;
        System.out.println("Bonjour "+ user.getPrenom() + ", votre meilleur score est : "+ user.getScore());
        System.out.println( "Entrez une valeur" );
        int cpt = 0;
        while (!stop){
            cpt ++;
            int userEntry = scan.nextInt();
            if(isCorrect(userEntry)){
                stop = true;
            }else{
                if(userEntry > nb){
                    System.out.println( "Moins !!" );
                }else{
                    System.out.println( "Plus !!" );
                }
            }
        }
        System.out.println( "Bravo !" );
        saveBestScrore(cpt,user);

    }

    public void saveBestScrore(int score, User user){
        if(score < user.getScore() || user.getScore() == 0 ) {
            user.setScore(score);
        }
    }

    public boolean isCorrect(int nombre){
        if(nombre == this.nb){
            return true;
        }else{
            return false;
        }
    }

}