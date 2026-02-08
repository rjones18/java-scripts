package com.reggie;

import io.javalin.Javalin;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public"); // serves src/main/resources/public
        });

        app.get("/", ctx -> ctx.redirect("/index.html"));

        app.get("/api/hello", ctx -> {
            ctx.json(Map.of("message", "Hello from Javalin!", "status", "ok"));
        });

        app.start(7070);
        System.out.println("Running on http://localhost:7070");
    }
}

