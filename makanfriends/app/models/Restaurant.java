package models;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Created by fuhchangloi on 19/11/15.
 */
@Entity
public class Restaurant {


    @Id
    private int restID;
    private String name;
    private String address;
    private int postalCode;
    private int phone;
    private double lat;
    private double lng;

    public int getRestID() {

        return restID;
    }

    public void setRestID(int restID) {
        this.restID = restID;
    }

    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public String getAddress() {

        return address;
    }
    public void setAddress(
            String address) {
        this.address = address;
    }
    public int getPostalCode() {

        return postalCode;
    }

    public void setPostalCode(int postalCode) {

        this.postalCode = postalCode;
    }
    public int getPhone() {

        return phone;
    }
    public void setPhone(int phone) {

        this.phone = phone;
    }
    public double getLat() {

        return lat;
    }
    public void setLat(double lat) {

        this.lat = lat;
    }
    public double getLng() {

        return lng;
    }
    public void setLng(double lng) {

        this.lng = lng;
    }
}
