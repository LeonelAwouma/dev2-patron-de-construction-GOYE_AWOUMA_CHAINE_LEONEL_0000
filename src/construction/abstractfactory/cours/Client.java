package construction.abstractfactory.cours;

/**
 * CLIENT.
 * Il connait les TYPES de produits (ProduitA, ProduitB) mais jamais leur
 * famille : changer de famille revient a changer une seule ligne, celle
 * qui choisit la fabrique.
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("=== Abstract Factory : exemple du cours ===");

        IProduitFactory produitFactory1 = new ProduitFactory1();
        IProduitFactory produitFactory2 = new ProduitFactory2();

        ProduitA produitA = null;
        ProduitB produitB = null;

        System.out.println("Utilisation de la premiere fabrique");
        produitA = produitFactory1.getProduitA();
        produitB = produitFactory1.getProduitB();
        produitA.methodeA();
        produitB.methodeB();

        System.out.println("Utilisation de la seconde fabrique");
        produitA = produitFactory2.getProduitA();
        produitB = produitFactory2.getProduitB();
        produitA.methodeA();
        produitB.methodeB();
    }
}
