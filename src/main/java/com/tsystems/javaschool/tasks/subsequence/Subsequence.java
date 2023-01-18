package com.tsystems.javaschool.tasks.subsequence;

import java.util.List;

public class Subsequence {

    /**
     * Checks if it is possible to get a sequence which is equal to the first
     * one by removing some elements from the second one.
     *
     * @param x first sequence
     * @param y second sequence
     * @return <code>true</code> if possible, otherwise <code>false</code>
     */
    @SuppressWarnings("rawtypes")
    public boolean find(List x, List y) {
        // TODO: Implement the logic here

        // check if the list is create
        if (x == null || y == null) throw new IllegalArgumentException();

        // check if x is larger than list. If it is true, it can not be subsequence of Y

        if (x.size() > y.size()) {
            return false;
        }

        // check if the list X is empty. If it is true, it will always be subsequence of Y
        if (x.isEmpty()) {
            return true;
        }

        // check if y contains x.
        List<Integer> indiceY= new ArrayList();

        for (int i = 0; i < x.size(); i++) {
            int indice = y.indexOf(x.get(i));
            indiceY.add(indice);
        }         
                
        //
        for (int i=0; i<indiceY.size()-1; i++){
            if ( indiceY.get(i) > indiceY.get(i+1) ){
                return false;
            }
        }             


        return true;
    }
}
