package construction.abstractfactory.cours;

/** FABRIQUE CONCRETE de la famille 2 : elle ne cree que des produits "2". */
public class ProduitFactory2 implements IProduitFactory {

    @Override
    public ProduitA getProduitA() {
        return new ProduitA2();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB2();
    }
}
