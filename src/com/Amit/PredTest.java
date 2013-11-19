package com.Amit;

import com.android.internal.util.Predicate;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
<<<<<<< HEAD
 * Created by Amit on 18/11/13 for trial ad error method
=======
 * Created by Amit on 18/11/13.
>>>>>>> cd6f682... Initial commit
 */
public class PredTest {
    static Predicate pred=new Predicate(){
        public boolean predicate(Object o) {
<<<<<<< HEAD
            return o.toString().startsWith("Hi there how are you");
=======
            return o.toString().startsWith("Hi");
>>>>>>> cd6f682... Initial commit
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
