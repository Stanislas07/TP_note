import java.util.ArrayList;
import java.util.List;

public class Redacteur {
    private String nom;
    private String prenom;
    List<Quiz> quiz_rediges;

    public Redacteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.quiz_rediges = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Rédacteur {Nom : " + this.nom + ", Prenom " + this.prenom + "}"; 
    }

    public List<Quiz> getQuizRediges() {
        return this.quiz_rediges;
    }

    public void ajouterQuiz(Quiz quiz) {
        this.quiz_rediges.add(quiz);
    }

    // Getters & Setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
 
    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
}
