package com.coderhouse.Entities;


import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Invoice_details")
public class InvoiceDetails {
		@Id
		@Column(name = "invoice_details_id")
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Integer id_invoice;
		
		
		@ManyToOne
		@JoinColumn(name = "id_invoice")
		private Invoice invoice;
		
		@Column(name = "amount")
		private Integer amount;
		
		@ManyToOne
		@JoinColumn(name = "id_product")
		private Product product;
		
		@Column(name = "price")
		private Double price;
		
		public InvoiceDetails(Integer id_invoice, Invoice invoice, Integer amount, Product product, Double price) {
			super();
			this.id_invoice = id_invoice;
			this.invoice = invoice;
			this.amount = amount;
			this.product = product;
			this.price = price;
		}
		
		public InvoiceDetails() {};

		public Integer getId_invoice() {
			return id_invoice;
		}

		public void setId_invoice(Integer id_invoice) {
			this.id_invoice = id_invoice;
		}

		public Invoice getInvoice() {
			return invoice;
		}

		public void setInvoice(Invoice invoice) {
			this.invoice = invoice;
		}

		public Integer getAmount() {
			return amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

	
		
		
}