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
 * This interface must be implemented by classes that define a composite structure and
 * therefore require special formatting considerations.
 *
 * @author Derk Norton
 */
public interface Composite {

    /**
     * This method is an extension of the <code>Object.toString()</code> method that
     * includes an indentation string that can be prepended to each line in a
     * composite class that requires multiple lines for its formatted output.
     *
     * @param indentation The string to be prepended to each line output.
     * @return The formatted composite object.
     */
    String toString(String indentation);

}
