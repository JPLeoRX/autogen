package com.tekleo.autogen.template_engine;

import com.tekleo.autogen.template_engine.text.TextFileParser;

import java.io.Serializable;
import java.util.Objects;

public class Template implements Serializable {
    private String pathToFileInResourcesFolder;

    // Constructors
    //------------------------------------------------------------------------------------------------------------------
    public Template(String pathToFileInResourcesFolder) {
        this.pathToFileInResourcesFolder = pathToFileInResourcesFolder;
    }

    public Template(Template template) {
        this(template.getPathToFileInResourcesFolder());
    }
    //------------------------------------------------------------------------------------------------------------------



    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public String getPathToFileInResourcesFolder() {
        return pathToFileInResourcesFolder;
    }

    public String getText() {
        return TextFileParser.readFromFileInResourcesFolder(pathToFileInResourcesFolder);
    }
    //------------------------------------------------------------------------------------------------------------------



    //------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Template template = (Template) o;
        return Objects.equals(pathToFileInResourcesFolder, template.pathToFileInResourcesFolder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pathToFileInResourcesFolder);
    }

    @Override
    public String toString() {
        return "Template{" +
                "pathToFileInResourcesFolder='" + pathToFileInResourcesFolder + '\'' +
                '}';
    }
    //------------------------------------------------------------------------------------------------------------------
}
