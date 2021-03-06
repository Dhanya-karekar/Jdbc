package com.xworkz.customer.dao;

import java.util.Arrays;
import java.util.Collection;

import com.xworkz.customer.dto.CustomerDTO;
import com.xworkz.customer.dto.Education;
import com.xworkz.customer.service.CustomerService;
import com.xworkz.customer.service.CustomerServiceImpl;

public class CustomerSaveAllTester {

	public static void main(String[] args) {

		CustomerService service = new CustomerServiceImpl();
		CustomerDTO dto1 = new CustomerDTO("Dhanya", "Banglore", "Paris", "Thangavel street, Dharmapuri", false,
				123456781, Education.BE);
		CustomerDTO dto2 = new CustomerDTO("Rakshitha", "Shimoga", "Goa", "Venugopal nagar, Ananthapur", false,
				123456782, Education.BE);
		CustomerDTO dto3 = new CustomerDTO("Sahana", "Bangalore", "Vijayawada", "RK nagar, Tumkur", false, 123456783,
				Education.BE);
		CustomerDTO dto4 = new CustomerDTO("Shantanu", "Bombay", "Chennai", "Arch Gate, Neyveli", true, 123456784,
				Education.ME);
		CustomerDTO dto5 = new CustomerDTO("shoba", "Mysore", "Goa", "Gorimedu, Salem", false, 123456785,
				Education.MBA);

		Collection<CustomerDTO> collection = Arrays.asList(dto1, dto2, dto3, dto4, dto5);
		service.ValidateAndSaveAll(collection);

	}
}