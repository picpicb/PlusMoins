package esipe.fr;

public class Utilisateur{
    private String prenom;
    private int score;


    public Utilisateur (){

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }
}