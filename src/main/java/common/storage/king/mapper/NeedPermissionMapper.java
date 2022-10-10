package common.storage.king.mapper;

import common.storage.king.entity.NeedPermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import common.storage.king.entity.Permission;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author haoran hou
 * @since 2022-10-01
 */
public interface NeedPermissionMapper extends BaseMapper<NeedPermission> {
    List<Permission> getPermissions(NeedPermission needPermission);
}
