package com.nynu.base.entites;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: 王纪勇
 * @Date: 2022/4/26 11:28
 * @Description: 自定义单链表
 */
public class MyLinkedList {

    class Node{
        int val;
        Node node;
        Node(int val){
            this.val = val;
        }
    }

    int size;
    Node head;



    public MyLinkedList(){
        this.size = 0;
        this.head = null;
    }

    public int get(int index){
        if (index < 0 || index > size || head == null){
            return -1;
        }
        Node temp = this.head;
        for (int i=0; i<index; i++) {
            temp = temp.node;
        }

        return temp.val;
    }


}
