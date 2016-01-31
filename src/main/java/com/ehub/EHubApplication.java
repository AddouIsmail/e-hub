package com.ehub;

import com.ehub.entities.*;
import com.ehub.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class EHubApplication implements CommandLineRunner{
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private SupplierRepository supplierRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private OrderLinesRepository orderLinesRepository;
	@Autowired
	private FactureRepository factureRepository;
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private PaymentModeRepository payePaymentModeRepository;
	@Autowired
	private AdminRepository adminRepository;

	public static void main(String[] args){
		SpringApplication.run(EHubApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		Category c = new Category();
		Supplier s=new Supplier();
		Product p=new Product();
		PaymentMode pm=new PaymentMode();
		OrderLines ol=new OrderLines();
		Order o=new Order();
		Facture f=new Facture();
		Client cli=new Client();
		Category cat=new Category();
		Admin a=new Admin();

		categoryRepository.deleteAll();
		for(int i=0 ; i<50 ; i++){
			c.setId(""+i);
			c.setName("Catégorie"+i);
			c.setSuperCategory("SuperCategory");
			categoryRepository.save(c);
		}
		supplierRepository.deleteAll();
		for(int i=0; i<100 ; i++){
			s.setAddress("Adresse "+i);
			s.setName("Name "+i);
			s.setPhoneNumber("PhoneNumber +212 6 5365"+i);
			supplierRepository.save(s);
		}
		productRepository.deleteAll();
		for(int i=0; i<200 ; i++){
			p.setName("product "+i);
			p.setBrand("Brand "+i);
			p.setBuyPrice(i*7);
			p.setDescription("Description "+i);
			p.setDiscount(i/100);
			p.setIdCategory(""+(int)i/4);
			p.setIdSupplier(""+(int)i/4);
			p.setShippedPrice(i*4);
			p.setQuantity(i);
			p.setId(""+i);
			productRepository.save(p);
		}
		payePaymentModeRepository.deleteAll();
		for(int i=0; i<3 ; i++){
			pm.setId(""+i);
			pm.setModality("modality "+i);
			payePaymentModeRepository.save(pm);
		}
		orderLinesRepository.deleteAll();
		for(int i=0; i<1000 ; i++){
			ol.setId(""+i);
			ol.setQuantity(i);
			ol.setIdOrder(""+(int)i%100);
			ol.setIdProduct(""+(int) i%200);
			orderLinesRepository.save(ol);
		}
		orderRepository.deleteAll();
		for(int i=0; i<100 ; i++){
			o.setId(""+i);
			o.setIdClient(""+(int) i/2);
			o.setOrderAmount((double) (i*7));
			o.setOrderDate(new Date());
			o.setOrderDeadline(i);
			o.setShipLocation("ship location"+i);
			o.setShippingPrice(i*3);
			orderRepository.save(o);
		}
		factureRepository.deleteAll();
		for(int i=0; i<1000 ; i++){
			f.setId("f"+i);
			f.setIdOrder(""+i);
			f.setIdPaymentMode(""+(i%3)+1);
			f.setTotalPrice((double) (i *(7/3)));
			factureRepository.save(f);
		}
		clientRepository.deleteAll();
		for(int i=0; i<100 ; i++){
			cli.setId(""+i);
			cli.setAddress("addresse client "+1);
			cli.setBirthDate(new Date());
			cli.setEmail("client"+i+"@gmail.com");
			cli.setFirstName("firstname "+i);
			cli.setLastName("lastname "+i);
			cli.setPassword("password"+i);
			cli.setPhoneNumber("+212 6 5645"+i);
			cli.setPicture("user.jpg");
			cli.setSex("M");
			clientRepository.save(cli);
		}
	}
}
