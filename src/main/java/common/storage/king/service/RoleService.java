package common.storage.king.service;

import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author haoran hou
 * @since 2022-10-01
 */
public interface RoleService extends IService<Role> {
    RestResponse<Long> insertRole(Role role);

    /**
     * 给用户添加角色
     * @param userId
     * @param roleIds
     * @return 添加成功个数
     */
    RestResponse<Long> addRolesToUser( Long userId,  List<Long> roleIds);

    /**
     * 给公司添加基础角色
     * @param companyId
     * @param roleIds
     * @return
     */
    RestResponse<Long> addRolesToCompany( Long companyId, List<Long> roleIds);

    /**
     * 给部门添加基础角色
     * @param departmentId
     * @param roleIds
     * @return
     */
    RestResponse<Long> addRolesToDepartment( Long departmentId, List<Long> roleIds);
}
