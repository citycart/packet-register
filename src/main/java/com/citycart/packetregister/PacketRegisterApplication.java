package com.citycart.packetregister;

import com.citycart.packetregister.model.Address;
import com.citycart.packetregister.model.Order;
import com.citycart.packetregister.model.OrderStatus;
import com.citycart.packetregister.model.Retailer;
import com.citycart.packetregister.model.builder.AddressBuilder;
import com.citycart.packetregister.model.builder.OrderBuilder;
import com.citycart.packetregister.repository.OrderRepository;
import com.citycart.packetregister.repository.RetailerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

import javax.annotation.PostConstruct;

import static com.citycart.packetregister.model.OrderStatus.Status.CREATED;
import static java.time.LocalDateTime.now;

@SpringBootApplication
@EnableMongoAuditing
public class PacketRegisterApplication {


	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private RetailerRepository retailerRepository;

	public static void main(String[] args) {
		SpringApplication.run(PacketRegisterApplication.class, args);
	}

//	@PostConstruct
	public void run(){
		orderRepository.deleteAll();

		final Address retailerAddress1 = new AddressBuilder()
				.withAddressLine1("15 bd des routes")
				.withZipCode("75018")
				.withCity("Paris")
				.build();
		final Retailer retailer1 = retailerRepository.save(new Retailer("retailer 1", retailerAddress1));

		final Address retailerAddress2 = new AddressBuilder()
				.withAddressLine1("141 av de la marche")
				.withZipCode("75017")
				.withCity("Paris")
				.build();
		final Retailer retailer2 = retailerRepository.save(new Retailer("retailer 2", retailerAddress2));

		final Address clientAddress1 = new AddressBuilder()
				.withAddressLine1("11 bd de chez lui")
				.withZipCode("75018")
				.withCity("Paris")
				.build();
		final Address clientAddress2 = new AddressBuilder()
				.withAddressLine1("27 av des roses")
				.withZipCode("75017")
				.withCity("Paris")
				.build();

		final Order oreder1 = new OrderBuilder()
				.withOrderNumber("753951")
//				.withCtreationDate(now())
				.withWithdrawAddress(retailerAddress1)
				.withDeliveryAddress(clientAddress1)
				.withPacksCount(2)
				.withCurrentStatus(new OrderStatus(CREATED, now()))
				.withRetailer(retailer1)
				.build();
		orderRepository.save(oreder1);

		final Order oreder2 = new OrderBuilder()
				.withOrderNumber("76589324")
//				.withCtreationDate(now())
				.withWithdrawAddress(retailerAddress2)
				.withDeliveryAddress(clientAddress2)
				.withPacksCount(1)
				.withCurrentStatus(new OrderStatus(CREATED, now()))
				.withRetailer(retailer2)
				.build();
		orderRepository.save(oreder2);

		final Order oreder3 = new OrderBuilder()
				.withOrderNumber("951357681")
//				.withCtreationDate(now())
				.withWithdrawAddress(retailerAddress1)
				.withDeliveryAddress(clientAddress2)
				.withPacksCount(3)
				.withCurrentStatus(new OrderStatus(CREATED, now()))
				.withRetailer(retailer1)
				.build();
		orderRepository.save(oreder3);

		System.out.println("Orders found with findAll():");
		System.out.println("-------------------------------");
		orderRepository.findAll().forEach(System.out::println);

//		System.out.println("Orders found with findByStoreId('123'):");
//		orderRepository.findByStoreId("123").forEach(System.out::println);
//
//		System.out.println("Orders found with findByDeliveryManId('456'):");
//		orderRepository.findByDeliveryManId("456").forEach(System.out::println);
	}
}
