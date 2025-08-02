/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluacion.ventas.repository;



import com.evaluacion.ventas.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {

    @Query("SELECT DISTINCT c FROM Categoria c JOIN Producto p ON p.categoria = c JOIN Venta v ON v.producto = p WHERE YEAR(v.fechaVenta) = 2019")
List<Categoria> findCategoriasConVentas2019();
}
