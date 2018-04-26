package com.flequesboard.java.apps;

import java.util.List;

public class SplitFind {
    Integer missingNum;
    boolean found = false;
    SplitFind(List<Integer>errorsomeArray){
        this.setMissingNum(errorsomeArray);
    }
    private void setMissingNum(List<Integer>errorsomeArray){
        Integer length = errorsomeArray.size();
        if(length < 2 || found)
            return;

        Integer lhsLastIndex = length/2;

        List<Integer> lhs = errorsomeArray.subList(0,lhsLastIndex);
        List<Integer> rhs = errorsomeArray.subList(lhsLastIndex, length);

        isFound(errorsomeArray.get(length - 2),errorsomeArray.get(length - 1)); //if last and second from last are repeating
        isFound(rhs.get(0),rhs.get(1)); //if 1st and second of rhs are repeating
        isFound(lhs.get(lhsLastIndex-1), rhs.get(0)); //if the split occurred on the repeating values
        isFound(lhs.get(0), lhs.get(1)); //if 1st and second of lhs are repeating

        if(found)
            return;

        if(rhs.size() > 1)
           setMissingNum(rhs);
        if(lhs.size() > 1)
           setMissingNum(lhs);
    }
    private boolean isFound(Integer lhs, Integer rhs){
        if(rhs == lhs){
            this.found = true;
            this.missingNum =  rhs + 1;
            return true;
        }
        return false;
    }
    public Integer getMissingNum() {
        return missingNum;
    }
}
