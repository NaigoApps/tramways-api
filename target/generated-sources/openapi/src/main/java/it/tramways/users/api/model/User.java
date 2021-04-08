package it.tramways.users.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import it.tramways.users.api.model.UserAllOf;
import it.tramways.users.api.model.UserRole;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-05T22:19:45.226777+02:00[Europe/Rome]")

public class User extends it.tramways.commons.api.model.TramwaysResource  {
  @JsonProperty("username")
  private String username;

  @JsonProperty("roles")
  @Valid
  private List<UserRole> roles = new ArrayList<>();

  public User username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User roles(List<UserRole> roles) {
    this.roles = roles;
    return this;
  }

  public User addRolesItem(UserRole rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<UserRole> getRoles() {
    return roles;
  }

  public void setRoles(List<UserRole> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.username, user.username) &&
        Objects.equals(this.roles, user.roles) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, roles, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

