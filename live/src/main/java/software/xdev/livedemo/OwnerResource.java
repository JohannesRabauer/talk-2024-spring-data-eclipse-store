package software.xdev.livedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/owner")
public class OwnerResource
{
	final OwnerRepository repository;

	public OwnerResource(OwnerRepository repository)
	{
		this.repository = repository;
	}

	@PostMapping
	public Owner create(@RequestBody Owner owner)
	{
		this.repository.save(owner);
		return owner;
	}

	@GetMapping
	public Collection<Owner> list()
	{
		return this.repository.findAll();
	}
}
