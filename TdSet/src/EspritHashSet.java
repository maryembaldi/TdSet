import java.util.HashSet;
import java.util.Set;

public class EspritHashSet implements GestionEnseignant {
    private Set<enseignant> enseignants = new HashSet<>();

    @Override
    public void ajouterEnseignant(enseignant e) {
        enseignants.add(e);
    }

    @Override
    public boolean rechercherEnseignant(enseignant e) {
        return enseignants.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        for (enseignant enseignant : enseignants) {
            if (enseignant.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEnseignant(enseignant e) {
        enseignants.remove(e);
    }

    @Override
    public void displayEnseignants() {
        for (enseignant enseignant : enseignants) {
            System.out.println(enseignant);
        }
    }
}
