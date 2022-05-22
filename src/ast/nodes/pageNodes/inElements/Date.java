package ast.nodes.pageNodes.inElements;

import ast.nodes.Element;
import ast.nodes.basicNodes.expressions.literals.MapNode;
import ast.nodes.util.Formatter;

import java.util.ArrayList;

public class Date extends Element {
    String name;
    String label;
    String value;
    MapNode extraAttributes;

    public MapNode getExtraAttributes() {
        return extraAttributes;
    }

    public Date(String name, String label, String value, MapNode extraAttributes) {
        this.name = name;
        this.label = label;
        this.value = value;
        this.extraAttributes = extraAttributes;
    }

    public void setExtraAttributes(MapNode extraAttributes) {
        this.extraAttributes = extraAttributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    protected String nodeName() {
        return "Date Node";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        formatter.addProperty("Date Name", name);
        formatter.addProperty("Date Value", value);
        formatter.addProperty("Date Label", label);
        formatter.object(extraAttributes.toString());
        return formatter;
    }
}
