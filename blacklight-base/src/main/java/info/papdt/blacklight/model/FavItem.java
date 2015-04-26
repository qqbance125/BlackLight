package info.papdt.blacklight.model;

import org.litepal.crud.DataSupport;

/**
 * Created by drakeet on 4/26/15.
 */
public class FavItem extends DataSupport {

    private int id;
    private boolean isFav;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFav() {
        return isFav;
    }

    public void setIsFav(boolean isFav) {
        this.isFav = isFav;
    }
}
