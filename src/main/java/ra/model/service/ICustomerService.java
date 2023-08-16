package ra.model.service;

import ra.model.entity.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    void update(int id, Customer customer);

    Customer findById(int id);

    void remote(int id);
}
