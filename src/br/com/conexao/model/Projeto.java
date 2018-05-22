package br.com.conexao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Projeto {
	private long id;
	private String nome;
	private String local;
	private Proprietario proprietario;
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Projeto [id=" + id + ", nome=" + nome + ", local=" + local + ", proprietario=" + proprietario + "]"+"\n";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((proprietario == null) ? 0 : proprietario.hashCode());
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
		Projeto other = (Projeto) obj;
		if (id != other.id)
			return false;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (proprietario == null) {
			if (other.proprietario != null)
				return false;
		} else if (!proprietario.equals(other.proprietario))
			return false;
		return true;
	}
	
}
