package common.storage.king.service.impl;

import common.storage.king.entity.NeedPermission;
import common.storage.king.service.NeedPermissionService;
import common.storage.king.service.PermissionService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NeedPermissionServiceImplTest {

    @Resource
    private NeedPermissionService service;

    @Test
    void getPermissions() {
        NeedPermission commonPermission = new NeedPermission("test","test1",-1L,-1L);
        NeedPermission nullPermission = new NeedPermission();
        System.out.println(service.getPermissions(commonPermission));
        System.out.println(service.getPermissions(nullPermission).toString());
    }
}