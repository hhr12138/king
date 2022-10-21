package common.storage.king.controller;

import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.Permission;
import common.storage.king.entity.User;
import common.storage.king.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    UserService userService;
    @PostMapping("/getUserPermission")
    public RestResponse<List<Permission>> getUserPermissions(@RequestBody User user){
        return userService.getUserPermissions(user);
    }
}
