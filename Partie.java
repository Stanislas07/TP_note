public class Partie {

    private int id;
    private int score;
    Quiz quiz;
    Joueur joueur;

    public Partie(int id, Quiz quiz, Joueur joueur) {
        this.id = id;
        this.quiz = quiz;
        this.joueur = joueur;
        this.score = 0;
    }

    public int calculerScore() {
        score++;
        return score;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    public Quiz getQuiz() { return quiz; }
    public Joueur getJoueur() { return joueur; }

    @Override
    public String toString() {
        return "Partie #" + id + " - " + joueur + " sur \"" + quiz.getNom()
                + "\" | Score : " + score + "/" + quiz.getNombreQuestions();
    }
}