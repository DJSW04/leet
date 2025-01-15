

/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode addTwo = new ListNode();
        String num1 = new String();
        String num2 = new String();
        while (l1 != null){
            num1 += l1.val;
            l1 = l1.next;
        }
        while (l2 != null){
            num2 += l2.val;
            l2 = l2.next;
        }
        String finalnum = String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));
        
        for (int i = 0; i < finalnum.length(); i++){
            ListNode temp = new ListNode();
            temp.val = Character.getNumericValue(finalnum.charAt(i));
            temp.next = addTwo;
            addTwo = temp;

        }
                
        return addTwo;
    }
    // public class ListNode {
    //     int val;
    //     ListNode next;

    //     ListNode() { }

    //     ListNode(int val) { this.val = val; }

    //     ListNode(int val, ListNode next) {
    //         this.val = val;
    //         this.next = next;
    //     }
    // }
}
// @lc code=end

