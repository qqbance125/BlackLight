package info.papdt.blacklight.model;

import org.litepal.crud.DataSupport;

/**
 * Created by drakeet on 4/26/15.
 */
public class FavItem extends DataSupport {

    private long wid;
    private boolean favorited;

    public long getWid() {
        return wid;
    }

    public void setWid(long wid) {
        this.wid = wid;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }
}
