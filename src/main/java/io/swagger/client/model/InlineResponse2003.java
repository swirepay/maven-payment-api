/*
 * Swirepay
 * Swirepay REST APIs' are resource-oriented URLs that accept JSON-encoded request bodies, return JSON-encoded responses, and use standard HTTP response codes, authentication, and verbs. You can use the Swirepay API in test mode, which does not affect your live data or interact with the banking networks. The `API key` you use to authenticate the request determines whether the request is live mode or test mode.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swirepay.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.CustomerResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse2003
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-16T16:28:53.447+05:30[Asia/Kolkata]")
public class InlineResponse2003 {
  @SerializedName("message")
  private String message = null;

  @SerializedName("entity")
  private CustomerResponse entity = null;

  @SerializedName("responseCode")
  private Long responseCode = null;

  /**
   * status of response
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCESS("SUCCESS"),
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  public InlineResponse2003 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(example = "OK", description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse2003 entity(CustomerResponse entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @Schema(description = "")
  public CustomerResponse getEntity() {
    return entity;
  }

  public void setEntity(CustomerResponse entity) {
    this.entity = entity;
  }

  public InlineResponse2003 responseCode(Long responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Get responseCode
   * @return responseCode
  **/
  @Schema(example = "200", description = "")
  public Long getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Long responseCode) {
    this.responseCode = responseCode;
  }

  public InlineResponse2003 status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * status of response
   * @return status
  **/
  @Schema(description = "status of response")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.message, inlineResponse2003.message) &&
        Objects.equals(this.entity, inlineResponse2003.entity) &&
        Objects.equals(this.responseCode, inlineResponse2003.responseCode) &&
        Objects.equals(this.status, inlineResponse2003.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, entity, responseCode, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
