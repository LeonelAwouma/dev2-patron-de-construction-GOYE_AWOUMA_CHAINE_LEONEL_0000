package construction.abstractfactory.cours;

/**
 * FABRIQUE ABSTRAITE.
 * Une seule interface declare la creation de TOUS les produits de la famille.
 * C'est la difference avec Factory : ici une fabrique cree plusieurs produits
 * qui vont ensemble.
 */
public interface IProduitFactory {

    ProduitA getProduitA();

    ProduitB getProduitB();
}
