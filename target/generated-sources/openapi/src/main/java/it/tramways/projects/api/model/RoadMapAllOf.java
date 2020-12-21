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
 * RoadMapAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-13T17:43:40.536531+01:00[Europe/Rome]")

public class RoadMapAllOf   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("content")
  private it.tramways.roadmaps.api.model.RoadMapContent content;

  public RoadMapAllOf name(String name) {
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

  public RoadMapAllOf content(it.tramways.roadmaps.api.model.RoadMapContent content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @ApiModelProperty(value = "")

  @Valid

  public it.tramways.roadmaps.api.model.RoadMapContent getContent() {
    return content;
  }

  public void setContent(it.tramways.roadmaps.api.model.RoadMapContent content) {
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
    RoadMapAllOf roadMapAllOf = (RoadMapAllOf) o;
    return Objects.equals(this.name, roadMapAllOf.name) &&
        Objects.equals(this.content, roadMapAllOf.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoadMapAllOf {\n");
    
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

