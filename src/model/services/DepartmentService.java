package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {

	/*private DepartmentDao dao = DaoFactory.createDepartmentDao();*/		
	
	public List<Department> findAll() { /* Vamos mockar os dados: MOCK s� quando
	 retorna os dados de "mentirinha" 
		return dao.findAll();*/
		List<Department> list = new ArrayList<>();
		list.add(new Department(1, "Books"));
		list.add(new Department(2, "Computers"));
		list.add(new Department(3, "Eletronics"));
		return list;
	}

	/*public void saveOrUpdate(Department obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		} else {
			dao.update(obj);
		}
	}

	public void remove(Department obj) {
		dao.deleteById(obj.getId());
	}*/
}
