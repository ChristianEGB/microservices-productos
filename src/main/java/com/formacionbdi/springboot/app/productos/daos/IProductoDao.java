package com.formacionbdi.springboot.app.productos.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formacionbdi.springboot.app.commons.models.entities.Producto;

@Repository
public interface IProductoDao extends CrudRepository<Producto, Long> {

}
