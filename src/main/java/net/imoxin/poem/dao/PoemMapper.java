package net.imoxin.poem.dao;

import org.apache.ibatis.annotations.Mapper;
import net.imoxin.poem.entity.Poem;
import org.springframework.stereotype.Repository;


@Repository
@Mapper
public interface PoemMapper {
    Poem getPoemInfo();
}
