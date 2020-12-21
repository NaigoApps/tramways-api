package it.tramways.analysis.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.analysis.api.model.AnalysisResult;
import it.tramways.analysis.api.model.AnalysisStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AnalysisAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-13T17:43:40.741963+01:00[Europe/Rome]")

public class AnalysisAllOf   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("status")
  private AnalysisStatus status;

  @JsonProperty("result")
  private AnalysisResult result;

  public AnalysisAllOf name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AnalysisAllOf status(AnalysisStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public AnalysisStatus getStatus() {
    return status;
  }

  public void setStatus(AnalysisStatus status) {
    this.status = status;
  }

  public AnalysisAllOf result(AnalysisResult result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  */
  @ApiModelProperty(value = "")

  @Valid

  public AnalysisResult getResult() {
    return result;
  }

  public void setResult(AnalysisResult result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisAllOf analysisAllOf = (AnalysisAllOf) o;
    return Objects.equals(this.name, analysisAllOf.name) &&
        Objects.equals(this.status, analysisAllOf.status) &&
        Objects.equals(this.result, analysisAllOf.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisAllOf {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

