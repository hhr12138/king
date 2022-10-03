package common.storage.king.controller;

import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.Log;
import common.storage.king.service.LogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LogController {
    @Resource
    private LogService logService;
    @PostMapping("/insertLogs")
    RestResponse<Integer> insertLogStrs(String logsStr){
        return logService.insertLogStrs(logsStr);
    }
        RestResponse<Integer> insertLogs(List<Log> logs){
        return logService.insertLogs(logs);
        }
    //物理删除X天前的日志
    RestResponse<Integer> realDeleteLogsGeneratedXDayAgo(int x){
        return logService.realDeleteLogsGeneratedXDayAgo(x);
    };
    //根据requestId查询指定时间范围内的日志, 不传时间意味着无限制
    RestResponse<List<Log>> selectLogsByRequestId(String requestId, long startTime, long endTime){
        return logService.selectLogsByRequestId(requestId,startTime,endTime);
    };
    //查询X分钟内的日志
    RestResponse<List<Log>> selectLogsGeneratedXMin(int x){
        return logService.selectLogsGeneratedXMin(x);
    };
    //根据UserId查询指定时间范围内的日志, 不传时间无限制
    RestResponse<List<Log>> selectLogsByUserId(Long userId, long startTime, long endTime,int pageCnt, int size){
        return logService.selectLogsByUserId(userId,startTime,endTime,pageCnt,size);
    };
}
