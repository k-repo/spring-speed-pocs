package org.meliodas;


import org.meliodas.persistence.model.Customer;
import org.meliodas.persistence.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("org.meliodas.persistence.repository")
@EntityScan("org.meliodas.persistence.model")
@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }


    @Autowired
    CustomerRepository customerRepository;


    public void run(String... strings) throws Exception {

        customerRepository.save(new Customer("test1", "test", "test1@springboot.com"));
        customerRepository.save(new Customer("test2", "test2", "test2@springboot.com"));
        customerRepository.save(new Customer("test3", "test3", "test3@springboot.com"));


        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Customer customer : customerRepository.findAll()) {
            System.out.println(customer);
        }

        // fetch an individual customer by ID
        Customer customer = customerRepository.findOne(1L);
        System.out.println("Customer found with findOne(1L):");
        System.out.println("--------------------------------");
        System.out.println(customer);
        System.out.println();

        // fetch customers by last name
        System.out.println("Customer found with findByLastName('azaddyne'):");
        System.out.println("--------------------------------------------");
        for (Customer bauer : customerRepository.findByLastName("azaddyne")) {
            System.out.println(bauer);
        }

    }
}
