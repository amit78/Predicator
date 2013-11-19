package com.Amit;

import com.android.internal.util.Predicate;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Amit on 18/11/13 for trial ad error method
 */
public class PredTest {
    static Predicate pred=new Predicate(){
        public boolean predicate(Object o) {
            return o.toString().startsWith("Hi there how are you");
        }
    };

    public static void main(String[] args) {
        List list = Arrays.asList(args);
        Iterator i1=list.iterator();
        Iterator i = new PredicateIterator(i1, pred);
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
