package it.tramways.analysis.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AnalysisRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-08T23:23:41.219515900+02:00[Europe/Berlin]")

public class AnalysisRequest   {
  @JsonProperty("analysisTypeId")
  private String analysisTypeId;

  @JsonProperty("parameters")
  @Valid
  private List<it.tramways.properties.api.model.Property> parameters = null;

  public AnalysisRequest analysisTypeId(String analysisTypeId) {
    this.analysisTypeId = analysisTypeId;
    return this;
  }

  /**
   * Get analysisTypeId
   * @return analysisTypeId
  */
  @ApiModelProperty(value = "")


  public String getAnalysisTypeId() {
    return analysisTypeId;
  }

  public void setAnalysisTypeId(String analysisTypeId) {
    this.analysisTypeId = analysisTypeId;
  }

  public AnalysisRequest parameters(List<it.tramways.properties.api.model.Property> parameters) {
    this.parameters = parameters;
    return this;
  }

  public AnalysisRequest addParametersItem(it.tramways.properties.api.model.Property parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Get parameters
   * @return parameters
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<it.tramways.properties.api.model.Property> getParameters() {
    return parameters;
  }

  public void setParameters(List<it.tramways.properties.api.model.Property> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisRequest analysisRequest = (AnalysisRequest) o;
    return Objects.equals(this.analysisTypeId, analysisRequest.analysisTypeId) &&
        Objects.equals(this.parameters, analysisRequest.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisTypeId, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisRequest {\n");
    
    sb.append("    analysisTypeId: ").append(toIndentedString(analysisTypeId)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

