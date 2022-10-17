package common.storage.king.controller;

import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.Permission;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PermissionController {
    @PostMapping("/insert/permission")
    RestResponse<Long> insertPermission(@RequestBody Permission permission){
        return null;
    }

    @GetMapping("/select/permissionByDepartment")
    RestResponse<Permission> selectPermissionByDepartment(@RequestParam Long departmentId){
        return null;
    }

    @GetMapping("/select/permissionByUser")
    RestResponse<Permission> selectPermissionByUser(@RequestParam Long userId){
        return null;
    }
    @GetMapping("/select/permissionByCompany")
    RestResponse<Permission> selectPermissionByCompany(@RequestParam Long companyId){
        return null;
    }
    /**
     * 给角色添加权限
     * @return 添加成功个数
     */
    @PostMapping("/add/permissionToRole")
    RestResponse<Long> addPermissionToRole(@RequestParam Long roleId,@RequestParam List<Long> permissionIds){
        return null;
    }

    /**
     * 给用户添加权限
     * @param userId
     * @param permissionIds
     * @return
     */
    @PostMapping("/add/permissionToUser")
    RestResponse<Long> addPermissionToUser(@RequestParam Long userId,@RequestParam List<Long> permissionIds){
        return null;
    }

    /**
     * 给权限需要对象添加所需权限
     * @param needPermission
     * @param permissions
     * @return
     */
    @PostMapping("/add/permissionToNeedPermission")
    RestResponse<Long> addPermissionToNeedPermission(@RequestParam Long needPermission,@RequestParam List<Long> permissions){
        return null;
    }
}
