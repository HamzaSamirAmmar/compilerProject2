package ast.nodes.basicNodes;

import ast.nodes.Element;
import ast.nodes.basicNodes.expressions.Expression;
import ast.nodes.util.Formatter;

public class VariableDeclaration extends BasicElement {
    String id;
    Expression value;//TODO should implement valuable

    public void setId(String id) {
        this.id = id;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    @Override
    protected String nodeName() {
        return "variableDeclaration";
    }

    @Override
    protected Formatter nodeValue(Formatter formatter) {
        return formatter.addProperty("id",id).object(value.toString("value"));
    }

    @Override
    public String toHtmlCode() {
        String code="<?php $_SESSION['"+id+"']="+value.toHtmlCode()
                +" ?>\n";
        return code;
    }

    @Override
    public String toPhpCode() {
        String code="$_SESSION['"+id+"']="+value.toPhpCode();
        return code;
    }

}
