package it.tramways.roadmaps.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.roadmaps.api.model.LaneAllOf;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Lane
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-13T17:43:39.861804+01:00[Europe/Rome]")

public class Lane extends it.tramways.commons.api.model.Configurable  {
  @JsonProperty("sourceId")
  private String sourceId;

  @JsonProperty("destinationId")
  private String destinationId;

  public Lane sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

  /**
   * Get sourceId
   * @return sourceId
  */
  @ApiModelProperty(value = "")


  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public Lane destinationId(String destinationId) {
    this.destinationId = destinationId;
    return this;
  }

  /**
   * Get destinationId
   * @return destinationId
  */
  @ApiModelProperty(value = "")


  public String getDestinationId() {
    return destinationId;
  }

  public void setDestinationId(String destinationId) {
    this.destinationId = destinationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lane lane = (Lane) o;
    return Objects.equals(this.sourceId, lane.sourceId) &&
        Objects.equals(this.destinationId, lane.destinationId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, destinationId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lane {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
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

