/*
 * NamedValue.java
 *
 * Created on 19 December 2004, 08:58
 */

package org.owasp.webscarab.model;

/**
 *
 * @author  rogan
 */
public class NamedValue {
    
    private String _name;
    private String _value;
    
    /** Creates a new instance of NamedValue */
    public NamedValue(String name, String value) {
        _name = name;
        _value = value;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getValue() {
        return _value;
    }
    
    public String toString() {
        return _name + "='" + _value + "'";
    }
    
}