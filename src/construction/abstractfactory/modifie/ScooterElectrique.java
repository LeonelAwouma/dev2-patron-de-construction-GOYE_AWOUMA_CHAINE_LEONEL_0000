package construction.abstractfactory.modifie;

/** PRODUIT CONCRET : scooter de la famille ELECTRIQUE. */
public class ScooterElectrique extends Scooter {

    @Override
    public void methodeScooter() {
        System.out.println("ScooterElectrique : moteur 4 kW, "
                + "autonomie 90 km");
    }
}
