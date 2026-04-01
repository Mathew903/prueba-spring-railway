package com.code.apirest.prueba.Repositories;

import com.code.apirest.prueba.Entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
