package net.imoxin.poem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PoemController {

    @RequestMapping(value = "/poem", method = RequestMethod.GET)
    public String getMsg(@RequestParam(value = "id", required = true) String pid){

        return null
                ;
    }
}
