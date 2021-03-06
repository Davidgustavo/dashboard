package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("PedidoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface PedidoDAO extends JpaRepository<Pedido, java.lang.String> {

  /**
   * Obtém a instância de Pedido utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Pedido entity WHERE entity.id = :id")
  public Pedido findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Pedido utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Pedido entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Avaliacao entity WHERE entity.pedido.id = :id")
  public Page<Avaliacao> findAvaliacao(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key user
   * @generated
   */
  @Query("SELECT entity FROM Pedido entity WHERE entity.user.id = :id")
  public Page<Pedido> findPedidosByUser(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key resturante
   * @generated
   */
  @Query("SELECT entity FROM Pedido entity WHERE entity.resturante.id = :id")
  public Page<Pedido> findPedidosByResturante(@Param(value="id") java.lang.String id, Pageable pageable);

}
