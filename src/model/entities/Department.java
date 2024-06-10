package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;

	public Department() {
	}

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Gerar hashCode por que ele compara as variáveis pelo conteúdo,
	// não por referência de ponteiro.

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return id == other.id;
	}

	// ToString é para ter uma facilidade para exibir os valores do objeto quando
	// estiver testando.
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

	// Na linguagem Java tem que fazer o serializable se quisermos que o nosso
	// objeto
	// trafegue em aqrquivos, ou em rede.

}
