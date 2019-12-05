package net.imoxin.poem.service;

import net.imoxin.poem.entity.Poem;

public interface PoemService {
     //通过pid查询
     Poem getPoemInfo(String pid);
     //随机查询
     Poem getPoemInfo();
}

