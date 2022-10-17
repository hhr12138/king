package common.storage.king.controller;

import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.Role;
import common.storage.king.service.RoleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class RoleController {
    @Resource
    RoleService roleService;
    @PostMapping("/insert/Role")
    RestResponse<Long> insertRole(@RequestBody Role role){
        return roleService.insertRole(role);
    }

    /**
     * 给用户添加角色
     * @param userId
     * @param roleIds
     * @return 添加成功个数
     */
    @PostMapping("/add/rolesToUser")
    RestResponse<Long> addRolesToUser(@RequestParam Long userId, @RequestParam List<Long> roleIds){
        return roleService.addRolesToUser(userId,roleIds);
    }

    /**
     * 给公司添加基础角色
     * @param companyId
     * @param roleIds
     * @return
     */
    @PostMapping("/add/rolesToCompany")
    RestResponse<Long> addRolesToCompany(@RequestParam Long companyId,@RequestParam List<Long> roleIds){
        return roleService.addRolesToCompany(companyId,roleIds);
    }

    /**
     * 给部门添加基础角色
     * @param departmentId
     * @param roleIds
     * @return
     */
    @PostMapping("/add/rolesToDepartment")
    RestResponse<Long> addRolesToDepartment(@RequestParam Long departmentId,@RequestParam List<Long> roleIds){
        return roleService.addRolesToDepartment(departmentId,roleIds);
    }
}
