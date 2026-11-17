package construction.abstractfactory.modifie;

/** FABRIQUE CONCRETE : toute la famille ELECTRIQUE. */
public class FactoryElectrique implements AbstractFactory {

    @Override
    public Automobile construireAutomobile() {
        return new AutomobileElectrique();
    }

    @Override
    public Scooter construireScooter() {
        return new ScooterElectrique();
    }

    @Override
    public String categorie() {
        return "ELECTRIQUE";
    }
}
