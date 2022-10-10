package common.storage.king.controller;

import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.NeedPermission;
import common.storage.king.entity.Permission;
import common.storage.king.service.NeedPermissionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;

public class NeedPermissionController {
    @Resource
    NeedPermissionService needPermissionService;
    @GetMapping("/getNeedPermission")
    public RestResponse<List<Permission>> getPermissions(@RequestBody NeedPermission needPermission){
        return needPermissionService.getPermissions(needPermission);
    }
}
