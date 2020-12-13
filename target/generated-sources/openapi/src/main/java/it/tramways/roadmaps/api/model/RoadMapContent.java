package it.tramways.roadmaps.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.roadmaps.api.model.Lane;
import it.tramways.roadmaps.api.model.RelevantPoint;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RoadMapContent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-08T23:23:39.599505400+02:00[Europe/Berlin]")

public class RoadMapContent   {
  @JsonProperty("points")
  @Valid
  private List<RelevantPoint> points = null;

  @JsonProperty("lanes")
  @Valid
  private List<Lane> lanes = null;

  public RoadMapContent points(List<RelevantPoint> points) {
    this.points = points;
    return this;
  }

  public RoadMapContent addPointsItem(RelevantPoint pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<>();
    }
    this.points.add(pointsItem);
    return this;
  }

  /**
   * Get points
   * @return points
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RelevantPoint> getPoints() {
    return points;
  }

  public void setPoints(List<RelevantPoint> points) {
    this.points = points;
  }

  public RoadMapContent lanes(List<Lane> lanes) {
    this.lanes = lanes;
    return this;
  }

  public RoadMapContent addLanesItem(Lane lanesItem) {
    if (this.lanes == null) {
      this.lanes = new ArrayList<>();
    }
    this.lanes.add(lanesItem);
    return this;
  }

  /**
   * Get lanes
   * @return lanes
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Lane> getLanes() {
    return lanes;
  }

  public void setLanes(List<Lane> lanes) {
    this.lanes = lanes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoadMapContent roadMapContent = (RoadMapContent) o;
    return Objects.equals(this.points, roadMapContent.points) &&
        Objects.equals(this.lanes, roadMapContent.lanes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(points, lanes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoadMapContent {\n");
    
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    lanes: ").append(toIndentedString(lanes)).append("\n");
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

