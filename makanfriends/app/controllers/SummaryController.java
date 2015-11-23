package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Cuisine;
import views.html.Summary;

/**
 * Created by Lye on 20/11/2015.
 */
public class SummaryController extends Controller {
    public Result index() {
        return ok(Summary.render());
    }
}
