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
 * This interface provides adds methods to the standard methods defined in the
 * <code>java.lang.Comparable</code> interface that are relevant to all composite objects.
 * Since the <code>java.lang.Cloneable</code> interface is essentially broken it is not
 * included and replaced with a parameterized copy() method.
 *
 * @author Derk Norton
 * @param <C> The concrete type of the composite object.
 */
public interface Composite<C extends Composite<C>> extends Comparable<C> {

    /**
     * This method is an extension of the <code>Object.toString()</code> method that
     * includes an indentation string that can be prepended to each line in a
     * composite class that requires multiple lines for its formatted output.
     *
     * @param indentation The string to be prepended to each line output.
     * @return The formatted composite object.
     */
    String toString(String indentation);

    /**
     * This method creates an exact copy of a composite.
     *
     * @param <T> The concrete type of the composite.
     * @return An exact copy of the composite.
     */
    <T extends Composite<C>> T copy();

}
