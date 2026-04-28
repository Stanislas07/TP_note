import java.util.ArrayList;
import java.util.List;

public class Quiz {

    private int id;
    private String nom;
    private Categorie categorie;
    Redacteur redacteur;
    List<Question> questions;

    public Quiz(int id, String nom, Categorie categorie, Redacteur redacteur) {
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
        this.redacteur = redacteur;
        this.questions = new ArrayList<>();
    }

    public void ajouterQuestion(Question question) {
        questions.add(question);
    }

    public int getNombreQuestions() {
        return questions.size();
    }

    /** Un quiz est valide s'il possède au moins 5 questions. */
    public boolean estValide() {
        return questions.size() >= 5;
    }

    public List<Partie> getResultats() {
        // À relier avec la couche de persistance ou un gestionnaire de parties
        throw new UnsupportedOperationException("Non implémenté.");
    }

    // Getters & setters

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public Categorie getCategorie() { return categorie; }
    public void setCategorie(Categorie categorie) { this.categorie = categorie; }

    public Redacteur getRedacteur() { return redacteur; }

    public List<Question> getQuestions() { return questions; }

    @Override
    public String toString() {
        return "Quiz #" + id + " — " + nom + " (" + categorie + ")";
    }
}