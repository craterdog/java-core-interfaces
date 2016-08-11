/************************************************************************
 * Copyright (c) Crater Dog Technologies(TM).  All Rights Reserved.     *
 ************************************************************************
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.        *
 *                                                                      *
 * This code is free software; you can redistribute it and/or modify it *
 * under the terms of The MIT License (MIT), as published by the Open   *
 * Source Initiative. (See http://opensource.org/licenses/MIT)          *
 ************************************************************************/
package craterdog.core;


/**
 * This abstract class provides implementations for the standard methods defined in the
 * <code>Object</code> class that can be used by all composite objects.  Since the
 * java.lang.Cloneable interface is essentially broken it has been disabled and replace
 * with a suitable copy() method.
 *
 * @author Derk Norton
 * @param <C> The concrete type of the composite object.
 */
public abstract class Composite<C extends Composite<C>> implements Cloneable, Comparable<C> {

    @Override
    public abstract String toString();


    /**
     * This method is an extension of the <code>Object.toString()</code> method that
     * includes an indentation string that can be prepended to each line in a
     * composite class that requires multiple lines for its formatted output.
     *
     * @param indentation The string to be prepended to each line output.
     * @return The formatted composite object.
     */
    public abstract String toString(String indentation);


    @Override
    public abstract boolean equals(Object object);


    @Override
    public abstract int compareTo(C object);


    @Override
    public int hashCode() {
        return toString().hashCode();
    }


    /**
     * This method creates an exact copy of a composite.
     *
     * @param <T> The concrete type of the composite.
     * @return An exact copy of the composite.
     */
    public abstract <T extends Composite<C>> T copy();


    @Override
    protected final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
