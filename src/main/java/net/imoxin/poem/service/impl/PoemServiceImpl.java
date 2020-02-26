package net.imoxin.poem.service.impl;

import net.imoxin.poem.dao.PoemMapper;
import net.imoxin.poem.entity.Poem;
import net.imoxin.poem.service.PoemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoemServiceImpl implements PoemService {

    @Autowired
    private PoemMapper poemMapper;

    @Override
    public Poem getRandPoemInfo() {

        return poemMapper.getRandPoemInfo();
    }

    @Override
    public Poem getPoemInfo(String pid){
        Poem  poem = poemMapper.getPoemInfo(pid);
        return poem;
    }
}


