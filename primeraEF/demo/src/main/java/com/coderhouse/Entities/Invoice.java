package com.coderhouse.Entities;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Invoice")
public class Invoice {
		@Id
		@Column(name = "id_invoice")
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Integer id_invoice;
		
		
		@Override
		public int hashCode() {
			return Objects.hash(id_invoice);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Invoice other = (Invoice) obj;
			return Objects.equals(id_invoice, other.id_invoice);
		}

		@ManyToOne
		@JoinColumn(name = "dni")
		private Client client;
		
		@Column(name = "created_at")
		private LocalDateTime fecha;
		
		public Integer getId_invoice() {
			return id_invoice;
		}

		public void setId_invoice(Integer id_invoice) {
			this.id_invoice = id_invoice;
		}

	
		public Client getClient() {
			return client;
		}

		public void setClient(Client client) {
			this.client = client;
		}

		public LocalDateTime getFecha() {
			return fecha;
		}

		public void setFecha(LocalDateTime fecha) {
			this.fecha = fecha;
		}

		public Double getTotal() {
			return total;
		}

		public void setTotal(Double total) {
			this.total = total;
		}

		@Column(name = "total")
		private Double total;
		
		public Invoice () {}
}
