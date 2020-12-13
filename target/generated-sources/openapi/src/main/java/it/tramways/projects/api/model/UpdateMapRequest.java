package it.tramways.projects.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateMapRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-08T23:23:40.619875200+02:00[Europe/Berlin]")

public class UpdateMapRequest   {
  @JsonProperty("map")
  private it.tramways.roadmaps.api.model.RoadMap map = null;

  public UpdateMapRequest map(it.tramways.roadmaps.api.model.RoadMap map) {
    this.map = map;
    return this;
  }

  /**
   * Get map
   * @return map
  */
  @ApiModelProperty(value = "")

  @Valid

  public it.tramways.roadmaps.api.model.RoadMap getMap() {
    return map;
  }

  public void setMap(it.tramways.roadmaps.api.model.RoadMap map) {
    this.map = map;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMapRequest updateMapRequest = (UpdateMapRequest) o;
    return Objects.equals(this.map, updateMapRequest.map);
  }

  @Override
  public int hashCode() {
    return Objects.hash(map);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMapRequest {\n");
    
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
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

