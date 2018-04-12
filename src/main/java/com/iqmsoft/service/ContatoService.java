package com.iqmsoft.service;

import java.util.List;

import com.iqmsoft.model.Contato;

public interface ContatoService {
	List<Contato> getAll();

	Contato getById(Integer id);

	void addContact(Contato contato);

	void updateContact(Contato contato);

	void deleteContact(Contato contato);

	List<Contato> getByNomeEmailTelefoneEndereco(Contato contato);
}
