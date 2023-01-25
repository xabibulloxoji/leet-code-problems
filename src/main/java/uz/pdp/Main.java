package uz.pdp;

import uz.pdp.p2.Test;

import java.util.*;

public class Main {

    private static final Random rnd = new Random();


    public static void main(String[] args) throws Exception {

        Test test = new Test();




//        int[] nums1 = {1, 4, 5, 0, 0, 0};
//        int[] nums2 = {2, 3, 6};
//        merge(nums1, 3, nums2, 3);


//

//        System.out.println(addTwoNumbers(l1, l2));

//        int target = 12;
//        twoSum(nums, target);

        // IS PALINDROME
//        int x = 12;
//        isPalindrome(x);


        // ROMAN TO INTEGER
//        String s = "XXIX";
//        System.out.println(romanToInt(s));

//        isPowerOfTwo(6);

//        int a = 123;

//        reverse(a);

//
//        System.out.println(searchInsert(nums, target));


//        int arr[] = {12, 11, 13, 5, 6, 7};
//
//        System.out.println("Given Array");
//        printArray(arr);
//
//        sort(arr, 0, arr.length - 1);
//
//        System.out.println("\nSorted array");
//        printArray(arr);

//        List<Integer> numList = new ArrayList<>(Arrays.asList(73, 67, 38, 33));
//
//        int n = 10;
//
//        System.out.println(countPrimes(n));

//        System.out.println(Arrays.toString(sortColors1(nums)));

//        System.out.println(isHappy(target));
//            String s = "car";
//            String t = "ewq";

//        System.out.println(isAnagram(s, t));


//        System.out.println(search1(nums, target));


//        System.out.println(search2(nums, target));

//        System.out.println(maxProfit(nums));

//        char[] s = {'h', 'e', 'l', 'l', 'o'};
//        String e = "A man, a plan, a canal: Panama";
//        String a = "a. ";

//        String a = "Hello";
//        String b = "Hello";
//        String c = new String("Hello");
//
//        System.out.println(a == b);
//        System.out.println(a == c);
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(c));
//        System.out.println(a.hashCode());
//        System.out.println(c.hashCode());
//
//        Student student = new Student("hello", 10);
//        Student student1 = new Student("hello", 10);

//        System.out.println(student1.hashCode());
//        System.out.println(student.hashCode());
//        System.out.println(reverseString(s));
//
//        System.out.println(rob(nums));
//
//        System.out.println(rotateString(e, a));
//        System.out.println(isPalindrome(e));

//        int[] s1 = {1, 2, 2, 1};
//        int[] s2 = {2, 2};
//
//        System.out.println(intersection(s1, s2));


//        System.out.println(canBeIncreasing(nums));
//        String s = "Hello world ";
//        System.out.println(lengthOfLastWord(s));

    }


    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode root1 = root;
        int val = root1.val;
        return null;
    }

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1 , j=n-1 ;
        while(i>=0 && j>=0 ){
            if(nums1[i]>=nums2[j]){
                nums1[i+j+1]=nums1[i] ;
                i-- ;
            }else{
                nums1[i+j+1]=nums2[j];
                j-- ;
            }
        }
        while(j>=0){
            nums1[j]=nums2[j];
            j-- ;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            curr.next = node;
            curr = curr.next;
        }
        return dummy.next;
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode node = new ListNode();
        ListNode curr = node;
        while (head != null) {
            while (head.next != null && head.val == head.next.val)
                head = head.next;
            curr.next = new ListNode(head.val);
            curr = curr.next;
            head = head.next;
        }
        return node.next;
    }

    public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if (carry != 0) res.append(carry);
        return res.reverse().toString();
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static int lengthOfLastWord(String s) {
        String str = "";
        boolean flag = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && flag == false) {
                continue;
            } else {
                if (s.charAt(i) == ' ') return str.length();
                else {
                    str += s.charAt(i);
                    flag = true;
                }
            }
        }
        return str.length();
    }

    public static ApiRes removeElements(int[] nums, int n) {
        int sum = 0;
        int len = nums.length;
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != n) {
                arr[i] = nums[i];
                sum++;
            }
        }
        return new ApiRes(arr, sum);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode fakeHead = new ListNode(0);
        ListNode current = fakeHead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 == null) current.next = l2;
        if (l2 == null) current.next = l1;
        return fakeHead.next;
    }

    public static class ApiRes {
        int n;

        int[] nums;

        public ApiRes() {
        }

        public ApiRes(int[] nums, int n) {
            this.n = n;
            this.nums = nums;
        }

        @Override
        public String toString() {
            return "apiRes{" +
                    "n=" + n +
                    ", nums=" + Arrays.toString(nums) +
                    '}';
        }
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static boolean isValid(String s) {
        char[] charArr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char ch : charArr) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                char lastElement = stack.lastElement();
                if (ch - lastElement == 1 || ch - lastElement == 2) stack.pop();
                else stack.push(ch);
            }
        }
        return stack.isEmpty() ? true : false;
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String pre = strs[0];
        int i = 1;
        while (i < strs.length) {
            while (strs[i].indexOf(pre) != 0) pre = pre.substring(0, pre.length() - 1);
            i++;
        }
        return pre;
    }

    class MyQueue {

        public Stack<Integer> s1;
        public Stack<Integer> s2;

        public MyQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void push(int x) {
            s1.push(x);
        }

        public int pop() {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int x = s2.pop();

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return x;
        }

        public int peek() {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int x = s2.peek();

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return x;
        }

        public boolean empty() {
            if (s1.isEmpty()) {
                return true;
            }
            return false;
        }
    }

    static boolean canBeIncreasing(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                count++;
                if (count == 2) return false;
                if (i != 0 && nums[i - 1] >= nums[i + 1]) {
                    nums[i + 1] = nums[i];
                }
            }
        }
        return true;
    }

    static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();

        int[] count = new int[1001];
        for (int i : nums1)
            count[i]++;

        for (int i : nums2)
            if (count[i] != 0) set.add(i);

        int i = 0;
        for (int num : set)
            count[i++] = num;
        return Arrays.copyOf(count, set.size());


//        Set<Integer> array = new HashSet<>();
//        List<Integer> tab = new ArrayList();
//        for (int i = 0; i < nums1.length; i++) {
//            tab.add(nums1[i]);
//        }
//        for (int i = 0; i < nums2.length; i++) {
//            int temp = nums2[i];
//            if (tab.contains(temp) && !array.contains(temp)) array.add(temp);
//        }
//        int[] ret = new int[array.toArray().length];
//        for (int i = 0; i < ret.length; i++) {
//            ret[i] = array.;
//        }
//        return ret;


//        Set<Integer> h1 = new HashSet<>();
//        Set<Integer> h2 = new HashSet<>();
//
//        for(int i=0;i< nums1.length ;i++){
//            h1.add(nums1[i]);
//        }
//        for(int i = 0; i<nums2.length ;i++){
//            if(h1.contains(nums2[i]))
//                h2.add(nums2[i]);
//        }
//
//        int[] ret = new int[h2.size()];
//        int k =0;
//        for(int element : h2){
//            ret[k] = element;
//            k++;
//        }
//
//        return ret;
    }

    static boolean isPalindrome(String s) {
        String aaa = s.toLowerCase();
        int i = 0;
        int j = aaa.length() - 1;
        while (i < j) {
            char front = aaa.charAt(i);
            char back = aaa.charAt(j);
            while (!Character.isLetterOrDigit(front) && i < j) {
                i++;
                front = aaa.charAt(i);
            }

            while (!Character.isLetterOrDigit(back) && i < j) {
                j--;
                back = aaa.charAt(j);
            }


            if (front != back) return false;

            i++;
            j--;
        }
        return true;
    }

    static String reverseString(String str) {
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;
    }

    static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return ((s + s).contains(goal));
    }

    static int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        int[] temp = new int[nums.length + 1];

        temp[0] = 0;
        temp[1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            temp[i + 1] = Math.max(temp[i - 1] + nums[i], temp[i]);
        }

        return temp[nums.length];
    }

    static char[] reverseString(char[] s) {
        char temp = 0;
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
        return s;
    }

    static int maxProfit(int[] prices) {
        int maxProf = 0;
        int sum = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                maxProf += prices[i + 1] - prices[i];
            }
        }
        return maxProf;
    }

    static int search2(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                l = mid + 1;
                mid = (l + r) / 2;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    static int search1(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return -1;
    }

    static boolean isAnagram1(String s, String t) {
        char[] arr1 = new char[s.length()];
        char[] arr2 = new char[t.length()];
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            arr1[i] = s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            arr2[i] = t.charAt(i);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            return true;
        } else {
            return false;
        }
    }

    static public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;


        int[] alphabet = new int[26];


        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 'a']--;
        }

        for (int i : alphabet) {
            if (i != 0) return false;
        }

        return true;
    }

    static boolean isHappy(int n) {
        int a = n / 10;
        int b = n % 10;
        while (n < 100) {
            n = (a * a) + (b * b);
            return isHappy(n);
        }
        return n == 100;
    }

    // {4, 5, 6, 7, 0, 1, 2}
    static public int[] sortColors1(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int s = nums[i];
                    nums[i] = nums[j];
                    nums[j] = s;
                }
            }
        }
        return nums;
    }

    static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    int temp = nums[mid];
                    nums[mid] = nums[low];
                    nums[low] = temp;
                    mid++;
                    low++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:

                    temp = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp;
                    high--;
                    break;

            }
        }
    }

    static public int countPrimes(int n) {
        int count = 0;
        int count2 = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                count2++;
            }
            count = 0;
        }
        return count2;
    }

    static public int fib(int n) {
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = b + a;
            a = b;
            b = c;
            System.out.println(b);
        }
        return b;
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        List<Integer> numList = new ArrayList<>();
        for (int num : grades) {
            int n = num % 5;
            if ((num >= 40 && n >= 3) || num == 38) {
                numList.add(num + (5 - n));
            } else {
                numList.add(num);
            }
        }
        return numList;
    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    static void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    static void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int[] searchRange(int[] nums, int target) {
        int fidx = -1;
        int lidx = -1;
        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                fidx = i;
                break;
            }
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == target) {
                lidx = j;
                break;
            }
        }

        arr[0] = fidx;
        arr[1] = lidx;

        return arr;
    }


    static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }

    static int reverse(int x) {
        String s = String.valueOf(x);
        String str = "";
        if (x % 10 == 0) x = x / 10;
        else if (x < 0) {
            s = s.substring(1);
        }
        for (int i = s.length(); i > 0; i--) {
            str += s.charAt(i - 1);
        }
        int i = Integer.parseInt(str);
        return i;
    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    static boolean isPalindrome(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }
        int num = 0;
        while (x > num) {
            num = num * 10 + x % 10;
            x /= 10;
        }
        return x == num || x == num / 10;
    }

    static int romanToInt(String s) {
        int result = 0;
        if (s == null || s.isEmpty() || s.length() < 1 || s.length() > 15) {
            return result;
        }
        int previous = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = 0;
            switch (s.charAt(i)) {
                case 'I':
                    current = 1;
                    break;
                case 'V':
                    current = 5;
                    break;
                case 'X':
                    current = 10;
                    break;
                case 'L':
                    current = 50;
                    break;
                case 'C':
                    current = 100;
                    break;
                case 'D':
                    current = 500;
                    break;
                case 'M':
                    current = 1000;
                    break;
                default:
                    current = 0;
            }
            ;
            result = previous > current ? result - current : result + current;
            previous = current;
        }
        return result;
    }

    static boolean isPowerOfTwo(int n) {
        int res = 0;
        int qol = 0;
        if (n == 1 || n == 2) return true;
        while (n % 2 == 0) {
            n /= 2;
        }
        if (n == 1) return true;
        return false;
    }

}
