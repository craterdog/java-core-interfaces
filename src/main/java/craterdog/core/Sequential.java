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
 * This interface should be implemented by classes that define a sequence of
 * elements that can be iterated over in a sequential manner.
 *
 * @author Derk Norton
 * @param <E> The type of element that makes up the sequence.
 */
public interface Sequential<E> extends Iterable<E> {

    Iterator<E> createIterator();

    /**
     * This method checks to see if the sequence is empty.
     *
     * @return Whether or not the sequence is empty.
     */
    default boolean isEmpty() {
        return getSize() == 0;
    }

    /**
     * This method returns the number of elements in the sequence.
     *
     * @return The number of elements in the sequence.
     */
    int getSize();

    /**
     * This method returns an array containing the elements in the sequence.
     *
     * @return array An array containing the elements from the sequence.
     */
    E[] toArray();

    @Override
    default java.util.Iterator<E> iterator() {
        return createIterator();
    }

}
