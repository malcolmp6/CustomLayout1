import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by malcolm on 3/2/2017.
 */

@SpringBootApplication
public class Application {

    private static final Logger l = LoggerFactory.getLogger(Application.class);

    public static void main(String args[])
    {
        SpringApplication.run(Application.class,args);
    }
}
