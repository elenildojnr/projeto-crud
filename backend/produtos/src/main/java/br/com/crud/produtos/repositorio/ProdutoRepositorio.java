package br.com.crud.produtos.repositorio;

import org.springframework.data.repository.CrudRepository;
import br.com.crud.produtos.modelo.ProdutoModelo;

public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Long> {

}