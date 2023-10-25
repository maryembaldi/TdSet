// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {

        GestionEnseignant espritHashSet = new EspritHashSet();
        GestionEnseignant espritTreeSet = new EspritTreeSet();

        enseignant enseignant1 = new enseignant(1, "maryem", "baldi");
        enseignant enseignant2 = new enseignant(2, "fatma", "lajmi");
        enseignant enseignant3 = new enseignant(3, "emna", "aid");

        espritHashSet.ajouterEnseignant(enseignant1);
        espritHashSet.ajouterEnseignant(enseignant2);
        espritHashSet.ajouterEnseignant(enseignant3);

        System.out.println("Enseignants dans EspritHashSet :");
        espritHashSet.displayEnseignants();
        System.out.println("Recherche d'un enseignant par ID : " + espritHashSet.rechercherEnseignant(2));
        espritHashSet.supprimerEnseignant(enseignant1);
        System.out.println("Enseignants après suppression :");
        espritHashSet.displayEnseignants();

        espritTreeSet.ajouterEnseignant(enseignant2);
        espritTreeSet.ajouterEnseignant(enseignant3);
        espritTreeSet.ajouterEnseignant(enseignant1);

        System.out.println("Enseignants dans EspritTreeSet :");
        espritTreeSet.displayEnseignants();
        System.out.println("Recherche d'un enseignant par ID : " + espritTreeSet.rechercherEnseignant(3));
        espritTreeSet.supprimerEnseignant(enseignant2);
        System.out.println("Enseignants après suppression :");
        espritTreeSet.displayEnseignants();

        // Création de la liste d'enseignants
        TreeSet<enseignant> enseignants = new TreeSet<>();
        enseignants.add(new enseignant(1, "Imed", "ahmed"));
        enseignants.add(new enseignant(2, "Maya", "chour"));
        enseignants.add(new enseignant(3, "nour", "gaidi"));

        // Tri par nom croissant
        TreeSet<enseignant> enseignantsTriesParNom = Tri.triParNomCroissant(enseignants);

        // Affichage de la liste d'enseignants triée par nom croissant
        System.out.println("Enseignants triés par nom croissant:");
        for (enseignant enseignant : enseignantsTriesParNom) {
            System.out.println(enseignant);
        }

        // Tri par id décroissant
        TreeSet<enseignant> enseignantsTriesParId = Tri.triParIdDecroissant(enseignants);

        // Affichage de la liste d'enseignants triée par id décroissant
        System.out.println("\nEnseignants triés par id décroissant:");
        for (enseignant enseignant : enseignantsTriesParId) {
            System.out.println(enseignant);
        }
    }
}


