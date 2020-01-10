package com.formacionbdi.springboot.app.productos.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.app.productos.daos.IProductoDao;
import com.formacionbdi.springboot.app.productos.entities.Producto;
import com.formacionbdi.springboot.app.productos.services.interfaces.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	IProductoDao productoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return productoDao.findById(id).orElse(null);
	}

}