package construction.abstractfactory.cours;

/** FABRIQUE CONCRETE de la famille 1 : elle ne cree que des produits "1". */
public class ProduitFactory1 implements IProduitFactory {

    @Override
    public ProduitA getProduitA() {
        return new ProduitA1();
    }

    @Override
    public ProduitB getProduitB() {
        return new ProduitB1();
    }
}
