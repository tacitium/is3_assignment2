package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.Restaurant;
import play.Logger;
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
    public Result index2(String type){
        return ok(test2.render(type));
    }
    public Result test() {
        List<Restaurant> list = Restaurant.find.findList();
        return ok(Json.toJson(list));
    }

    public Result test2() {
        List<Restaurant> list = Restaurant.find.where().like("category", "%" + request().getQueryString("type") +"%").findList();
        return ok(Json.toJson(list));
    }

    public Result test3(){
        return redirect(routes.Application.index2(request().getQueryString("type")));
    }
    public Result addMakanUser(){

        MakanUser user = Form.form(MakanUser.class).bindFromRequest().get();
        user.save();
        return redirect(routes.Application.index());
    }
}
