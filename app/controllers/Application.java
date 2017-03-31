package controllers;

import com.google.inject.Inject;

import helpers.Secured;
import models.Coffee;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.Messages;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page
 */
@Security.Authenticated(Secured.class)
public class Application extends Controller {

	@Inject
	FormFactory formFactory;

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
    	return redirect(routes.PostController.showAllPost(1).url());
    }
    
    public static Result changeLanguage() {

        Form<Coffee> coffeeForm = formFac(Coffee.class);
        return ok(index.render(coffeeForm));
    }

    public static Result submit(){
        Form<Coffee> coffeeForm = form(Coffee.class).bindFromRequest();

        if (coffeeForm.hasErrors()){
            return badRequest(index.render(coffeeForm));
        }

        return ok("it was saved...");
    }

}
