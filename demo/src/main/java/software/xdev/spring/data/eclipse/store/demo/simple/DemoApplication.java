/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package software.xdev.spring.data.eclipse.store.demo.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import software.xdev.spring.data.eclipse.store.repository.config.EnableEclipseStoreRepositories;

import java.util.ArrayList;


@SpringBootApplication
@EnableEclipseStoreRepositories
public class DemoApplication implements CommandLineRunner
{
	private static final Logger LOG = LoggerFactory.getLogger(DemoApplication.class);
	private final OwnerRepository ownerRepository;
	private final PetRepository petRepository;
	
	public DemoApplication(final OwnerRepository ownerRepository, final PetRepository petRepository)
	{
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
	}
	
	public static void main(final String[] args)
	{
		final ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
		run.close();
	}
	
	@Override
	public void run(final String... args)
	{
		this.ownerRepository.deleteAll();
		this.petRepository.deleteAll();
		
		// save a couple of owners with their pets
		Owner stevieNicks = new Owner("Stevie", "Nicks", new ArrayList<>());
		Pet catsy = new Pet("Catsy", 2, stevieNicks);
		stevieNicks.pets().add(catsy);
		this.ownerRepository.save(stevieNicks);

		Owner mickFleetwood = new Owner("Mick", "Fleetwood", new ArrayList<>());
		Pet dogsy = new Pet("Dogsy", 5, mickFleetwood);
		mickFleetwood.pets().add(dogsy);
		this.ownerRepository.save(mickFleetwood);
		
		// fetch all owners
		LOG.info("Owners found with findAll():");
		this.ownerRepository.findAll().forEach(c -> LOG.info(c.toString()));

		// fetch all pets
		LOG.info("Pets found with findAll():");
		this.petRepository.findAll().forEach(p -> LOG.info(p.toString()));
	}
}
