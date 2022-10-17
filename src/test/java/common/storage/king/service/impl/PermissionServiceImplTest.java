package common.storage.king.service.impl;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.Permission;
import common.storage.king.service.PermissionService;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
class PermissionServiceImplTest {
    @Resource
    PermissionService service;

    @Test
    @RepeatedTest(10)
    void insertPermission() {
        Permission permission = new Permission(0L,0L,"test");
        RestResponse<Long> longRestResponse = service.insertPermission(permission);
        System.out.println(permission.getId());
        System.out.println(longRestResponse.getData());
    }

    @Test
    void selectPermissionByDepartment() {
        RestResponse<Permission> permissionRestResponse = service.selectPermissionByDepartment(-1L);
        System.out.println(permissionRestResponse);
    }

    @Test
    void selectPermissionByUser() {
        RestResponse<Permission> permissionRestResponse = service.selectPermissionByUser(1L);
        System.out.println(permissionRestResponse);
    }

    @Test
    void selectPermissionByCompany() {
        RestResponse<Permission> permissionRestResponse = service.selectPermissionByCompany(-1L);
        System.out.println(permissionRestResponse);
    }

    @Test
    void addPermissionToRole() {
        service.addPermissionToRole(1L, Arrays.asList(1L,2L,3L));
    }

    @Test
    void addPermissionToUser() {
        service.addPermissionToUser(1L, Arrays.asList(1L,2L,3L));
    }

    @Test
    void addPermissionToNeedPermission() {
        service.addPermissionToNeedPermission(1L, Arrays.asList(1L,2L,3L));
    }
}