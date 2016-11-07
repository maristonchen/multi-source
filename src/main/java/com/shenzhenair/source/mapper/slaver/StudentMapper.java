package com.shenzhenair.source.mapper.slaver;

import com.shenzhenair.source.bean.slaver.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * (用一句话描述该文件做什么)
 *
 * @author mariston
 * @version V1.0
 * @since 2016/11/7
 */
@Repository
public interface StudentMapper {

    void insert(Student student);

    Student selectOneById(@Param("id") String id);

}
