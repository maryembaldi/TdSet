import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Tri {

    public static TreeSet<enseignant> triParNomCroissant(TreeSet<enseignant> enseignants) {
        TreeSet<enseignant> enseignantsTriesParNom = new TreeSet<>(Comparator.comparing(enseignant::getNom));
        enseignantsTriesParNom.addAll(enseignants);
        return enseignantsTriesParNom;
    }

    public static TreeSet<enseignant> triParIdDecroissant(TreeSet<enseignant> enseignants) {
        TreeSet<enseignant> enseignantsTriesParId = new TreeSet<>(Comparator.comparingInt(enseignant::getId).reversed());
        enseignantsTriesParId.addAll(enseignants);
        return enseignantsTriesParId;
    }
}
