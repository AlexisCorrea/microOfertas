package com.accenture.repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.accenture.model.RegistrarRequest;
@EnableScan
public interface ofertaRepository extends CrudRepository<RegistrarRequest, String> {
	public List<RegistrarRequest> findByFechaFinal(String fechaFinal);
	public List<RegistrarRequest> findByIdnegocioAndTipo(List<String> negocios,String tipo);
	public List<RegistrarRequest> findByIdnegocio(String idnegocio);
	public List<RegistrarRequest> findByTipo(String tipo);
	public List<RegistrarRequest> findByIdnegocioAndTipo(String id,String tipo);
	public RegistrarRequest findById(String id);
}
