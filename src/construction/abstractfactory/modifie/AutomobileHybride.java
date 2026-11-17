package construction.abstractfactory.modifie;

/**
 * PRODUIT CONCRET : automobile de la famille HYBRIDE.
 * Classe AJOUTEE par rapport a l'exemple 2 du cours.
 */
public class AutomobileHybride extends Automobile {

    @Override
    public void methodeAutomobile() {
        System.out.println("AutomobileHybride : moteur 1200 cm3 + batterie 1,3 kWh, "
                + "mode 100 % electrique en ville");
    }
}
