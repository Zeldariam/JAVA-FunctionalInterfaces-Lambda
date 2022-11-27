import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<Etudiant> etudiants = new ArrayList<Etudiant>();
        etudiants.add(new Etudiant(1, "faza1", 21));
        etudiants.add(new Etudiant(2, "faza2", 22));
        etudiants.add(new Etudiant(3, "faza3", 23));
        ListEtudiant liste_etudiant = new ListEtudiant();

/*
        Consumer<Etudiant> consumer = new Consumer<Etudiant>() {
            @Override
            public void accept(Etudiant e) {
                System.out.println(e);
            }
        };
*/
        //Consumer<Etudiant> cons = (Etudiant e) -> System.out.println(e);
        //Consumer<Etudiant> cons =  e -> System.out.println(e);
        System.out.println("############ CONSUMER ###########################\n");
        liste_etudiant.afficherEtudiants(etudiants, e -> System.out.println(e));
/*
        Predicate<Etudiant> pred = new Predicate<Etudiant>() {
            @Override
            public boolean test(Etudiant e) {
                return e.getAge()>=18 && e.getAge()<23;
            }
        };
 */
        System.out.println("\n############ PREDICATE ###########################\n");
        Predicate<Etudiant> pred = e -> e.getAge()>=18 && e.getAge()<23;
        liste_etudiant.afficherEtudiantSelonFiltre(etudiants, pred, e -> System.out.println(e));

        System.out.println("\n############ FUNCTION ###########################");
        System.out.println(liste_etudiant.afficherNomEtudiant(etudiants, e -> e.getNom()));

        System.out.println("\n############ SUPPLIER ###########################\n");
        Supplier<Etudiant> supp = Etudiant::new;
        Etudiant nouveauEtudiant  = liste_etudiant.creeEtudiant(()->new Etudiant());
        System.out.println(nouveauEtudiant);

        //System.out.println("\n############ STREAM ###########################\n");
    }
}