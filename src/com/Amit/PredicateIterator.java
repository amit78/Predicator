package com.Amit;

import com.android.internal.util.Predicate;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Amit on 18/11/13.
 */
public class PredicateIterator implements Iterator {

    private final Iterator iter;
    private final Predicate pred;
    private boolean doneNext;
    private Object next;

    public PredicateIterator(Iterator iter, Predicate pred) {
        this.iter = iter;
        this.pred = pred;
    }

    @Override
    public boolean hasNext() {
        doneNext = true;
        boolean hasNext;
        while (hasNext = iter.hasNext()) {
            next = iter.next();
            if (pred.predicate(next())) {

                break;


            }

        }
        return hasNext;

    }

    @Override
    public Object next() {
        if (!doneNext) {
            boolean has =hasNext();
            if (!has) {
                throw new NoSuchElementException();
            }
        }
        doneNext=false;
        return next;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();

    }
}
