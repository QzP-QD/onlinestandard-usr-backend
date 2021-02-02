package bupt.hpcn.onlinestandard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("bupt.hpcn.onlinestandard.mapper")//使用MapperScan批量扫描所有的Mapper接口；
public class OnlinestandardApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlinestandardApplication.class, args);
    }

}
