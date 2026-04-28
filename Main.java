
public class Main {

    public static void main(String[] args) {

        // --- REDACTEUR ---
        Redacteur redacteur = new Redacteur("Dupont", "Marie");
        System.out.println(redacteur);

        // --- QUIZ ---
        Quiz quiz = new Quiz(1, "Culture Cinema", Categorie.CINEMA, redacteur);
        System.out.println("Quiz cree : " + quiz.getNom());

        // --- QUESTION 1 ---
        Question q1 = new Question(1, "Qui a realise Inception ?");
            Reponse r1a = new Reponse("Steven Spielberg", false, Position.A);
            Reponse r1b = new Reponse("Christopher Nolan", true, Position.B);
            Reponse r1c = new Reponse("James Cameron", false, Position.C);
            Reponse r1d = new Reponse("Ridley Scott", false, Position.D);

        q1.ajouterReponse(r1a);
        q1.ajouterReponse(r1b);
        q1.ajouterReponse(r1c);
        q1.ajouterReponse(r1d);

        quiz.ajouterQuestion(q1);

        // --- QUESTION 2 ---
        Question q2 = new Question(2, "Dans quel film entend-on 'I'll be back' ?");

        q2.ajouterReponse(new Reponse("RoboCop",      false, Position.A));
        q2.ajouterReponse(new Reponse("Total Recall", false, Position.B));
        q2.ajouterReponse(new Reponse("Terminator",   true,  Position.C));
        q2.ajouterReponse(new Reponse("Predator",     false, Position.D));

        quiz.ajouterQuestion(q2);

        System.out.println("Nombre de questions : " + quiz.getNombreQuestions());

        // --- JOUEURS ---
        Joueur joueur1 = new Joueur(1, "Martin", "Alice");
        Joueur joueur2 = new Joueur(2, "Bernard", "Lucas");
        System.out.println("Joueur 1 : " + joueur1);
        System.out.println("Joueur 2 : " + joueur2);

        // --- PARTIE 1 : Alice ---
        Partie partie1 = new Partie(1, quiz, joueur1);
        joueur1.ajouterPartie(partie1);

        // Alice repond correctement a Q1 et Q2
        boolean reponsejuste;

        reponsejuste = q1.verifierReponse(Position.B); // bonne reponse
        if (reponsejuste) { partie1.calculerScore(); }
        System.out.println("Alice Q1 : " + (reponsejuste ? "correct" : "incorrect") + " | score = " + partie1.getScore());

        reponsejuste = q2.verifierReponse(Position.C); // bonne reponse
        if (reponsejuste) { partie1.calculerScore(); }
        System.out.println("Alice Q2 : " + (reponsejuste ? "correct" : "incorrect") + " | score = " + partie1.getScore());

        System.out.println("Score final Alice : " + partie1.getScore());

        // --- PARTIE 2 : Lucas ---
        Partie partie2 = new Partie(2, quiz, joueur2);
        joueur2.ajouterPartie(partie2);

        reponsejuste = q1.verifierReponse(Position.A); // mauvaise reponse
        if (reponsejuste) { partie2.calculerScore(); }
        System.out.println("Lucas Q1 : " + (reponsejuste ? "correct" : "incorrect") + " | score = " + partie2.getScore());

        reponsejuste = q2.verifierReponse(Position.C); // bonne reponse
        if (reponsejuste) { partie2.calculerScore(); }
        System.out.println("Lucas Q2 : " + (reponsejuste ? "correct" : "incorrect") + " | score = " + partie2.getScore());

        System.out.println("Score final Lucas : " + partie2.getScore());

        // --- BILAN ---
        System.out.println("--- Bilan ---");
        System.out.println(partie1);
        System.out.println(partie2);
    }
}