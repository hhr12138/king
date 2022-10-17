package common.storage.king.mapper;

import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.Permission;
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
public interface PermissionMapper extends BaseMapper<Permission> {

    long addPermissionToRole(@Param("roleId")Long roleId,@Param("permissionIds") List<Long> permissionIds);

    long addPermissionToUser(@Param("userId")Long userId,@Param("permissionIds") List<Long> permissionIds);

    long addPermissionToNeedPermission(@Param("needPermissionId")Long needPermissionId,@Param("permissionIds") List<Long> permissions);
}
