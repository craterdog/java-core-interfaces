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
 * This abstract class extends the <code>Iterator</code> class by allowing the
 * manipulation of the sequence's elements.  Just like an iterator, a manipulator
 * points at the slots on either side of the elements in a sequence.
 * <pre>
 *            [element 1]   [element 2]   [element 3]  ...  [element N]
 *          ^             ^             ^             ^   ^             ^
 *       at start                                                    at end
 * </pre>
 *
 * @author Derk Norton
 * @param <E> The type of the element being manipulated.
 */
public abstract class Manipulator<E> extends Iterator<E> {

    /**
     * This method inserts a new element in the slot currently pointed at by the manipulator.
     * If this sequence is empty then the new element becomes the first element in the
     * sequence.
     *
     * @param element The new element to be inserted.
     */
    public abstract void insertElement(E element);

    /**
     * This method removes the element after the slot where the manipulator is currently
     * pointing.  If the manipulator is at the end of this sequence an exception is thrown.
     *
     * @return The removed next element.
     */
    public abstract E removeNext();

    /**
     * This method removes the element before the slot where the manipulator is currently
     * pointing.  If the manipulator is at the start of this sequence an exception is thrown.
     *
     * @return The removed previous element.
     */
    public abstract E removePrevious();

}
