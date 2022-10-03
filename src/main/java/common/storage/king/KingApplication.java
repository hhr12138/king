package common.storage.king;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("common.storage.king.mapper")
public class KingApplication {

    public static void main(String[] args) {
        SpringApplication.run(KingApplication.class, args);
    }


}
