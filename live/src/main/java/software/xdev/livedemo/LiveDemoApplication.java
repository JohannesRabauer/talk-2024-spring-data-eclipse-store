package software.xdev.livedemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import software.xdev.spring.data.eclipse.store.repository.config.EnableEclipseStoreRepositories;


@SpringBootApplication
@EnableEclipseStoreRepositories
public class LiveDemoApplication implements CommandLineRunner
{
	private OwnerRepository ownerRepository;

	public LiveDemoApplication(OwnerRepository ownerRepository)
	{
		this.ownerRepository = ownerRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(LiveDemoApplication.class, args);
	}

	@Override public void run(String... args) throws Exception
	{
		Owner owner = new Owner("Mick", "Fleetwood");
		this.ownerRepository.save(owner);

		this.ownerRepository.findAll().stream().forEach(System.out::println);
	}
}
