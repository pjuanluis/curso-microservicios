package academy.digitallab.store.shopping.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import academy.digitallab.store.shopping.model.Customer;

@FeignClient(name = "customer-service")
@RequestMapping("/customers")
public interface ICustomerClient {
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("id") long id);

}
