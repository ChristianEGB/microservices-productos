package com.formacionbdi.springboot.app.productos.services.interfaces;

import java.util.List;

import com.formacionbdi.springboot.app.productos.entities.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	
	public Producto findById(Long id);

}
