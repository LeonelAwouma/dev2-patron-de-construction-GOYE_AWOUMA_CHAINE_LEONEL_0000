package construction.abstractfactory.modifie;

/**
 * CLIENT de l'exemple modifie.
 *
 * Point de depart : l'exemple 2 du cours (scooters et automobiles, categories
 * ESSENCE et ELECTRIQUE). Modification : le constructeur lance une gamme
 * HYBRIDE.
 *
 * Ce qui a ete ajoute : ScooterHybride, AutomobileHybride, FactoryHybride et
 * une ligne dans choisirFabrique(). Aucune classe existante n'a ete modifiee,
 * et la methode presenter() est strictement celle du cours.
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("=== Abstract Factory : exemple modifie (famille HYBRIDE) ===");

        String categorie = (args.length > 0) ? args[0] : "HYBRIDE";
        presenter(choisirFabrique(categorie));

        // le meme code metier, applique successivement aux trois familles
        System.out.println();
        System.out.println("=== Les trois familles avec le meme code ===");
        String[] categories = {"ESSENCE", "ELECTRIQUE", "HYBRIDE"};
        for (String c : categories) {
            presenter(choisirFabrique(c));
        }
    }

    /** Code metier : identique quelle que soit la categorie. */
    private static void presenter(AbstractFactory fabrique) {
        System.out.println("-- Categorie : " + fabrique.categorie() + " --");
        Scooter scooter = fabrique.construireScooter();
        Automobile automobile = fabrique.construireAutomobile();
        scooter.methodeScooter();
        automobile.methodeAutomobile();
    }

    private static AbstractFactory choisirFabrique(String categorie) {
        if ("ESSENCE".equalsIgnoreCase(categorie)) {
            return new FactoryEssence();
        }
        if ("ELECTRIQUE".equalsIgnoreCase(categorie)) {
            return new FactoryElectrique();
        }
        if ("HYBRIDE".equalsIgnoreCase(categorie)) {   // ligne ajoutee
            return new FactoryHybride();
        }
        throw new IllegalArgumentException("Categorie inconnue : " + categorie);
    }
}
