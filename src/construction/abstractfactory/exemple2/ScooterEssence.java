package construction.abstractfactory.exemple2;

/** PRODUIT CONCRET : scooter de la famille ESSENCE. */
public class ScooterEssence extends Scooter {

    @Override
    public void methodeScooter() {
        System.out.println("ScooterEssence : moteur thermique 125 cm3, "
                + "plein en 2 minutes");
    }
}
