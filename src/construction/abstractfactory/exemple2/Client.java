package construction.abstractfactory.exemple2;

/**
 * CLIENT.
 * Il ne connait que les TYPES de produits (Scooter, Automobile) ; la
 * categorie n'est determinee qu'a l'execution, par l'argument de la ligne
 * de commande.
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("=== Abstract Factory : exemple 2 du cours ===");

        String categorie = (args.length > 0) ? args[0] : "ESSENCE";
        AbstractFactory fabrique = choisirFabrique(categorie);
        presenter(fabrique);

        // la meme suite d'instructions, avec l'autre famille
        AbstractFactory autre;
        if ("ELECTRIQUE".equalsIgnoreCase(categorie)) {
            autre = new FactoryEssence();
        } else {
            autre = new FactoryElectrique();
        }
        presenter(autre);
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
        throw new IllegalArgumentException("Categorie inconnue : " + categorie);
    }
}
