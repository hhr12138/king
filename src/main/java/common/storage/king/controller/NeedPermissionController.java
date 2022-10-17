package common.storage.king.controller;

import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.NeedPermission;
import common.storage.king.entity.Permission;
import common.storage.king.service.NeedPermissionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class NeedPermissionController {
    @Resource
    NeedPermissionService needPermissionService;
    @PostMapping("/getNeedPermission")
    public RestResponse<List<Permission>> getPermissions(@RequestBody NeedPermission needPermission){
        return needPermissionService.getPermissions(needPermission);
    }

    /**
     *
     * @param needPermission
     * @return primary key
     */
    @PostMapping("/insert/needPermission")
    RestResponse<Long> insertNeedPermission(@RequestBody NeedPermission needPermission){
        return needPermissionService.insertNeedPermission(needPermission);
    }
}
