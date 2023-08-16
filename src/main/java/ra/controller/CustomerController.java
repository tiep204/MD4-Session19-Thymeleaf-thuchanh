package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.model.entity.Customer;
import ra.model.service.ICustomerService;
import ra.model.serviceImpl.CustomerServiceIMPL;

import java.util.List;

@Controller
@RequestMapping(value = {"/","/customer"})
public class CustomerController {
    private final ICustomerService customerService = new CustomerServiceIMPL();
    @GetMapping
    public String index(Model model) {
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers", customerList);
        return "/index";
    }
}