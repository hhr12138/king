package common.storage.king.service.impl;

import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.Permission;
import common.storage.king.entity.User;
import common.storage.king.mapper.UserMapper;
import common.storage.king.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author haoran hou
 * @since 2022-09-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public RestResponse<List<Permission>> getUserPermissions(User user) {
        if(user.getId() == null){
            return RestResponse.fail("require attribute is null: userId=null");
        }
        return RestResponse.success(this.baseMapper.getUserPermissions(user));
    }
}
