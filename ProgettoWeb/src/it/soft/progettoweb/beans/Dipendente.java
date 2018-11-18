package it.soft.progettoweb.beans;

import java.math.BigDecimal;
import java.util.Date;

import it.soft.progettoweb.utils.Utility;

public class Dipendente {
	private Integer id = null;
	private String cognome = null;
	private String nome = null;
 	private BigDecimal dataAssunzione = null; 

	public Dipendente() {
		
	}
	
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public BigDecimal getDataAssunzione() {
		return dataAssunzione;
	}

	public String getDataAssunzioneWeb() {
		return Utility.getDataFormatoDDMMAAAA(dataAssunzione);
	}
	
	public void setDataAssunzione(BigDecimal dataAssunzione) {
		this.dataAssunzione = dataAssunzione;
	}
	public void setDataAssunzioneDate(Date date) {
		this.dataAssunzione = Utility.convertDateToBigDecimal(date);
	}
	public Date getDataAssunzioneDate() {
		return Utility.convertBigDecimalToDate(this.dataAssunzione);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	//METODI AUTOGENERATI DALL'EDITOR, VANNO RIGENERATI OGNI VOLTA CHE S'INTRODUCONO NUOVI ATTRIBUTI

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((dataAssunzione == null) ? 0 : dataAssunzione.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dipendente other = (Dipendente) obj;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (dataAssunzione == null) {
			if (other.dataAssunzione != null)
				return false;
		} else if (!dataAssunzione.equals(other.dataAssunzione))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dipendente [id=" + id + ", cognome=" + cognome + ", nome=" + nome + ", dataAssunzione=" + dataAssunzione
				+ "]";
	}	
}
