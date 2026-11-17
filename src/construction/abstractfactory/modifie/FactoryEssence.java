package construction.abstractfactory.modifie;

/** FABRIQUE CONCRETE : toute la famille ESSENCE. */
public class FactoryEssence implements AbstractFactory {

    @Override
    public Automobile construireAutomobile() {
        return new AutomobileEssence();
    }

    @Override
    public Scooter construireScooter() {
        return new ScooterEssence();
    }

    @Override
    public String categorie() {
        return "ESSENCE";
    }
}
