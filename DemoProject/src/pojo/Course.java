package pojo;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"webAutomation",
"apis",
"mobile"
})
@Generated("jsonschema2pojo")
public class Course {

@JsonProperty("webAutomation")
private List<WebAutomation> webAutomation = null;
@JsonProperty("apis")
private List<Api> apis = null;
@JsonProperty("mobile")
private List<Mobile> mobile = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("webAutomation")
public List<WebAutomation> getWebAutomation() {
return webAutomation;
}

@JsonProperty("webAutomation")
public void setWebAutomation(List<WebAutomation> webAutomation) {
this.webAutomation = webAutomation;
}

@JsonProperty("apis")
public List<Api> getApis() {
return apis;
}

@JsonProperty("apis")
public void setApis(List<Api> apis) {
this.apis = apis;
}

@JsonProperty("mobile")
public List<Mobile> getMobile() {
return mobile;
}

@JsonProperty("mobile")
public void setMobile(List<Mobile> mobile) {
this.mobile = mobile;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}
}