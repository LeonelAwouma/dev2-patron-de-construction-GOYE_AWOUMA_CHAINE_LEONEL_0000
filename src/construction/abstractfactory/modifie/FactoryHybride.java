package construction.abstractfactory.modifie;

/**
 * FABRIQUE CONCRETE : toute la famille HYBRIDE.
 * Classe AJOUTEE par rapport a l'exemple 2 du cours : elle implemente la
 * meme interface AbstractFactory, que l'on n'a pas eu besoin de modifier.
 */
public class FactoryHybride implements AbstractFactory {

    @Override
    public Automobile construireAutomobile() {
        return new AutomobileHybride();
    }

    @Override
    public Scooter construireScooter() {
        return new ScooterHybride();
    }

    @Override
    public String categorie() {
        return "HYBRIDE";
    }
}
