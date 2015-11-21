package controllers;

import com.avaje.ebean.Model;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;
import java.util.List;
import views.html.*;
import models.MakanUser;
import static play.libs.Json.toJson;
public class Application extends Controller {

    public Result index() {

        return ok(test.render());
    }

    public Result test() {
        List<MakanUser> makans = new Model.Finder(String.class, MakanUser.class).all();
        return ok(Json.toJson(makans));
    }
    public Result addMakanUser(){

        MakanUser user = Form.form(MakanUser.class).bindFromRequest().get();
        user.save();
        return redirect(routes.Application.index());
    }
}
