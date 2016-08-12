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
 * This interface provides includes all the standard methods defined in the
 * <code>Comparable</code> interface that are relevant to all immutable atomic objects.
 * Since the <code>java.lang.Cloneable</code> interface is essentially broken it has been
 * disabled. There is no need to copy immutable objects.
 *
 * @author Derk Norton
 *
 * @param <T> The concrete type of the primitive object.
 */
public interface Atomic<T extends Atomic<T>> extends Comparable<T> {

}
