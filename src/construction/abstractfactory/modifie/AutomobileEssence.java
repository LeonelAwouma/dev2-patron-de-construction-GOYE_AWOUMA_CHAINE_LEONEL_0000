package construction.abstractfactory.modifie;

/** PRODUIT CONCRET : automobile de la famille ESSENCE. */
public class AutomobileEssence extends Automobile {

    @Override
    public void methodeAutomobile() {
        System.out.println("AutomobileEssence : moteur 1600 cm3, "
                + "reservoir 50 litres");
    }
}
