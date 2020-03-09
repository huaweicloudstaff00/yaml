package com.service.testaaa.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-29T09:17:10.253Z")

@RestSchema(schemaId = "testaaa")
@RequestMapping(path = "/testaaa", produces = MediaType.APPLICATION_JSON)
public class TestaaaImpl {

    @Autowired
    private TestaaaDelegate userTestaaaDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTestaaaDelegate.helloworld(name);
    }

}
