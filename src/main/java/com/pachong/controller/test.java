package com.pachong.controller;

import javax.management.AttributeList;
import java.util.*;

/**
 * @wtk
 **/
public class test {
    /**
     * 二分查找的思想来找到数组中重复的数字，时间复杂度在o(nlogn)-o(n^2)
     */

    public static void main(String[] args)  {
        int numbers[] = {0,0,2,3,5,5};//数组中的数 大小从0 到 numbers.length-1
        findDuplicate(numbers,0,numbers.length-1);
    }
    static void findDuplicate(int numbers[],int left,int right){
        if (numbers == null || numbers.length == 0)
            return;
        int mid;
        while(left<=right)
        {
            System.out.println("Find duplicate from "+left+" to "+right);
            mid=(left+right)/2;
            if(left==right)//当两个下标值相等结束循环
            {
                if(countNumberInRange(numbers,left,right)>1)
                {
                    System.out.println(left);
                    break;
                }
                else break;
            }
            //以下通过计算在指定区间数组中数字的个数与区间的长度对比来确定数组中是否有重复数字
            if(countNumberInRange(numbers,left, mid)>(mid-left+1))//如果数字区间从left到 mid的数字个数大于mid-left+1 则本区间肯定与重复数字
            {
                right=mid;
            }
            else if(countNumberInRange(numbers,mid+1, right)>(right-mid))//如果数字区间从mid+1到right的数字个数大于right-mid则本区间肯定有重复数字
            {
                left=mid+1;
            }
            else if(countNumberInRange(numbers,left, mid)==(mid-left+1) && countNumberInRange(numbers,mid+1, right)==(right-mid))
            {//因为上两个判断不能确定区间内是每个数字各出现了一次还是某个数字出现了两次，所以当左右区间长度与数字个数相等时不能排除仍然有重复数字
                if(countNumberInRange(numbers,right,right)>1)//判断最后一个数字出现次数是否是多次
                {
                    System.out.println(right);
                    break;
                }
                else//缩减区间
                    right=right-1;
            }
        }

    }
    //计算数组中在from到to区间数字的个数
    static int countNumberInRange(int numbers[],int from,int to)
    {
        int count=0;
        if(numbers==null || numbers.length==0)
            return 0;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>=from && numbers[i]<=to)
                count++;
        }
        return count;
    }
}




