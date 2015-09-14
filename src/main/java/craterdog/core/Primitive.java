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
 * <code>Object</code> class that can be used by all immutable primitive objects.  Since
 * primitives are immutable there is no need for support for the clone() method so it is
 * disabled.
 *
 * @author Derk Norton
 *
 * @param <T> The concrete type of the primitive object.
 */
public abstract class Primitive<T extends Primitive<T>> implements Cloneable, Comparable<T> {

    @Override
    public abstract String toString();


    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!this.getClass().equals(object.getClass())) {
            return false;
        }
        @SuppressWarnings("unchecked")
        T that = (T) object;
        return this.toString().equals(that.toString());
    }


    @Override
    public int compareTo(T object) {
        if (object == null) return 1;  // everything is greater than null
        if (this == object) {
            return 0;
        }
        return Integer.signum(this.toString().compareTo(object.toString()));
    }


    @Override
    public int hashCode() {
        return toString().hashCode();
    }


    @Override
    protected final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
