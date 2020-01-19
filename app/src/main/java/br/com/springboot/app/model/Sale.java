package br.com.springboot.app.model;

import javax.persistence.*;

@Entity
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_book")
	private Book idBook;

	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client idClient;

	@Column(name = "quantity")
	private Integer quantity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Book getIdBook() {
		return idBook;
	}

	public void setIdBook(Book idBook) {
		this.idBook = idBook;
	}

	public Client getIdClient() {
		return idClient;
	}

	public void setIdClient(Client idClient) {
		this.idClient = idClient;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
