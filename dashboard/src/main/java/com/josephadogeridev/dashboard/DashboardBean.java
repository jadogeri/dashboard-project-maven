package com.josephadogeridev.dashboard;


import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;


@Named("dashboardBean")
@ViewScoped
public class DashboardBean implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2101024544666552832L;
	private List<Product> products;
    private String status = "System Online";

    @PostConstruct
    public void init() {
        products = Arrays.asList(
            new Product(1, "Laptop", "Electronics", 1200.00),
            new Product(2, "Phone", "Electronics", 800.00),
            new Product(3, "Desk Chair", "Furniture", 250.00)
        );
    }

    // Getters and Setters
    public List<Product> getProducts() { return products; }
    public String getStatus() { return status; }
    public void setProducts(List<Product> products) { this.products = products; }
    public void setStatus(String status) {  this.status = status; }
    
}