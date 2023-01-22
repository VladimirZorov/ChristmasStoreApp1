package christmasPastryShop.repositories.interfaces;

import christmasPastryShop.entities.cocktails.interfaces.Cocktail;

import java.util.Collection;

public class BaseRepository implements Repository{

    private Collection<Cocktail> cocktails;
    

    @Override
    public Collection getAll() {
        return null;
    }

    @Override
    public void add(Object o) {

    }
}
