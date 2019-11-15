package net.imoxin.poem.mapper;

import org.apache.ibatis.annotations.Mapper;
import net.imoxin.poem.entity.Poem;

@Mapper
public interface PoemMapper {
    Poem getPoemInfo();
}
