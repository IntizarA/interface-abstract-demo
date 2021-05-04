package interfaceAbstractDemo;
import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
public class MernisServiceAdapter implements ICustomerCheckService{
    @Override
    public boolean checkIfRealPerson(Customer customer) {
    	KPSPublicSoap client = new KPSPublicSoapProxy();
    	boolean result=false;
    	try {
    		result=client.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),
        			customer.getId());		
		} catch (Exception e) {
			System.out.println("Not a valid person");
		}
    	return result;
    
    }
}
