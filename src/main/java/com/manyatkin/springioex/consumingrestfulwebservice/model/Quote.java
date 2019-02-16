package com.manyatkin.springioex.consumingrestfulwebservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//As you can see, this is a simple Java class with a handful of properties and matching getter methods.
// It’s annotated with @JsonIgnoreProperties from the Jackson JSON processing library
// to indicate that any properties not bound in this type should be ignored.
//
// In order for you to directly bind your data to your custom types,
// you need to specify the variable name exact same as the key in the JSON Document returned from the API.
// In case your variable name and key in JSON doc are not matching,
// you need to use @JsonProperty annotation to specify the exact key of JSON document.

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private String type;
    private Value value;
}
