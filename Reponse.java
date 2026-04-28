public class Reponse {

    private String texte;
    private boolean bonne_reponse;
    private Position position;

    public Reponse(String texte, boolean bonne_reponse, Position position) {
        this.texte = texte;
        this.bonne_reponse = bonne_reponse;
        this.position = position;
    }

    public boolean estCorrecte() {
        return bonne_reponse;
    }

    public Position getPosition() {
        return position;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public boolean isBonne_reponse() {
        return bonne_reponse;
    }

    public void setBonne_reponse(boolean bonne_reponse) {
        this.bonne_reponse = bonne_reponse;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return position + ". " + texte + (bonne_reponse ? " [CORRECTE]" : "");
    }
}