package co.com.mm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Main Class.
 *
 * @author Julian Gomez
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Main {

    /**
     * Main Method.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}
