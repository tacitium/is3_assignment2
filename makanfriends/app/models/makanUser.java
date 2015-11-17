package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Created by fuhchangloi on 16/11/15.
 */
@Entity
public class MakanUser extends Model{
    @Id
    public String nric;

    public String name;

    public void setName(String name) {

        this.name = name;
    }


    public String getName() {

        return name;
    }

    public void setNric(String nric){

        this.nric = nric;
    }
    public String getNric(){

        return nric;
    }

}
