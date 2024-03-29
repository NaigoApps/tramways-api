package it.tramways.properties.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.properties.api.model.Distribution;
import it.tramways.properties.api.model.DistributionType;
import it.tramways.properties.api.model.ExponentialDistributionAllOf;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExponentialDistribution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-05T22:19:44.093692+02:00[Europe/Rome]")

public class ExponentialDistribution extends Distribution  {
  @JsonProperty("lambda")
  private BigDecimal lambda;

  public ExponentialDistribution lambda(BigDecimal lambda) {
    this.lambda = lambda;
    return this;
  }

  /**
   * Get lambda
   * @return lambda
  */
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getLambda() {
    return lambda;
  }

  public void setLambda(BigDecimal lambda) {
    this.lambda = lambda;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExponentialDistribution exponentialDistribution = (ExponentialDistribution) o;
    return Objects.equals(this.lambda, exponentialDistribution.lambda) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lambda, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExponentialDistribution {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    lambda: ").append(toIndentedString(lambda)).append("\n");
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

