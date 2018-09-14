package com.accenture.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BodyFiltrado
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-10T17:07:18.833Z")

public class BodyFiltrado   {
  @JsonProperty("ides")
  @Valid
  private List<String> ides = new ArrayList<String>();

  @JsonProperty("tipo")
  private String tipo = null;

  public BodyFiltrado ides(List<String> ides) {
    this.ides = ides;
    return this;
  }

  public BodyFiltrado addIdesItem(String idesItem) {
    this.ides.add(idesItem);
    return this;
  }

  /**
   * Get ides
   * @return ides
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getIdes() {
    return ides;
  }

  public void setIdes(List<String> ides) {
    this.ides = ides;
  }

  public BodyFiltrado tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Get tipo
   * @return tipo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BodyFiltrado bodyFiltrado = (BodyFiltrado) o;
    return Objects.equals(this.ides, bodyFiltrado.ides) &&
        Objects.equals(this.tipo, bodyFiltrado.tipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ides, tipo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BodyFiltrado {\n");
    
    sb.append("    ides: ").append(toIndentedString(ides)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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

