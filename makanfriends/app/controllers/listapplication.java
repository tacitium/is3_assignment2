package controllers;

import models.Restaurant;
import java.util.List;
import java.net.*;
import java.io.*;
import play.*;
import com.avaje.ebean.Model;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;
import java.util.List;
import views.html.*;
import models.MakanUser;
import static play.libs.Json.toJson;

public class ListApplication extends Controller {

    public Result list(String keyword) {
        return ok(list.render(keyword));

    }
    public Result addMakanUser(){

        MakanUser user = Form.form(MakanUser.class).bindFromRequest().get();
        user.save();
        return redirect(routes.Application.index());
    }
}
