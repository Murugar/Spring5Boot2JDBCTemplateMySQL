package com.iqmsoft.dao;

import java.util.List;

import com.iqmsoft.model.Contato;

public interface ContatoDAO<Controller> extends DAO<Contato>{
	Contato findByName(String name);
	Contato findByEmail(String email);
	Contato findByPhone(String telefone);
	List<Contato> findByNameEmailPhone(Contato contato);
}
