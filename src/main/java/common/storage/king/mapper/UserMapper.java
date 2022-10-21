package common.storage.king.mapper;

import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.Permission;
import common.storage.king.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author haoran hou
 * @since 2022-09-19
 */
public interface UserMapper extends BaseMapper<User> {

    List<Permission> getUserPermissions(User user);
}
