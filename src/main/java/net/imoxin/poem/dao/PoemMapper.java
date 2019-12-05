package net.imoxin.poem.dao;

import org.apache.ibatis.annotations.Mapper;
import net.imoxin.poem.entity.Poem;

@Mapper
public interface PoemMapper {
    Poem getPoemInfo();
}
