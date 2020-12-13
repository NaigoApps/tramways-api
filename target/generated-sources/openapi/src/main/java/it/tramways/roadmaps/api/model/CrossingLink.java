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
 * CrossingLink
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-08T23:23:39.599505400+02:00[Europe/Berlin]")

public class CrossingLink extends it.tramways.commons.api.model.Configurable  {
  @JsonProperty("sourceId")
  private String sourceId;

  @JsonProperty("destinationId")
  private String destinationId;

  public CrossingLink sourceId(String sourceId) {
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

  public CrossingLink destinationId(String destinationId) {
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
    CrossingLink crossingLink = (CrossingLink) o;
    return Objects.equals(this.sourceId, crossingLink.sourceId) &&
        Objects.equals(this.destinationId, crossingLink.destinationId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, destinationId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossingLink {\n");
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

