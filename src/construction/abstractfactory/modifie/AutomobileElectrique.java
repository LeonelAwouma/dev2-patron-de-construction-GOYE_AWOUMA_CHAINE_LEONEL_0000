package construction.abstractfactory.modifie;

/** PRODUIT CONCRET : automobile de la famille ELECTRIQUE. */
public class AutomobileElectrique extends Automobile {

    @Override
    public void methodeAutomobile() {
        System.out.println("AutomobileElectrique : batterie 60 kWh, "
                + "autonomie 400 km");
    }
}
