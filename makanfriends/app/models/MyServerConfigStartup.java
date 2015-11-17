package models;

import com.avaje.ebean.config.ServerConfig;
import com.avaje.ebean.event.ServerConfigStartup;

/**
 * Created by fuhchangloi on 17/11/15.
 */


public class MyServerConfigStartup implements ServerConfigStartup{

    public void onStart(ServerConfig sc){
        sc.setDatabaseSequenceBatchSize(1);
    }
}
