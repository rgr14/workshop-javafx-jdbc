package modelo.servicos;

import java.util.ArrayList;
import java.util.List;

import modelo.entidades.Departamento;

public class DepartamentoServico {
	
	public List<Departamento> findAll() {
		List<Departamento> list = new ArrayList<>();
		list.add(new Departamento(1, "Books"));
		list.add(new Departamento(2, "Computers"));
		list.add(new Departamento(3, "Electronics"));
		return list;
	}
}
