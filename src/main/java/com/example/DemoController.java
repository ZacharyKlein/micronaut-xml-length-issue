package com.example;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;

@Controller("/demo")
public class DemoController {

    @Post("/")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    HttpResponse<String> receiveEesEvent(MyXml myXml) {
        System.out.println(myXml.toString());


        return HttpResponse.ok("OK");

    }

}
