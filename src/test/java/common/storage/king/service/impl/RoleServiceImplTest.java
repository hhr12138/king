package common.storage.king.service.impl;

import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.Role;
import common.storage.king.service.RoleService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.Arrays;

@SpringBootTest
@Transactional
class RoleServiceImplTest {
    @Resource
    RoleService service;

    @Test
    void insertRole() {
        RestResponse<Long> test = service.insertRole(new Role(-1L, -1L, "test"));
        System.out.println(test.getData());
    }

    @Test
    void addRolesToUser() {
        RestResponse<Long> longRestResponse = service.addRolesToUser(1L, Arrays.asList(1L, 2L, 3L));
        System.out.println(longRestResponse.getData());
    }

    @Test
    void addRolesToCompany() {
        RestResponse<Long> longRestResponse = service.addRolesToCompany(1L, Arrays.asList(1L, 2L, 3L));
        System.out.println(longRestResponse.getData());
    }

    @Test
    void addRolesToDepartment() {
        RestResponse<Long> longRestResponse = service.addRolesToDepartment(1L, Arrays.asList(1L, 2L, 3L));
        System.out.println(longRestResponse.getData());
    }
}