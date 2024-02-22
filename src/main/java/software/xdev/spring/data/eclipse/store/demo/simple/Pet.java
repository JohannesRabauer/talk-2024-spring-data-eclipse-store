package software.xdev.spring.data.eclipse.store.demo.simple;

import java.util.Objects;


public record Pet(String name, int age, Owner owner)
{
	@Override public String toString()
	{
		return "Pet{" +
			"name='" + name + '\'' +
			", age=" + age +
			'}';
	}

	@Override public int hashCode()
	{
		return Objects.hash(name, age);
	}
}
