package com.amspace.visitas.domain;

import javax.persistence.*;

@Entity
@Table(name = "empresa")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private Long id;
    
    @Column(name = "ruc")
    private String ruc;

    @Column(name = "razon_social")
    private String name;

    @Column(name = "direccion")
    private String adress;
    
    @Column(name = "empresa_usuaria")
    private Integer user_company;
    
    @Column(name = "estado_registro")
    private Integer state;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Integer getUser_company() {
		return user_company;
	}

	public void setUser_company(Integer user_company) {
		this.user_company = user_company;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
    
    
}
