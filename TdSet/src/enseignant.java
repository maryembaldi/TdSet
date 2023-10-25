public class enseignant implements Comparable<enseignant> {

    private int id;
    private String nom;
    private String prenom;

    public enseignant() {
    }

    public enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null) return false;
        if (o.getClass() != this.getClass())
            return false;
        enseignant e = (enseignant) o;
        if (e.id == id)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public int compareTo(enseignant e) {
        int resultatNom = this.nom.compareTo(e.nom);
        if (resultatNom != 0) {
            return resultatNom;
        }

        int resultatPrenom = this.prenom.compareTo(e.prenom);
        if (resultatPrenom != 0) {
            return resultatPrenom;
        }
        return Integer.compare(e.id, this.id);
    }

}

