package construction.abstractfactory.modifie;

/**
 * PRODUIT CONCRET : scooter de la famille HYBRIDE.
 * Classe AJOUTEE par rapport a l'exemple 2 du cours.
 */
public class ScooterHybride extends Scooter {

    @Override
    public void methodeScooter() {
        System.out.println("ScooterHybride : moteur 50 cm3 + moteur electrique, "
                + "recharge au freinage");
    }
}
