/*
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * OpenAPI spec version: 1.1.12
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraem4j;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-10T11:39:00.802+10:00")
public class Pair {
    private String name = "";
    private String value = "";

    public Pair (String name, String value) {
        setName(name);
        setValue(value);
    }

    private void setName(String name) {
        if (!isValidString(name)) return;

        this.name = name;
    }

    private void setValue(String value) {
        if (!isValidString(value)) return;

        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    private boolean isValidString(String arg) {
        if (arg == null) return false;
        if (arg.trim().isEmpty()) return false;

        return true;
    }
}
