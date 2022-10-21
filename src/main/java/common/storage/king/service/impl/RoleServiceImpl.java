package common.storage.king.service.impl;

import com.baomidou.mybatisplus.extension.api.R;
import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.Role;
import common.storage.king.mapper.RoleMapper;
import common.storage.king.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
    public RestResponse<Long> insertRole(Role role){
        boolean success = baseMapper.insert(role)==1;
        if(success){
            return RestResponse.success(role.getId());
        }
        return RestResponse.fail("[insertRole] insert fail");
    }

    /**
     * 给用户添加角色
     * @param userId
     * @param roleIds
     * @return 添加成功个数
     */
    public RestResponse<Long> addRolesToUser(Long userId, List<Long> roleIds){
        return RestResponse.success(baseMapper.addRolesToUser(userId, roleIds));
    }

    /**
     * 给公司添加基础角色
     * @param companyId
     * @param roleIds
     * @return
     */
    public RestResponse<Long> addRolesToCompany(Long companyId, List<Long> roleIds){
        return RestResponse.success(baseMapper.addRolesToCompany(companyId,roleIds));
    }

    /**
     * 给部门添加基础角色
     * @param departmentId
     * @param roleIds
     * @return
     */
    public RestResponse<Long> addRolesToDepartment(Long departmentId, List<Long> roleIds){
        return RestResponse.success(baseMapper.addRolesToDepartment(departmentId,roleIds));
    }
}
