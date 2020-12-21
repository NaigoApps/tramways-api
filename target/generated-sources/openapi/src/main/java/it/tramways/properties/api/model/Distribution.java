package it.tramways.properties.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.properties.api.model.DistributionType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Distribution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-13T17:43:39.360953+01:00[Europe/Rome]")

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "distributionType", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = UniformDistribution.class, name = "UNIFORM"),
  @JsonSubTypes.Type(value = ExponentialDistribution.class, name = "EXPONENTIAL"),
})

public class Distribution   {
  @JsonProperty("distributionType")
  private DistributionType distributionType;

  public Distribution distributionType(DistributionType distributionType) {
    this.distributionType = distributionType;
    return this;
  }

  /**
   * Get distributionType
   * @return distributionType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DistributionType getDistributionType() {
    return distributionType;
  }

  public void setDistributionType(DistributionType distributionType) {
    this.distributionType = distributionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Distribution distribution = (Distribution) o;
    return Objects.equals(this.distributionType, distribution.distributionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distributionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Distribution {\n");
    
    sb.append("    distributionType: ").append(toIndentedString(distributionType)).append("\n");
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

