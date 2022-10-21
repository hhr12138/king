package common.storage.king.mapper;

import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author haoran hou
 * @since 2022-10-01
 */
public interface RoleMapper extends BaseMapper<Role> {

    long addRolesToUser(@Param("userId") Long userId,@Param("roleIds") List<Long> roleIds);

    long addRolesToCompany(@Param(("companyId")) Long companyId, @Param("roleIds") List<Long> roleIds);

    long addRolesToDepartment(@Param("departmentId") Long departmentId,@Param("roleIds") List<Long> roleIds);
}
