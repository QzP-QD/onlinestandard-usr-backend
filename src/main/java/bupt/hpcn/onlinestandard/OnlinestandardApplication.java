package bupt.hpcn.onlinestandard;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@MapperScan("bupt.hpcn.onlinestandard.mapper")//使用MapperScan批量扫描所有的Mapper接口；
public class OnlinestandardApplication{

    public static void main(String[] args) {
        SpringApplication.run(OnlinestandardApplication.class, args);
    }

    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters(){
        //创建fastjson对象
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();

        FastJsonConfig confg = new FastJsonConfig();
        //设置是否需要格式化
        confg.setSerializerFeatures(SerializerFeature.PrettyFormat);
        converter.setFastJsonConfig(confg);
        return new HttpMessageConverters(converter);
    }
}
