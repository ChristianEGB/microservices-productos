package com.formacionbdi.springboot.app.productos.services.interfaces;

import java.util.List;

import com.formacionbdi.springboot.app.commons.models.entities.Producto;



public interface IProductoService {
	
	public List<Producto> findAll();
	
	public Producto findById(Long id);

	public Producto save(Producto producto);
	
	public void deleteById(Long id);
}
