package com.joettan.musicwebsite.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName
 * @Description
 * @Author
 * @Version 0.42
 **/
@Api(tags = "HelloWorld")
@RestController
@RequestMapping(value = "/")
@CrossOrigin(origins = "*")
public class HelloWorldController {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @ApiOperation("HelloWorld")
    @RequestMapping(value = {"/{Name}"},method = RequestMethod.GET)
    public String HelloWorld(@PathVariable("Name")String name){
        logger.info("HelloWorld"+name);
        return "HelloWorld"+name;
    }
    @RequestMapping(value = {""},method = RequestMethod.GET)
    public String HelloWorld(){
        logger.info("HelloWorld");
        return "HelloWorld";
    }
}
