/**
 * This project is a tutorial demo for basic CRUD operations using JDBC
 *
 * This is the main driver class for this program
 *
 * Author: Baber Arjumand
 * Date:   Aug 04 2019
 * Time:   10:43 PM
 */

package com.baberarjumand.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class JDBCExecutor {

    public static void main(String[] args) {
//        System.out.println("Hello Learning JDBC");

        final String HOST = "localhost";
        final String DATABASE_NAME = "hplussport";
        final String USERNAME = "postgres";
        final String PASSWORD = "1418";

        DatabaseConnectionManager dcm = new DatabaseConnectionManager(HOST, DATABASE_NAME, USERNAME, PASSWORD);
        try {
            Connection connection = dcm.getConnection();
//            CustomerDAO customerDAO = new CustomerDAO(connection);

            // Create new entry
//            Customer customer = new Customer();
//            customer.setFirstName("George");
//            customer.setLastName("Washington");
//            customer.setEmail("george.washington@wh.gov");
//            customer.setPhone("(555) 555-6543");
//            customer.setAddress("1234 Main St");
//            customer.setCity("Mount Vernon");
//            customer.setState("VA");
//            customer.setZipCode("22121");
//            customerDAO.create(customer);

            // Read data
//            Customer customer = customerDAO.findById(10000);
//            System.out.println(customer.getFirstName() + " " + customer.getLastName());

            // Update data
//            Customer customer = customerDAO.findById(10000);
//            System.out.println(customer.getFirstName() + " " + customer.getLastName() + " " + customer.getEmail());
//            customer.setEmail("gwashington@wh.gov");
//            customer = customerDAO.update(customer);
//            System.out.println(customer.getFirstName() + " " + customer.getLastName() + " " + customer.getEmail());

            // Delete data
//            Customer customer = new Customer();
//            customer.setFirstName("John");
//            customer.setLastName("Adams");
//            customer.setEmail("jadams.wh.gov");
//            customer.setAddress("1234 Main St");
//            customer.setCity("Arlington");
//            customer.setState("VA");
//            customer.setPhone("(555) 555-9845");
//            customer.setZipCode("01234");
//
//            Customer dbCustomer = customerDAO.create(customer);
//            System.out.println(dbCustomer);
//            dbCustomer = customerDAO.findById(dbCustomer.getId());
//            System.out.println(dbCustomer);
//            dbCustomer.setEmail("john.adams@wh.gov");
//            dbCustomer = customerDAO.update(dbCustomer);
//            System.out.println(dbCustomer);
//            customerDAO.delete(dbCustomer.getId());

            // Challenge
//            OrderDAO orderDAO = new OrderDAO(connection);
//            Order order = orderDAO.findById(1000);
//            System.out.println(order);

            // Using stored procedure to get all orders for customer
//            List<Order> orders = orderDAO.getOrdersForCustomer(789);
//            orders.forEach(System.out::println);

            // Ordering and limiting results
//            CustomerDAO customerDAO = new CustomerDAO(connection);
//            customerDAO.findAllSorted(20).forEach(System.out::println);

            // Testing getAll functionality for customers
//            CustomerDAO customerDAO = new CustomerDAO(connection);
//            customerDAO.findAll().forEach(System.out::println);

            // Paging results
            CustomerDAO customerDAO = new CustomerDAO(connection);
            customerDAO.findAllSorted(20).forEach(System.out::println);
            System.out.println("Paged");
            for (int i = 1; i < 3; i++) {
                System.out.println("Page Number: " + i);
                customerDAO.findAllPaged(10, i).forEach(System.out::println);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
