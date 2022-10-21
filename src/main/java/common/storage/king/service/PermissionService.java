package common.storage.king.service;

import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.Permission;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author haoran hou
 * @since 2022-10-01
 */
public interface PermissionService extends IService<Permission> {

    RestResponse<Long> insertPermission( Permission permission);

    RestResponse<Permission> selectPermissionByDepartment( Long departmentId);

    RestResponse<Permission> selectPermissionByUser( Long userId);

    RestResponse<Permission> selectPermissionByCompany( Long companyId);

    /**
     * 给角色添加权限
     * @return 添加成功个数
     */
    RestResponse<Long> addPermissionToRole( Long roleId, List<Long> permissionIds);

    /**
     * 给用户添加权限
     * @param userId
     * @param permissionIds
     * @return
     */
    RestResponse<Long> addPermissionToUser(Long userId,List<Long> permissionIds);

    /**
     * 给权限需要对象添加所需权限
     * @param needPermission
     * @param permissions
     * @return
     */
    RestResponse<Long> addPermissionToNeedPermission(Long needPermission,List<Long> permissions);

}
