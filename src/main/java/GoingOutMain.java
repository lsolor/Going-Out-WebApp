import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/* Set this class as launcher/main for springboot application*/
@SpringBootApplication
public class GoingOutMain {


    public static void main(String[] args){

        /*set up servlet */
        SpringApplication.run(GoingOutMain.class, args);
    }
}
