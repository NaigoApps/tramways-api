package it.tramways.commons.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TramwaysResource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-05T22:19:43.108553+02:00[Europe/Rome]")

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "resourceType", visible = true)
@JsonSubTypes({
})

public class TramwaysResource   {
  @JsonProperty("uuid")
  private String uuid;

  @JsonProperty("resourceType")
  private String resourceType;

  public TramwaysResource uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
  */
  @ApiModelProperty(value = "")


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public TramwaysResource resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   * @return resourceType
  */
  @ApiModelProperty(value = "")


  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TramwaysResource tramwaysResource = (TramwaysResource) o;
    return Objects.equals(this.uuid, tramwaysResource.uuid) &&
        Objects.equals(this.resourceType, tramwaysResource.resourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, resourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TramwaysResource {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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

