package common.storage.king.service.impl;

import common.storage.king.entity.User;
import common.storage.king.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    void getUserPermissions() {
        User commonUser = new User();
        commonUser.setId(1L);
        User nullUser = new User();
        System.out.println(userService.getUserPermissions(commonUser));
        System.out.println(nullUser);
    }
}