package com.hieunh.graphqldemo.datafetcher;

import com.hieunh.graphqldemo.domain.User;
import com.hieunh.graphqldemo.service.UserService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
@DgsComponent
public class UserDataFetcher {
    @Autowired
    private UserService userService;

    @DgsQuery()
    public List<User> users() {
        List<User> userList = this.userService.findAll();
        return userList;
    }

    @DgsQuery()
    public User user(@InputArgument Integer id) {
        User user = this.userService.findById(id);
        return user;
    }
}
