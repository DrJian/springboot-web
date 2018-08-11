package com.hongjian.springweb;

import com.hongjian.springweb.config.HongJianDataSourceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author hongjian
 */
@SpringBootApplication
@Import({HongJianDataSourceConfiguration.class})
public class SpringbootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebApplication.class, args);
    }
}
