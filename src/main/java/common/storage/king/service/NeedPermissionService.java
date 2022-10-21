package common.storage.king.service;

import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.NeedPermission;
import com.baomidou.mybatisplus.extension.service.IService;
import common.storage.king.entity.Permission;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author haoran hou
 * @since 2022-10-01
 */
public interface NeedPermissionService extends IService<NeedPermission> {
    RestResponse<List<Permission>> getPermissions(NeedPermission needPermission);

    RestResponse<Long> insertNeedPermission(NeedPermission needPermission);
}
