package com.component.desafio;

import entities.Order;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import services.OrderService;

@Component
@SpringBootApplication
@ComponentScan(basePackages = {"DesafioApplication", "services"})
public class DesafioApplication implements CommandLineRunner{

	public final OrderService orderService;

	public DesafioApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run  (DesafioApplication.class, args);
	}

	public void run(String... args) throws Exception {

		System.out.println("================================");

		Order order = new Order(134, 150.00, 20.0);
		System.out.println("Pedido código:" + order.getCode());
		System.out.println("Valor total:" + orderService.total(order));

		System.out.println("================================");

		Order order2 = new Order(2282, 800.00, 10.0);
		System.out.println("Pedido código:" + order2.getCode());
		System.out.println("Valor total:" + orderService.total(order2));

		System.out.println("================================");

		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código:" + order3.getCode());
		System.out.println("Valor total:" + orderService.total(order3));

		System.out.println("================================");
	}

}