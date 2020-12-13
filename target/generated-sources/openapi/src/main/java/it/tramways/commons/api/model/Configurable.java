package it.tramways.commons.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Configurable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-10-08T23:23:38.660084500+02:00[Europe/Berlin]")

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "configurableType", visible = true)
@JsonSubTypes({
})

public class Configurable   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("category")
  private String category;

  @JsonProperty("configurableType")
  private String configurableType;

  @JsonProperty("props")
  @Valid
  private List<it.tramways.properties.api.model.Property> props = null;

  public Configurable id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Configurable category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Configurable configurableType(String configurableType) {
    this.configurableType = configurableType;
    return this;
  }

  /**
   * Get configurableType
   * @return configurableType
  */
  @ApiModelProperty(value = "")


  public String getConfigurableType() {
    return configurableType;
  }

  public void setConfigurableType(String configurableType) {
    this.configurableType = configurableType;
  }

  public Configurable props(List<it.tramways.properties.api.model.Property> props) {
    this.props = props;
    return this;
  }

  public Configurable addPropsItem(it.tramways.properties.api.model.Property propsItem) {
    if (this.props == null) {
      this.props = new ArrayList<>();
    }
    this.props.add(propsItem);
    return this;
  }

  /**
   * Get props
   * @return props
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<it.tramways.properties.api.model.Property> getProps() {
    return props;
  }

  public void setProps(List<it.tramways.properties.api.model.Property> props) {
    this.props = props;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Configurable configurable = (Configurable) o;
    return Objects.equals(this.id, configurable.id) &&
        Objects.equals(this.category, configurable.category) &&
        Objects.equals(this.configurableType, configurable.configurableType) &&
        Objects.equals(this.props, configurable.props);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category, configurableType, props);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Configurable {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    configurableType: ").append(toIndentedString(configurableType)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
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

