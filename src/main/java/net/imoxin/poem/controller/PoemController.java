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

    /**
     * 查询指定诗
     * @param pid
     * @return
     */
    @GetMapping("/poem/{pid}")
    public Poem getMsg(@PathVariable(value = "pid") String pid){
        Poem poem = poemService.getPoemInfo(pid);
        return poem;
    }

    /**
     * 随机查询诗
     * @return
     */
    @GetMapping("/")
    public Poem getPoem(){
        return poemService.getRandPoemInfo();
    }

}
