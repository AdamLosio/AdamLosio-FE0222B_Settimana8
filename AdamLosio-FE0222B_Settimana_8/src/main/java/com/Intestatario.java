package com;

public class Intestatario {
	private int id;
	private String nome;
	private String cognome;
		
	public Intestatario() {}
	public Intestatario(int id, String nome, String cognome) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		}
	
	public int getId() {
		return id;
		}

	public String getNome() {
		return nome;
		}

	public String getCognome() {
		return cognome;
		}

	public void setId(int id) {
		this.id = id;
		}

	public void setNome(String nome) {
		this.nome = nome;
		}

	public void setCognome(String cognome) {
		this.cognome = cognome;
		}}
