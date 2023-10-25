public interface GestionEnseignant {
    void ajouterEnseignant(enseignant e);
    boolean rechercherEnseignant(enseignant e);
    boolean rechercherEnseignant(int id);
    void supprimerEnseignant(enseignant e);
    void displayEnseignants();
}
