import java.util.ArrayList;
import java.util.List;

public class Joueur {

    private int id;
    private String nom;
    private String prenom;
    List<Partie> parties;

    public Joueur(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.parties = new ArrayList<>();
    }

    public void ajouterPartie(Partie partie) {
        parties.add(partie);
    }
    
    // Getters & setters

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public List<Partie> getParties() { return parties; }

    @Override
    public String toString() {
        return "Joueur {Nom : " + this.nom + ", Prenom " + this.prenom + "}"; 
    }
}