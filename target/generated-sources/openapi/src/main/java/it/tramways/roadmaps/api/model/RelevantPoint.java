package it.tramways.roadmaps.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.roadmaps.api.model.CrossingLink;
import it.tramways.roadmaps.api.model.RelevantPointAllOf;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RelevantPoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-12-13T17:43:39.861804+01:00[Europe/Rome]")

public class RelevantPoint extends it.tramways.commons.api.model.Configurable  {
  @JsonProperty("links")
  @Valid
  private List<CrossingLink> links = null;

  public RelevantPoint links(List<CrossingLink> links) {
    this.links = links;
    return this;
  }

  public RelevantPoint addLinksItem(CrossingLink linksItem) {
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

  public List<CrossingLink> getLinks() {
    return links;
  }

  public void setLinks(List<CrossingLink> links) {
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
    RelevantPoint relevantPoint = (RelevantPoint) o;
    return Objects.equals(this.links, relevantPoint.links) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelevantPoint {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

