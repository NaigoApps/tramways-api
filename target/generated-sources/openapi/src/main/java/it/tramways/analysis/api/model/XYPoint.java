package it.tramways.analysis.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * XYPoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-13T17:43:40.741963+01:00[Europe/Rome]")

public class XYPoint   {
  @JsonProperty("x")
  private BigDecimal x;

  @JsonProperty("y")
  private BigDecimal y;

  public XYPoint x(BigDecimal x) {
    this.x = x;
    return this;
  }

  /**
   * Get x
   * @return x
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getX() {
    return x;
  }

  public void setX(BigDecimal x) {
    this.x = x;
  }

  public XYPoint y(BigDecimal y) {
    this.y = y;
    return this;
  }

  /**
   * Get y
   * @return y
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getY() {
    return y;
  }

  public void setY(BigDecimal y) {
    this.y = y;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XYPoint xyPoint = (XYPoint) o;
    return Objects.equals(this.x, xyPoint.x) &&
        Objects.equals(this.y, xyPoint.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XYPoint {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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

