package com.accenture.model;

import java.io.FileInputStream;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegistrarRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-14T12:25:25.106-05:00")
@DynamoDBTable(tableName="oferta")
public class RegistrarRequest   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("producto")
  private String producto = null;

  @JsonProperty("detalle")
  private String detalle = null;

  @JsonProperty("valor")
  private String valor = null;

  @JsonProperty("tipo")
  private String tipo = null;

  
  @JsonProperty("descuento")
  private String descuento = null;

  @JsonProperty("foto")
  private String foto = null;

  @JsonProperty("idnegocio")
  private String idnegocio = null;

  @JsonProperty("fecha_inicio")
  private String fechaInicio = null;

  @JsonProperty("fecha_final")
  private String fechaFinal = null;

  public RegistrarRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBHashKey
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RegistrarRequest producto(String producto) {
    this.producto = producto;
    return this;
  }

  /**
   * Get producto
   * @return producto
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public RegistrarRequest detalle(String detalle) {
    this.detalle = detalle;
    return this;
  }
  

  @DynamoDBAttribute
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public RegistrarRequest tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Get detalle
   * @return detalle
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getDetalle() {
    return detalle;
  }

  public void setDetalle(String detalle) {
    this.detalle = detalle;
  }

  public RegistrarRequest valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Get valor
   * @return valor
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public RegistrarRequest descuento(String descuento) {
    this.descuento = descuento;
    return this;
  }

  /**
   * Get descuento
   * @return descuento
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getDescuento() {
    return descuento;
  }

  public void setDescuento(String descuento) {
    this.descuento = descuento;
  }

  public RegistrarRequest foto(String foto) {
    this.foto = foto;
    return this;
  }

  /**
   * Get foto
   * @return foto
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getFoto() {
    return foto;
  }

  public void setFoto(String string) {
    this.foto = string;
  }

  public RegistrarRequest idnegocio(String idnegocio) {
    this.idnegocio = idnegocio;
    return this;
  }

  /**
   * Get idnegocio
   * @return idnegocio
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getIdnegocio() {
    return idnegocio;
  }

  public void setIdnegocio(String idnegocio) {
    this.idnegocio = idnegocio;
  }

  public RegistrarRequest fechaInicio(String fechaInicio) {
    this.fechaInicio = fechaInicio;
    return this;
  }

  /**
   * Get fechaInicio
   * @return fechaInicio
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getFechaInicio() {
    return fechaInicio;
  }

  public void setFechaInicio(String fechaInicio) {
    this.fechaInicio = fechaInicio;
  }

  public RegistrarRequest fechaFinal(String fechaFinal) {
    this.fechaFinal = fechaFinal;
    return this;
  }

  /**
   * Get fechaFinal
   * @return fechaFinal
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @DynamoDBAttribute
  public String getFechaFinal() {
    return fechaFinal;
  }

  public void setFechaFinal(String fechaFinal) {
    this.fechaFinal = fechaFinal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrarRequest registrarRequest = (RegistrarRequest) o;
    return Objects.equals(this.id, registrarRequest.id) &&
        Objects.equals(this.producto, registrarRequest.producto) &&
        Objects.equals(this.detalle, registrarRequest.detalle) &&
        Objects.equals(this.valor, registrarRequest.valor) &&
        Objects.equals(this.descuento, registrarRequest.descuento) &&
        Objects.equals(this.foto, registrarRequest.foto) &&
        Objects.equals(this.idnegocio, registrarRequest.idnegocio) &&
        Objects.equals(this.fechaInicio, registrarRequest.fechaInicio) &&
        Objects.equals(this.fechaFinal, registrarRequest.fechaFinal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, producto, detalle, valor, descuento, foto, idnegocio, fechaInicio, fechaFinal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrarRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    producto: ").append(toIndentedString(producto)).append("\n");
    sb.append("    detalle: ").append(toIndentedString(detalle)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    descuento: ").append(toIndentedString(descuento)).append("\n");
    sb.append("    foto: ").append(toIndentedString(foto)).append("\n");
    sb.append("    idnegocio: ").append(toIndentedString(idnegocio)).append("\n");
    sb.append("    fechaInicio: ").append(toIndentedString(fechaInicio)).append("\n");
    sb.append("    fechaFinal: ").append(toIndentedString(fechaFinal)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

