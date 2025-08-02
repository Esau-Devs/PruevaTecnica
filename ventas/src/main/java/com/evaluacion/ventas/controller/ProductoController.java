/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.evaluacion.ventas.controller;



import com.evaluacion.ventas.Categoria;
import com.evaluacion.ventas.Producto;
import com.evaluacion.ventas.repository.CategoriaRepository;
import com.evaluacion.ventas.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductoController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping("/")
    public String mostrarFormulario(Model model) {
        List<Categoria> categorias = categoriaRepository.findCategoriasConVentas2019();
        model.addAttribute("categorias", categorias);
        return "productos";
    }

    @PostMapping("/filtrar")
    public String filtrarProductos(@RequestParam Integer categoriaId, Model model) {
        List<Categoria> categorias = categoriaRepository.findCategoriasConVentas2019();
        List<Producto> productos = productoRepository.findByCategoriaIdEnVentas2019(categoriaId);
        model.addAttribute("categorias", categorias);
        model.addAttribute("productos", productos);
        model.addAttribute("categoriaSeleccionada", categoriaId);
        return "productos";
    }
}
