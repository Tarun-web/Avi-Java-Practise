import java.io.*;
import java.util.*;
import java.lang.*;
public class Day2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //CREATED AND TOOK INPUT IN ARRAYLIST
        ArrayList<Integer> arr = new ArrayList<Integer>();

        System.out.println("Enter the array size value");
        int n = sc.nextInt();


        System.out.println("Enter the elements of array");
        for(int i=1; i<=n; i++)
        {
            int el = sc.nextInt();
            arr.add(el);
        }


        //CREATED AND INPUTED 2D ARRAYLIST
        ArrayList<ArrayList<Integer>> mtx = new ArrayList<ArrayList<Integer>>();


        //1. Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
//        int sum = 0;
//        for(int i: arr) sum += i;
//        System.out.print(sum);


//        Given an array/list 'ARR' of integers and a position ‘M’. You have to reverse the array after that position.

//        System.out.println("Enter the position value");
//        int m = sc.nextInt();
//        int j = arr.size() - 1;
//
//        for(int i=m+1; i<arr.size() && i < j; i++)
//        {
//            int temp = arr.get(i);
//            arr.set(i, arr.get(j));
//            arr.set(j, temp);
//            j--;
//        }


//        3. You are given an arbitrary array ‘arr’ consisting of N non-negative integers, where every element appears thrice except one. You need to find the element that appears only once.
//        Map <Integer, Integer> m = new HashMap<>();
//
//        for(int i=0; i<arr.size(); i++)
//        {
//            if(m.containsKey(arr.get(i))){
//                m.put(arr.get(i), arr.get(arr.get(i))+1);
//            }
//            else{
//                m.put(arr.get(i), 1);
//            }
//        }
//        for(Map.Entry<Integer, Integer> i: m.entrySet())
//        {
//            if(i.getValue() == 1) {
//                System.out.println(i.getKey());
//                break;
//            }
//        }


//        4. You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
//        Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
//        You need to find and return that number which is unique in the array/list

//        Map <Integer, Integer> m = new HashMap<>();
//
//        for(int i=0; i<arr.size(); i++)
//        {
//            if(m.containsKey(arr.get(i))){
//                m.put(arr.get(i), arr.get(arr.get(i))+1);
//            }
//            else{
//                m.put(arr.get(i), 1);
//            }
//        }
//        for(Map.Entry<Integer, Integer> i: m.entrySet())
//        {
//            if(i.getValue() == 1) {
//                System.out.println(i.getKey());
//                break;
//            }
//        }


//        5. You are given a number ‘N’ and a query ‘Q.’ If ‘Q’ is 1, then you have to return the sum of all integers from 1 to ‘N,’ else if ‘Q’ is equal to 2 then you have to return the product of all integers from 1 to ‘N.’ Since the product can be very large, return it modulo 10 ^ 9 + 7.

//        System.out.println("Enter the value of n");
//        int N = sc.nextInt();
//
//        System.out.println("Enter the query number you want to perform");
//        int q = sc.nextInt();
//
//        if(q == 1)
//        {
//            int sum = (N * (N+1)) / 2;
//            System.out.println("Sum is " + sum);
//        }
//        else if(q == 2)
//        {
//            int prod = 1;
//            for(int i=1; i<=N; i++)
//            {
//                prod = (prod * i) % 100000007;
//            }
//            System.out.println("Product is " + prod);
//        }


//        ASSIGNMENT-----------------------------------------------------------------------------------------


//        1.You are given an array/list ARR consisting of N integers. Your task is to find all the distinct triplets present in the array which adds up to a given number K.
//        An array is said to have a triplet {ARR[i], ARR[j], ARR[k]} with sum = 'K' if there exists three indices i, j and k such that i!=j, j!=k and i!=j and ARR[i] + ARR[j] + ARR[k] = 'K'.
//        System.out.println("Enter the target value");
//        int target = sc.nextInt();

        //SORTING METHOD
//        Collections.sort(arr);
//
//        for(int i=0; i<arr.size()-2; i++)
//        {
//            int l = i+1;
//            int r = arr.size() - 1;
//
//            while(l < r)
//            {
//                int sum = arr.get(i) + arr.get(l) + arr.get(r);
//                if(sum == target)
//                {
//                    System.out.println(arr.get(i) + " " + arr.get(l) + " " + arr.get(r));
//                    break;
//                }
//                else if(sum > target) r--;
//                else l++;
//            }
//        }


        //2. You are given a sorted integer array 'arr' of size 'n'.
        //You need to remove the duplicates from the array such that each element appears only once.
//        int j = 0;
//        for(int k=0; k<arr.size()-1; k++)
//        {
//            System.out.println(arr.get(k) + " k " + k);
//            if(!Objects.equals(arr.get(k), arr.get(k + 1))) arr.set(j++, arr.get(k));
//        }
//        arr.set(j++, arr.get(arr.size()-1));


        //3. You are given an array of size ‘N’. The elements of the array are in the range from 1 to ‘N’.
        //Ideally, the array should contain elements from 1 to ‘N’. But due to some miscalculations, there is a number R in the range [1, N] which appears in the array twice and another number M in the range [1, N] which is missing from the array.
        //Your task is to find the missing number (M) and the repeating number (R).
//        int dup = 0, missing = 0;
//        int ogSum = n*(n+1)/2;
//        int sum = 0;
//        for(int i: arr) sum += i;
//
//        for(int i=0; i<arr.size(); i++)
//        {
//            if(arr.get(Math.abs(arr.get(i))-1) < 0){
//                dup = Math.abs(arr.get(i)-1);
//                break;
//            }
//            else {
//                arr.set(arr.get(Math.abs(arr.get(i))-1), arr.get(Math.abs(arr.get(i))-1)*-1);
//            }
//        }
//
//        if(ogSum > sum) missing = dup + (ogSum - sum);
//        else missing = dup - (ogSum - sum);
//        System.out.println("Duplicate number is: " + dup + "\nMissing number is: " + missing);


//        4. You have been given an integer array/list (ARR) of size N. You have to return an array/list PRODUCT such that PRODUCT[i] is equal to the product of all the elements of ARR except ARR[i]

//        int product = 1;
//        for(int i: arr) product *= i;
//        for(int i=0; i<arr.size(); i++)
//        {
//            arr.set(i, product/arr.get(i));
//        }


//        5. Sum Of Infinite Array
//Given an array “A” of N integers and you have also defined the new array “B” as a concatenation of array “A” for an infinite number of times.
        

        //print arraylist
        for(int i:arr) System.out.print(i + " ");

        //print 2d arraylist
//        for(ArrayList<Integer> i: mtx)
//        {
//            for(int j: i) System.out.print(j + " ");
//            System.out.println();
//        }
    }
}
