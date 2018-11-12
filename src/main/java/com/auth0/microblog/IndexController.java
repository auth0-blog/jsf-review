// ./src/main/java/com/auth0/microblog/IndexController.java
package com.auth0.microblog;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class IndexController {
    public String getMessage() {
        return "Hello from JavaServer Faces!";
    }
}