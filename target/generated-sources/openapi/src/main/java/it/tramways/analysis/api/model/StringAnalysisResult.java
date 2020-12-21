package it.tramways.analysis.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.analysis.api.model.AnalysisResult;
import it.tramways.analysis.api.model.AnalysisResultType;
import it.tramways.analysis.api.model.StringAnalysisResultAllOf;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StringAnalysisResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-13T17:43:40.741963+01:00[Europe/Rome]")

public class StringAnalysisResult extends AnalysisResult  {
  @JsonProperty("message")
  private String message;

  public StringAnalysisResult message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringAnalysisResult stringAnalysisResult = (StringAnalysisResult) o;
    return Objects.equals(this.message, stringAnalysisResult.message) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringAnalysisResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

