package com.iqmsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqmsoft.dao.ContatoDAO;
import com.iqmsoft.model.Contato;
@Service
public class ContatoServiceImpl implements ContatoService{
	@Autowired
	ContatoDAO<Contato> dao;

	public List<Contato> getAll() {
		return dao.findAll();
	}

	public Contato getById(Integer id) {
		return dao.find(id);
	}


	public void addContact(Contato contato) {
		dao.add(contato);
	}

	public void updateContact(Contato contato) {
		dao.update(contato);
	}

	public void deleteContact(Contato contato) {
		dao.delete(contato);
	}
	
	public List<Contato> getByNomeEmailTelefoneEndereco(Contato contato) {
		Contato contactSurroundedByPercent = new Contato();
		contactSurroundedByPercent.setNome("%"+contato.getNome()+"%");
		contactSurroundedByPercent.setEmail("%"+contato.getEmail()+"%");
		contactSurroundedByPercent.setEndereco("%"+contato.getEndereco()+"%");
		contactSurroundedByPercent.setTelefone("%"+contato.getTelefone()+"%");
		return dao.findByNameEmailPhone(contactSurroundedByPercent);
	}
}
