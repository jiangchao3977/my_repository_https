package com03;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public  class  User {
    private  int id;
    private  String username;
    private  String password;
    private Date birthday;
    private List<Order> orderList;
    //描述的是当前用户具备哪些角色
    private List<Role> roleList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(birthday, user.birthday) &&
                Objects.equals(orderList, user.orderList) &&
                Objects.equals(roleList, user.roleList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, username, password, birthday, orderList, roleList);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", roleList=" + roleList +
                '}';
    }

    public User() {
    }

    public User(int id, String username, String password, Date birthday, List<Order> orderList, List<Role> roleList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.orderList = orderList;
        this.roleList = roleList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}