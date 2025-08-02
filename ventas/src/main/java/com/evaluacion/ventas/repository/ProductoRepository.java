/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluacion.ventas.repository;

import com.evaluacion.ventas.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {

    @Query("SELECT p FROM Producto p JOIN p.ventas v WHERE p.categoria.categoriaId = :categoriaId AND YEAR(v.fechaVenta) = 2019")
    List<Producto> findByCategoriaIdEnVentas2019(Integer categoriaId);
}