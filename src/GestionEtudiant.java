import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface GestionEtudiant {
    public void afficherEtudiants(List<Etudiant> etudiants,  Consumer<Etudiant> cons);
    public void afficherEtudiantSelonFiltre(List<Etudiant> etudiants, Predicate<Etudiant> predicate,  Consumer<Etudiant> cons);
    public String afficherNomEtudiant(List<Etudiant> etudiants, Function<Etudiant, String> f);
    public Etudiant creeEtudiant(Supplier<Etudiant> supp);
    public Stream convertListStream(List<Etudiant> l);
}