import java.util.ArrayList;
import java.util.List;

public class Question {

    private int id;
    private String titre;
    List<Reponse> reponses;

    public Question(int id, String titre) {
        this.id = id;
        this.titre = titre;
        this.reponses = new ArrayList<>();
    }

    public void ajouterReponse(Reponse reponse) {
        this.reponses.add(reponse);
    }

    public Reponse getBonneReponse() {
        for (Reponse r : this.reponses) {
            if (r.estCorrecte()) {
                return r;
            }
        }
        return null;
    }

    public boolean verifierReponse(Position position) {
        for (Reponse r : this.reponses) {
            if (r.getPosition() == position && r.estCorrecte()) {
                return true;
            }
        }
        return false;
    }

    // Getter && Setters
    public int getId() { return this.id; }
    public void setId(int id) { this.id = id; }

    public String getTitre() { return this.titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public List<Reponse> getReponses() { return this.reponses; }

    @Override
    public String toString() {
        return "Question #" + this.id + " : " + this.titre;
    }
}