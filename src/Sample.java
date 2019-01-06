
// http://code-exercises.com/programming/easy/10/factorial

import java.util.ArrayList;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        // sum(100,200)

//        Integer max = 20;
//        System.out.println(factorial(max));
//        System.out.println(factorialRecursively(max));

//        Integer[] searchList = {1,5,6,8,99,100};
//        Integer n = 100;
//        System.out.println(search(n, searchList));
//        System.out.println(searchRefactor(n, searchList));

//        String str = "abcdefgh";
//        System.out.println(str + " -> " + reverse(str));

//        Integer[] list = {90, 1, 4, 288, 7};
//        System.out.println("The maximum is = " + maximum(list));


//        Integer[] list = {90, 1, 4, 288, 7};
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        System.out.println("The average is = " + average(list));

//        List<String> list = new ArrayList<String>();
//        list.add("abc");
//        list.add("DEf");
//        System.out.println("The average is = " + upperCase(list));

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(40);
        System.out.println("getElement = " + getElement(list, 5));
    }

    /*
    8. Number Of Tree Nodes
Write a method that returns the number of nodes in a binary tree.
TreeNode API methods: node.left() and node.right().
     */


    /*
        7. Nth Odd Element
Write a method that returns th nth element of a list. If the index of the element exceeds the list size, then return -1.
     */
    public static Integer getElement(List<Integer> list, Integer n) {
        if(n < 0) {
            return -1;
        }

        Object[] array = list.toArray();
        if(n > array.length) {
            return -1;
        }

        return (Integer)array[n-1];
    }

    /*
    6. Convert to Upper Case (Java 8 Lambdas and Streams)
Write a method that converts all strings in a list to their upper case.
     */
    public static List<String> upperCase(List<String> list) {
        List<String> retList = new ArrayList<String>(list.size());
        for(Integer i = 0; i < list.size(); ++i) {
            retList.add(list.get(i).toUpperCase());
        }

        return retList;
    }

    public static List<String> upperCaseLambdas(List<String> list) {
        List<String> retList = new ArrayList<String>(list.size());
        for(Integer i = 0; i < list.size(); ++i) {
            retList.add(list.get(i).toUpperCase());
        }

        return retList;
    }

    /*
        5. Average Value (Java 8 Lambdas and Streams)
Write a method that returns the average of a list of integers.
     */
    public static Double average(List<Integer> list) {
        Integer sum = 0;
        for(Integer i = 0; i < list.size(); ++i) {
            sum += list.get(i);
        }

        return (sum / (list.size() * 1.0));
    }

    public static Double averageLambdas(List<Integer> list) {
        Integer sum = 0;
        for(Integer i = 0; i < list.size(); ++i) {
            sum += list.get(i);
        }

        return (sum / (list.size() * 1.0));
    }

    /*
        4. Find Maximum
Write a method that returns the largest integer in the list.
You can assume that the list has at least one element.
     */
    public static Integer maximum(Integer[] list) {
        Integer max = list[0];

        for(Integer i = 1; i < list.length; ++i) {
            if(list[i] > max) {
                max = list[i];
            }
        }

        return max;
    }

    /*
        3. Reverse String
Write a method that reverses a string.
For example, 'java interview' becomes 'weivretni avaj'.
     */
    public static String reverse(String s) {
//        String rs = new String(s);

//        System.out.println(s);

        char dst[] = new char[s.length() + 1];
//        for (int j = 0; j < s.length() + 1; ++j) {
//            dst[j] = 0;
//        }
        s.getChars(0, s.length(), dst, 0);
//        dst[s.length()] = 0;
//        System.out.println(dst);

        for(Integer i = 0, length = s.length(), half = length / 2; i < half; ++i) {
            char tmp = dst[i];
            dst[i] = dst[length - 1 - i];
            dst[length - 1 - i] = tmp;
        }

        return new String(dst, 0, s.length());
    }


    /*
    2. Linear Search
Write a method that returns the index of the first occurrence of given integer in a list.
Assume that the index of the first element in the list is zero.
If the number does not exist return -1.
     */
    public static int search(Integer n, Integer[] list) {
        for(Integer i = 0, cnt = list.length; i < cnt; ++i) {
            if(list[i] == n) {
                return i;
            }
        }

        return -1;
    }

    public static int searchRefactor(Integer n, Integer[] list) {
        for(Integer i = 0, cnt = list.length, half = cnt/2, revertIndex; i <= half; ++i) {
            if(list[i] == n) {
                return i;
            }

            revertIndex = cnt - 1 - i;

            if(list[revertIndex] == n) {
                return revertIndex;
            }
        }

        return -1;
    }



    /*
    1. Factorial
Write a method that calculates the factorial of a given number.
Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
TIP: To make it more interesting, try to do it recursively.
     */
    public static long factorial(Integer n) {
        long result = 1;

        for(Integer i = 2; i <= n; ++i) {
            result *= i;
        }

        return result;
    }

    public static long factorialRecursively(Integer n) {
        if(n == 1) {
            return 1;
        }

        return n * factorialRecursively(n-1);
    }

    public static Integer sum(Integer i, Integer j) {
        return  i + j;
    }
}
