package common.storage.king.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.Log;
import common.storage.king.mapper.LogMapper;
import common.storage.king.service.LogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author haoran hou
 * @since 2022-09-19
 */
@Service
@DubboService
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService {

    @Resource
    private LogMapper logMapper;

    @Override
    public RestResponse<Integer> insertLogs(List<Log> logs) {
        int result = logMapper.insertBatch(logs);
        return RestResponse.success(result);
    }

    @Override
    public RestResponse<Integer> realDeleteLogsGeneratedXDayAgo(int x) {
        long removeTime = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(x);
        int result = logMapper.realDelete(removeTime);
        return RestResponse.success(result);
    }

    @Override
    public RestResponse<List<Log>> selectLogsByRequestId(Long requestId, long startTime, long endTime, int size) {
        LambdaQueryWrapper<Log> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(Log::getRequestId,requestId);
        if(endTime != 0){
            wrapper.lt(Log::getGmtCreate,endTime);
        }
        if(startTime != 0){
            wrapper.gt(Log::getGmtCreate,startTime);
        }
        List<Log> logs = logMapper.selectList(wrapper);
        return RestResponse.success(logs);
    }

    @Override
    public RestResponse<List<Log>> selectLogsGeneratedXMin(int x) {
        LambdaQueryWrapper<Log> wrapper = Wrappers.lambdaQuery();
        long startTime = System.currentTimeMillis() - TimeUnit.MINUTES.toMillis(x);
        wrapper.gt(Log::getGmtCreate,startTime);
        List<Log> logs = logMapper.selectList(wrapper);
        return RestResponse.success(logs);
    }

    @Override
    public RestResponse<List<Log>> selectLogsByUserId(Long userId, long startTime, long endTime, int pageCnt, int size) {
        if(size == 0) size = 50;
        if(pageCnt == 0) pageCnt = 10;
        Page<Log> logPage = new Page<>(0,size,size*pageCnt);
        LambdaQueryWrapper<Log> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(Log::getUserId,userId);
        if(startTime != 0){
            wrapper.gt(Log::getGmtCreate,startTime);
        }
        if(endTime != 0){
            wrapper.lt(Log::getGmtCreate,endTime);
        }
        logPage = logMapper.selectPage(logPage, wrapper);
        return null;
    }
}
