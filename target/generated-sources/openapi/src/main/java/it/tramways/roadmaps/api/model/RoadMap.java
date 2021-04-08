package it.tramways.roadmaps.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.roadmaps.api.model.RoadMapAllOf;
import it.tramways.roadmaps.api.model.RoadMapContent;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoadMap
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-05T22:19:44.955233+02:00[Europe/Rome]")

public class RoadMap extends it.tramways.commons.api.model.TramwaysResource  {
  @JsonProperty("name")
  private String name;

  @JsonProperty("content")
  private RoadMapContent content = null;

  public RoadMap name(String name) {
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

  public RoadMap content(RoadMapContent content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @ApiModelProperty(value = "")

  @Valid

  public RoadMapContent getContent() {
    return content;
  }

  public void setContent(RoadMapContent content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoadMap roadMap = (RoadMap) o;
    return Objects.equals(this.name, roadMap.name) &&
        Objects.equals(this.content, roadMap.content) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, content, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoadMap {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

