package cn.willyee.kgraph.service;

import cn.willyee.kgraph.model.User;

public interface AdminService {

    User getUserByName(String userName);

    String getPasswordByName(String userName);

    Integer insertUser(User user);

}
