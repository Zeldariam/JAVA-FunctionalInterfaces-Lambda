import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ListEtudiant implements GestionEtudiant{
    @Override
    public void afficherEtudiants(List<Etudiant> etudiants, Consumer<Etudiant> cons) {
        for (Etudiant e: etudiants) {
            cons.accept(e);
        }
    }

    @Override
    public void afficherEtudiantSelonFiltre(List<Etudiant> etudiants, Predicate<Etudiant> predicate, Consumer<Etudiant> cons) {
        for (Etudiant e: etudiants) {
            if (predicate.test(e)){
                cons.accept(e);
            }
        }
    }

    @Override
    public String afficherNomEtudiant(List<Etudiant> etudiants, Function<Etudiant, String> f) {
        String nomsEtudiants ="";
        for (Etudiant e : etudiants){
            nomsEtudiants+="\n"+f.apply(e);
        }
        return nomsEtudiants;
    }

    @Override
    public Etudiant creeEtudiant(Supplier<Etudiant> supp) {
        return supp.get();
    }

    @Override
    public Stream convertListStream(List<Etudiant> l) {
        return null;
    }
}
