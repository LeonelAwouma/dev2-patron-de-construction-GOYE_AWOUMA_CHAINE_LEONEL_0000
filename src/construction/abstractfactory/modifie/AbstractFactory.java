package construction.abstractfactory.modifie;

/**
 * FABRIQUE ABSTRAITE.
 * Elle declare la construction de toute la famille : un scooter ET une
 * automobile de la meme categorie.
 *
 * Remarque de convention : le diagramme du cours note ces operations
 * ConstruireAutomobile() et ConstruireScooter() ; en Java, un nom de methode
 * commence par une minuscule, d'ou construireAutomobile().
 */
public interface AbstractFactory {

    Automobile construireAutomobile();

    Scooter construireScooter();

    String categorie();
}
