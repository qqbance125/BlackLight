package info.papdt.blacklight.cache.favorites;

import org.litepal.crud.DataSupport;

import java.util.List;

import info.papdt.blacklight.model.FavItem;
import info.papdt.blacklight.model.MessageModel;

/**
 * Created by drakeet on 4/26/15.
 */
public class FavItemCache {

    public static void cache(MessageModel msg) {
        List<FavItem> list = DataSupport.where("wid = ?", msg.id + "").find(FavItem.class);
        FavItem favItem;
        if (list.size() > 0) {
            favItem = list.get(0);
            favItem.setFavorited(msg.favorited);
        } else {
            favItem = new FavItem();
            favItem.setWid(msg.id);
            favItem.setFavorited(msg.favorited);
        }
        favItem.save();
    }

    public static boolean getIsFavFromCache(MessageModel msg) {
        List<FavItem> list = DataSupport.where("wid = ?", msg.id + "").find(FavItem.class);
        if (list.size() > 0) {
            return list.get(0).isFavorited();
        } else {
            return false;
        }
    }
}
