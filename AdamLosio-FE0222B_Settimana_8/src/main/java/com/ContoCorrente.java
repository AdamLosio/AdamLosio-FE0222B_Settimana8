package com;

import java.util.ArrayList;
import java.util.List;

/*
 * all'intenro di questa classe avrei creato aggiunto anche un parametro di tipo int numConto in quanto a mio avviso 
 * dovendo essere un modello di un'entita' reale non esiste un conto corrente senza il numero di conto ad esso relativo
 */
		
public class ContoCorrente {
	private String date;
	private String iban;
	private double saldo;
	private Intestatario intestatario;
	private List<Movimento> listaMovimenti;

	/*********************	costruttore	*********************/
	
	public ContoCorrente() {}
	
	public ContoCorrente(String date, String iban, double saldo, Intestatario intestatario) {
		this.date = date;
		this.iban = iban;
		this.saldo = saldo;
		this.intestatario = intestatario;
		this.listaMovimenti=new ArrayList<Movimento>();
		
	}
	
	/*********************	getters e setters	*********************/
	public String getDate() {
		return date;
	}
	public String getIban() {
		return iban;
	}
	public double getSaldo() {
		return saldo;
	}
	public Intestatario getIntestatario() {
		return intestatario;
	}
	public List<Movimento> getListaMovimenti() {
		return listaMovimenti;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setIntestatario(Intestatario intestatario) {
		this.intestatario = intestatario;
	}

	public void setListaMovimenti(List<Movimento> listaMovimenti) {
		this.listaMovimenti = listaMovimenti;
	}
	
	public void nuovoMovimento(String tipo) {
		listaMovimenti.add(new Movimento(tipo));
	}
	

	
	
	

	

}
