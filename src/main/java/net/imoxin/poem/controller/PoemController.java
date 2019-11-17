package net.imoxin.poem.controller;

import net.imoxin.poem.entity.Poem;
import net.imoxin.poem.service.PoemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api", produces = "application/json; charset=UTF-8")
public class PoemController {

    @Autowired
    PoemService poemService;

    @GetMapping("/poem/{pid}")
    public String getMsg(@PathVariable(value = "pid") String pid){
        Poem poem = poemService.getPoemInfo();
        return poem.getTitle();
    }
}
