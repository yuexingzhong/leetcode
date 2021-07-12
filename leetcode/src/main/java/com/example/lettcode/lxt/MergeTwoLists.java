package com.example.lettcode.lxt;

import com.alibaba.fastjson.JSON;

/**
 * 描述:
 * User: YueXZ
 * DateTime: 2021/7/12 16:13
 * Version：1.0.0
 */
public class MergeTwoLists {

    /**
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     *
     * @param args
     */
    public static void main(String[] args) {
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(3);
        ListNode a3 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;
        ListNode b1 = new ListNode(4);
        ListNode b2 = new ListNode(5);
        ListNode b3 = new ListNode(6);
        b1.next = b2;
        b2.next = b3;
        ListNode listNode = mergeTwoLists(a1, b1);


        System.out.println(JSON.toJSONString(listNode));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();

        return getChild(l1, l2);
    }

    public static ListNode getChild(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.val < l2.val) {
            l1.next = getChild(l1.next, l2);
            return l1;
        } else {
            l2.next = getChild(l1, l2.next);
            return l2;
        }

    }

//    public static ListNode getChild(ListNode l1, ListNode l2, ListNode next) {
//        if (l1 == null && l2 == null) {
//            return next;
//        }
//
//        if (l1 == null) {
//            next = new ListNode(l2.val, getChild(l1, l2.next, next));
//        }
//        if (l2 == null) {
//            next = new ListNode(l1.val, getChild(l1.next, l2, next));
//        }
//        if (l2 != null && l1 != null) {
//            if (l1.val > l2.val) {
//                System.out.println(l2.val);
//                next = new ListNode(l2.val, getChild(l1, l2.next, next));
//            } else {
//                System.out.println(l1.val);
//                next = new ListNode(l1.val, getChild(l1.next, l2, next));
//            }
//        }
//        return next;
//    }



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
    }

}

