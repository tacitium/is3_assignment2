package models;
import com.avaje.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Created by fuhchangloi on 21/11/15.
 */
@Entity
public class RestaurantImages extends Model {
    @Id
    private int id;

    private int restaurantId;

    private String imgUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
