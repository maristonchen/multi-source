package com.shenzhenair.source.service;

import com.shenzhenair.source.bean.master.User;

/**
 * (用一句话描述该文件做什么)
 *
 * @author mariston
 * @version V1.0
 * @since 2016/11/7
 */
public interface UserService {

    void save(User user);

    User queryById(String id);
}
