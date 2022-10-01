package common.storage.king.mapper;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import common.storage.king.entity.Log;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author haoran hou
 * @since 2022-09-19
 */
public interface LogMapper extends SpiceMapper<Log> {
    Integer insertBatch(List<Log> logs);

    int realDelete(@Param("removeTime") long removeTime);
}
