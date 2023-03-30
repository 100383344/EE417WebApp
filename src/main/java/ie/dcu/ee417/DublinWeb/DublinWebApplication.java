package ie.dcu.ee417.DublinWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import ie.dcu.ee417.DublinWeb.entities.Feedback;
import ie.dcu.ee417.DublinWeb.entities.Users;

@ComponentScan(basePackages = "ie.dcu.ee417.DublinWeb.*")
@SpringBootApplication
@EnableJpaRepositories(basePackages = { "ie.dcu.ee417.DublinWeb.repository" })
@EntityScan(basePackageClasses = {Feedback.class, Users.class})
public class DublinWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DublinWebApplication.class, args);
	}

}
