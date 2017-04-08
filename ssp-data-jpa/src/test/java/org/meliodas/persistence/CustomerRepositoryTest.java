package org.meliodas.persistence;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.meliodas.Application;
import org.meliodas.persistence.model.Customer;
import org.meliodas.persistence.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void testCustomerRepository(){
        customerRepository.save(new Customer("test1", "test1", "test1@springboot.com"));
        customerRepository.save(new Customer("test2", "test2", "test2@springboot.com"));
        customerRepository.save(new Customer("test3", "test3", "test3@springboot.com"));

        Assert.assertEquals(customerRepository.findOne(1L).getEmail(), "test1@springboot.com");
        Assert.assertEquals(customerRepository.findOne(2L).getEmail(),"test2@springboot.com");
        Assert.assertEquals(customerRepository.findOne(3L).getEmail(),"test3@springboot.com");
        Assert.assertEquals(customerRepository.findByLastName("test3").get(0).getEmail(), "test3@springboot.com");

    }


}
