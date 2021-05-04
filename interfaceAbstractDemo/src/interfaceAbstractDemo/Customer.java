package interfaceAbstractDemo;

import java.time.LocalDate;

public class Customer implements IEntity {
    int id;
   private String FirstName;
    private String LastName;
    private LocalDate birth;
    private long NationalityId;
    private int yearOfBirth;
	public Customer() {
		super();
	}

	public Customer(int id, String firstName, String lastName, LocalDate birth, long nationalityId,int yearOfBirth) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.birth = birth;
		this.NationalityId = nationalityId;
		this.yearOfBirth=yearOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	public long getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(long nationalityId) {
		NationalityId = nationalityId;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

}