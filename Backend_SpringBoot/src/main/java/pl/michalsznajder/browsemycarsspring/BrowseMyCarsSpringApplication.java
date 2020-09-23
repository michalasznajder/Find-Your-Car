package pl.michalsznajder.browsemycarsspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.michalsznajder.browsemycarsspring.repositories.IMarkRepository;

@SpringBootApplication
public class BrowseMyCarsSpringApplication {


    public static void main(String[] args) {
        SpringApplication.run(BrowseMyCarsSpringApplication.class, args);



    }

}
