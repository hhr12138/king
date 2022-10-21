package common.storage.king.service;

import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.Permission;
import common.storage.king.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author haoran hou
 * @since 2022-09-19
 */
public interface UserService extends IService<User> {

    RestResponse<List<Permission>> getUserPermissions(User user);
}
