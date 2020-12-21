package it.tramways.projects.api.model;

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
 * RelevantPointAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-13T17:43:40.536531+01:00[Europe/Rome]")

public class RelevantPointAllOf   {
  @JsonProperty("links")
  @Valid
  private List<it.tramways.roadmaps.api.model.CrossingLink> links = null;

  public RelevantPointAllOf links(List<it.tramways.roadmaps.api.model.CrossingLink> links) {
    this.links = links;
    return this;
  }

  public RelevantPointAllOf addLinksItem(it.tramways.roadmaps.api.model.CrossingLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<it.tramways.roadmaps.api.model.CrossingLink> getLinks() {
    return links;
  }

  public void setLinks(List<it.tramways.roadmaps.api.model.CrossingLink> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelevantPointAllOf relevantPointAllOf = (RelevantPointAllOf) o;
    return Objects.equals(this.links, relevantPointAllOf.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelevantPointAllOf {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

