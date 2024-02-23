package software.xdev.spring.data.eclipse.store.demo.simple;

import java.util.ArrayList;
import java.util.Objects;


public record Owner(String firstName, String lastName, ArrayList<Pet> pets)
{
	@Override public String toString()
	{
		return "Owner{" +
			"firstName='" + firstName + '\'' +
			", lastName='" + lastName + '\'' +
			", pets=" + pets +
			'}';
	}

	@Override public int hashCode()
	{
		return Objects.hash(firstName, lastName);
	}
}
