package interfaceAbstractDemo;

public class Main {

	public static void main(String[] args) {
		   Customer customer=new Customer();
	        customer.setId(1);
	        customer.setFirstName("Intizar");
	        customer.setLastName("Aliyeva");
	        customer.setYearOfBirth(2000);
	        customer.setNationalityId(258741369);
	BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter()) ;
	customerManager.save(customer);

	}

}
