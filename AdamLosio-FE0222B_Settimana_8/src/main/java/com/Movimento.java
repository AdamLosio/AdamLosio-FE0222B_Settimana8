package com;

import java.time.LocalDate;
import java.util.Date;

public class Movimento {
	private String tipo;
	private int num=0;
		
	public Movimento() {}
	public Movimento (String tipo) {
		this.tipo=tipo;
		num++;
		}
	
	public String getTipo() {
		return tipo;
		}

	public int getNum() {
		return num;
		}

	public void setTipo(String tipo) {
		this.tipo = tipo;
		}
	
	public void setNum(int num) {
		this.num = num;
		}}
