package org.hibernaterelations;

import org.hibernaterelations.services.CustomerServices;
import org.hibernaterelations.services.CustomerServicesImp;
import org.hibernaterelations.services.OrderServices;
import org.hibernaterelations.services.OrderServicesImp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernaterelationsApplication {

    public static void main(String[] args) {


        SpringApplication.run(HibernaterelationsApplication.class, args);}

        /*
        ConfigurableApplicationContext configurableApplicationContext =
        SpringApplication.run(HibernaterelationsApplication.class, args);
        CustomerRepository customerRepository =configurableApplicationContext.getBean(CustomerRepository.class);
        OrderRepository orderRepository=configurableApplicationContext.getBean(OrderRepository.class);

        Customer customer = new Customer();
        customer.setName("Ali");
        customerRepository.save("customer");

        Order order =new Order();
        order.setOrderType("pizza");
        orderRepository.save("order");*/

       /* public OrderCustomerServices orderCustomerServices()
        {
            new OrderCustomerServicesImp();
        }*/

    @Bean
    public CustomerServices customerServices(){
        return new CustomerServicesImp();
    }

    @Bean
    public OrderServices orderServices(){
        return new OrderServicesImp();
    }

    }


