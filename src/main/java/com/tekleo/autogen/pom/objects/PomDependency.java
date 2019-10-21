package com.tekleo.autogen.pom.objects;

import java.util.ArrayList;
import java.util.List;

public class PomDependency implements PomObjectWithInnerProperties {
    private String groupId;
    private String artifactId;
    private String version;
    private String type;
    private String scope;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public PomDependency(String groupId, String artifactId, String version, String type, String scope) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
        this.type = type;
        this.scope = scope;
    }
    //------------------------------------------------------------------------------------------------------------------



    // Required
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public String getName() {
        return "dependency";
    }

    @Override
    public List<PomProperty> getPropertiesList() {
        ArrayList<PomProperty> list = new ArrayList<>(4);
        if (groupId != null)
            list.add(new PomProperty("groupId", groupId));
        if (artifactId != null)
            list.add(new PomProperty("artifactId", artifactId));
        if (version != null)
            list.add(new PomProperty("version", version));
        if (type != null)
            list.add(new PomProperty("type", type));
        if (scope != null)
            list.add(new PomProperty("scope", scope));
        return list;
    }
    //------------------------------------------------------------------------------------------------------------------
}
