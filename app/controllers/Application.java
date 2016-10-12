package controllers;


import play.mvc.Controller;
import play.mvc.results.Result;
import models.*;
import play.data.*;
import play.data.validation.Required;
import views.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void sayHello(@Required String myName) {
        if(validation.hasErrors()) {
            flash.error("Oops, por favor entre com seu nome!");
            index();
        }
        render(myName);
    }
    
    

}