package software.xdev.livedemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import software.xdev.spring.data.eclipse.store.repository.config.EnableEclipseStoreRepositories;


@SpringBootApplication
@EnableEclipseStoreRepositories
public class LiveDemoApplication
{
	public static void main(String[] args) {
		SpringApplication.run(LiveDemoApplication.class, args);
	}
}
