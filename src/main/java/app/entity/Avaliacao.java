package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela AVALIACAO
 * @generated
 */
@Entity
@Table(name = "\"AVALIACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Avaliacao")
public class Avaliacao implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "embalagem", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer embalagem;

  /**
  * @generated
  */
  @Column(name = "tempo_de_entrega", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer tempo_de_entrega;

  /**
  * @generated
  */
  @Column(name = "qualidade_da_comida", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer qualidade_da_comida;

  /**
  * @generated
  */
  @Column(name = "custo_beneficio", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer custo_beneficio;

  /**
  * @generated
  */
  @Column(name = "comentario", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String comentario;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_pedido", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Pedido pedido;

  /**
   * Construtor
   * @generated
   */
  public Avaliacao(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Avaliacao setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém embalagem
   * return embalagem
   * @generated
   */
  
  public java.lang.Integer getEmbalagem(){
    return this.embalagem;
  }

  /**
   * Define embalagem
   * @param embalagem embalagem
   * @generated
   */
  public Avaliacao setEmbalagem(java.lang.Integer embalagem){
    this.embalagem = embalagem;
    return this;
  }

  /**
   * Obtém tempo_de_entrega
   * return tempo_de_entrega
   * @generated
   */
  
  public java.lang.Integer getTempo_de_entrega(){
    return this.tempo_de_entrega;
  }

  /**
   * Define tempo_de_entrega
   * @param tempo_de_entrega tempo_de_entrega
   * @generated
   */
  public Avaliacao setTempo_de_entrega(java.lang.Integer tempo_de_entrega){
    this.tempo_de_entrega = tempo_de_entrega;
    return this;
  }

  /**
   * Obtém qualidade_da_comida
   * return qualidade_da_comida
   * @generated
   */
  
  public java.lang.Integer getQualidade_da_comida(){
    return this.qualidade_da_comida;
  }

  /**
   * Define qualidade_da_comida
   * @param qualidade_da_comida qualidade_da_comida
   * @generated
   */
  public Avaliacao setQualidade_da_comida(java.lang.Integer qualidade_da_comida){
    this.qualidade_da_comida = qualidade_da_comida;
    return this;
  }

  /**
   * Obtém custo_beneficio
   * return custo_beneficio
   * @generated
   */
  
  public java.lang.Integer getCusto_beneficio(){
    return this.custo_beneficio;
  }

  /**
   * Define custo_beneficio
   * @param custo_beneficio custo_beneficio
   * @generated
   */
  public Avaliacao setCusto_beneficio(java.lang.Integer custo_beneficio){
    this.custo_beneficio = custo_beneficio;
    return this;
  }

  /**
   * Obtém comentario
   * return comentario
   * @generated
   */
  
  public java.lang.String getComentario(){
    return this.comentario;
  }

  /**
   * Define comentario
   * @param comentario comentario
   * @generated
   */
  public Avaliacao setComentario(java.lang.String comentario){
    this.comentario = comentario;
    return this;
  }

  /**
   * Obtém pedido
   * return pedido
   * @generated
   */
  
  public Pedido getPedido(){
    return this.pedido;
  }

  /**
   * Define pedido
   * @param pedido pedido
   * @generated
   */
  public Avaliacao setPedido(Pedido pedido){
    this.pedido = pedido;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Avaliacao object = (Avaliacao)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
