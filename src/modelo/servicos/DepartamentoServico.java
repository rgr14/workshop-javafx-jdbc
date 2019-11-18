package modelo.servicos;

import java.util.List;

import modelo.dao.DaoFactory;
import modelo.dao.DepartmentDao;
import modelo.entidades.Department;

public class DepartamentoServico {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List<Department> findAll() {
		return  dao.findAll();
	}
}
