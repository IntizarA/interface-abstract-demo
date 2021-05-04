package interfaceAbstractDemo;

public class StarbucksCustomerManager extends BaseCustomerManager implements ICustomerService{
	   private ICustomerCheckService iCustomerCheckService;

	    public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService) {
	        this.iCustomerCheckService = iCustomerCheckService;
	    }

	    @Override
	    public void save(Customer customer) {
	if(iCustomerCheckService.checkIfRealPerson(customer))
	save(customer);
	else
	    System.out.println("Not a valid person");
	    }
	}
