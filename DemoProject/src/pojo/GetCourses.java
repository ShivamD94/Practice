package pojo;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"instructor",
"url",
"services",
"expertise",
"courses",
"linkedin"
})
@javax.annotation.processing.Generated("jsonschema2pojo")
public class GetCourses {

@JsonProperty("instructor")
private String instructor;
@JsonProperty("url")
private String url;
@JsonProperty("services")
private String services;
@JsonProperty("expertise")
private String expertise;
@JsonProperty("courses")
private Course courses;
@JsonProperty("linkedin")
private String linkedin;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("instructor")
public String getInstructor() {
return instructor;
}

@JsonProperty("instructor")
public void setInstructor(String instructor) {
this.instructor = instructor;
}

@JsonProperty("url")
public String getUrl() {
return url;
}

@JsonProperty("url")
public void setUrl(String url) {
this.url = url;
}

@JsonProperty("services")
public String getServices() {
return services;
}

@JsonProperty("services")
public void setServices(String services) {
this.services = services;
}

@JsonProperty("expertise")
public String getExpertise() {
return expertise;
}

@JsonProperty("expertise")
public void setExpertise(String expertise) {
this.expertise = expertise;
}

@JsonProperty("courses")
public Course getCourses() {
return courses;
}

@JsonProperty("courses")
public void setCourses(Course courses) {
this.courses = courses;
}

@JsonProperty("linkedin")
public String getLinkedin() {
return linkedin;
}

@JsonProperty("linkedin")
public void setLinkedin(String linkedin) {
this.linkedin = linkedin;
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