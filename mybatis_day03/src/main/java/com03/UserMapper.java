package com03;

import java.util.List;

public interface UserMapper {
    public List<User> findAllUser();

    public List<User> findUserAndRoleAll();
}
