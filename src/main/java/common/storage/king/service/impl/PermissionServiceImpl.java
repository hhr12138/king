package common.storage.king.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.Permission;
import common.storage.king.mapper.PermissionMapper;
import common.storage.king.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author haoran hou
 * @since 2022-10-01
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

    public RestResponse<Long> insertPermission( Permission permission){
        int cnt = baseMapper.insert(permission);
        if(cnt == 0){
            return RestResponse.fail("[insertPermission] insert err");
        }
        return RestResponse.success(permission.getId());
    }

    //这些就都不写了, 最简单的联表
    public RestResponse<Permission> selectPermissionByDepartment( Long departmentId){
        return RestResponse.fail("简单的联表, 懒得写了");
    }

    public RestResponse<Permission> selectPermissionByUser( Long userId){
        return RestResponse.fail("简单的联表, 懒得写了");
    }

    public RestResponse<Permission> selectPermissionByCompany( Long companyId){
        return RestResponse.fail("简单的联表, 懒得写了");
    }
    /**
     * 给角色添加权限
     * @return 添加成功个数
     */
    public RestResponse<Long> addPermissionToRole( Long roleId, List<Long> permissionIds){
        return RestResponse.success(baseMapper.addPermissionToRole(roleId,permissionIds));
    }

    /**
     * 给用户添加权限
     * @param userId
     * @param permissionIds
     * @return
     */
    public RestResponse<Long> addPermissionToUser( Long userId, List<Long> permissionIds){
        return RestResponse.success(baseMapper.addPermissionToUser(userId,permissionIds));
    }

    /**
     * 给权限需要对象添加所需权限
     * @param needPermission
     * @param permissions
     * @return
     */

    public RestResponse<Long> addPermissionToNeedPermission( Long needPermission, List<Long> permissions){
        return RestResponse.success(baseMapper.addPermissionToNeedPermission(needPermission,permissions));
    }
}
