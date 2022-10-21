package common.storage.king.controller;

import common.entity.valhalla.vo.RestResponse;
import common.storage.king.entity.Log;
import common.storage.king.service.LogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LogController {
    @Resource
    private LogService logService;

    @PostMapping("/insertLogsStr")
    public RestResponse<Integer> insertLogsStr(@RequestParam("logsStr") String logsStr) {
        return logService.insertLogStrs(logsStr);
    }

    @PostMapping("/insertLogs")
    public RestResponse<Integer> insertLogs(@RequestBody List<Log> logs) {
        return logService.insertLogs(logs);
    }

    //物理删除X天前的日志
    @PostMapping("/realDeleteLogsGeneratedXDayAgo")
    public RestResponse<Integer> realDeleteLogsGeneratedXDayAgo(@RequestParam("x") int x) {
        return logService.realDeleteLogsGeneratedXDayAgo(x);
    }

    //根据requestId查询指定时间范围内的日志, 不传时间意味着无限制
    @GetMapping("/selectLogsByRequestId/{requestId}/{startTime}/{endTime}")
    public RestResponse<List<Log>> selectLogsByRequestId(@PathVariable("requestId") String requestId, @PathVariable("startTime") long startTime, @PathVariable("endTime") long endTime) {
        return logService.selectLogsByRequestId(requestId, startTime, endTime);
    }

    //查询X分钟内的日志
    @GetMapping("/selectLogsGeneratedXMin/{x}")
    public RestResponse<List<Log>> selectLogsGeneratedXMin(@PathVariable("x") int x) {
        return logService.selectLogsGeneratedXMin(x);
    }

    //根据UserId查询指定时间范围内的日志, 不传时间无限制
    @GetMapping("selectLogsByUserId/{userId}/{startTime}/{endTime}/{pageCnt}/{size}")
    public RestResponse<List<Log>> selectLogsByUserId(@PathVariable("userId") Long userId,@PathVariable("startTime") long startTime,@PathVariable("endTime") long endTime,@PathVariable(value = "pageCnt",required = false) int pageCnt,@PathVariable(value = "size",required = false) int size) {
        return logService.selectLogsByUserId(userId, startTime, endTime, pageCnt, size);
    }
}
