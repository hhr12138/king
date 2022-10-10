package common.storage.king.service.impl;

import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.NeedPermission;
import common.storage.king.entity.Permission;
import common.storage.king.mapper.NeedPermissionMapper;
import common.storage.king.service.NeedPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import common.storage.king.service.PermissionService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

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
public class NeedPermissionServiceImpl extends ServiceImpl<NeedPermissionMapper, NeedPermission> implements NeedPermissionService {

    @Override
    public RestResponse<List<Permission>> getPermissions(NeedPermission needPermission) {
        if(needPermission.getCompanyId() == null || needPermission.getDepartmentId() == null || Strings.isEmpty(needPermission.getPsm())){
            return RestResponse.fail("require attribute is null: departId="+needPermission.getDepartmentId()+", companyId="+needPermission.getCompanyId()+", psm="+needPermission.getPsm());
        }
        List<Permission> permissions = this.baseMapper.getPermissions(needPermission);
        return RestResponse.success(permissions);
    }
}
