package com.shenzhenair.source.mapper.master;

import com.shenzhenair.source.bean.master.User;
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
public interface UserMapper {

    /**
     * 插入用户
     *
     * @param user
     */
    void insert(User user);

    User selectOneById(@Param("id") String id);
}
