package org.gfg.JBDL8_JUnitAndMockito;

import java.util.ArrayList;
import java.util.List;

public class Mathematics {

    public int add(int... num){
        int sum = 0;
        for (int i=0;i< num.length;i++){
            sum = sum+num[i];
        }
        return sum;
    }


    public int[] evenNumberFilter(int... arr){
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                list.add(arr[i]);
            }
        }
        int ans[] = new int[list.size()];
        int index =0;
        for (int val:list){
            ans[index++] = val;
        }
        return ans;
    }

    public int add(int num1, int num2){
        return num1+num2;
    }

    public boolean isOdd(int num){
        return num%2==1;
    }
}
