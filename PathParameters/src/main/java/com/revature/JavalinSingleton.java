package com.revature;

import io.javalin.Javalin;

public class JavalinSingleton {

    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        /**
         * Assignment: retrieve the variable "first" from the path parameter and send it in the response body. Produce
         * the response using:
         *      ctx.result(StringVariable);
         * 
         * app.get("/lastname/{name}", ctx -> {
                    String lastName = ctx.pathParam("name");
                                                });
         * 
         * Note: Please refer to the "PathParameters.MD" file for more assistance if needed.
         */
        app.get("/firstname/{name}", ctx ->{
            String firstname = ctx.pathParam("name"); 
            //write code
            ctx.result(firstname); 
        }); 


        return app;
    }
    
}
