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

import java.util.Iterator;


/**
 * This interface should be implemented by classes that define a sequence of
 * elements that can be iterated over in a sequential manner.
 *
 * @author Derk Norton
 * @param <E> The type of element that makes up the sequence.
 */
public interface Sequential<E> extends Iterable<E> {

    /**
     * This method checks to see if the sequence is empty.
     *
     * @return Whether or not the sequence is empty.
     */
    boolean isEmpty();

    /**
     * This method returns the number of elements in the sequence.
     *
     * @return The number of elements in the sequence.
     */
    int getNumberOfElements();

    /**
     * This method returns an array containing the elements in the sequence.
     *
     * @return array An array containing the elements from the sequence.
     */
    E[] toArray();

    /**
     * This method fills the specified array with as many elements from the sequence as
     * will fit in the array.  If the array is larger than the sequence, the remaining
     * elements in the array remain unchanged.
     *
     * @param array An array to be used to hold the elements of the sequence.
     */
    @Deprecated
    void toArray(E[] array);

    @Override
    Iterator<E> iterator();

}
