package software.xdev.spring.data.eclipse.store.demo.simple;

import org.springframework.data.repository.CrudRepository;


public interface OwnerRepository extends CrudRepository<Owner, String>
{
}
