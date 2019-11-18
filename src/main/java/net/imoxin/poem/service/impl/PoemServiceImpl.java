package net.imoxin.poem.service.impl;

import net.imoxin.poem.mapper.PoemMapper;
import net.imoxin.poem.entity.Poem;
import net.imoxin.poem.service.PoemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoemServiceImpl implements PoemService {

    @Autowired
    private PoemMapper poemMapper;

    @Override
    public Poem getPoemInfo() {
        ///poemMapper.getPoemInfo();
        Poem poem = new Poem("我是标题","我是文章");
        return poem;
    }

    @Override
    public Poem getPoemInfo(String pid){
        Poem poem = new Poem("我是标题","我是文章");
        return poem;
    }
}


