package com.accenture.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.accenture.model.RegistrarRequest;

public interface ofertaRepository extends CrudRepository<RegistrarRequest, String> {
	public List<RegistrarRequest> findByFechaFinal(String fechaFinal);
	public List<RegistrarRequest> findByIdnegocio(String idnegocio);
	public RegistrarRequest findById(String id);
}
