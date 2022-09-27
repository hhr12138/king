package common.storage.king.service;

import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.Log;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.dubbo.config.annotation.DubboReference;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author haoran hou
 * @since 2022-09-19
 */
public interface LogService extends IService<Log> {
    RestResponse<Integer> insertLogs(List<Log> logs);
    //物理删除X天前的日志
    RestResponse<Integer> realDeleteLogsGeneratedXDayAgo(int x);
    //根据requestId查询指定时间范围内的日志, 不传时间意味着无限制
    RestResponse<List<Log>> selectLogsByRequestId(String requestId, long startTime, long endTime, int size);
    //查询X分钟内的日志
    RestResponse<List<Log>> selectLogsGeneratedXMin(int x);
    //根据UserId查询指定时间范围内的日志, 不传时间无限制
    RestResponse<List<Log>> selectLogsByUserId(Long userId, long startTime, long endTime,int pageCnt, int size);
}
