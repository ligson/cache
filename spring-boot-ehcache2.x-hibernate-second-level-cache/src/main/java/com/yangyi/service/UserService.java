package com.yangyi.service;


import com.yangyi.entity.User;

import java.util.List;

/**
 * Created by yangjinfeng on 2016/12/30.
 */
public interface UserService {
    User get(Long userId);

    List<User> users();


}
