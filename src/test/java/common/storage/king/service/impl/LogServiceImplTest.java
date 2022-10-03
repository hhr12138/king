package common.storage.king.service.impl;

import com.google.common.collect.Lists;
import common.storage.king.KingApplication;
import common.storage.king.entity.Log;
import common.storage.king.entity.User;
import common.storage.king.service.LogService;
import common.storage.king.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@ContextConfiguration(classes = {KingApplication.class})
@RunWith(SpringRunner.class)
class LogServiceImplTest {

    @Resource
    private LogService logService;
    @Resource
    private UserService userService;

    @Test
    void realDeleteLogsGeneratedXDayAgo() {
        userService.save(new User());
    }

    @Test
    void selectLogsByRequestId() {
        
    }

    @Test
    void selectLogsGeneratedXMin() {
    }

    @Test
    void selectLogsByUserId() {

    }

    @Test
    void testInsertLogs() {
    }

    @Test
    void testRealDeleteLogsGeneratedXDayAgo() {
    }

    @Test
    void testSelectLogsByRequestId() {
    }

    @Test
    void testSelectLogsGeneratedXMin() {
    }

    @Test
    void testSelectLogsByUserId() {
    }
}