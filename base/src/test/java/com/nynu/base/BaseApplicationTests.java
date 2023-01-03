package com.nynu.base;

import com.nynu.base.entites.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class BaseApplicationTests {


    @Test
    void contextLoads() {



    }

    //定义一个类型为T的节点
    public class Node<T> {
        T date;
        Node<T> next;
        Node(T date) {
            date = date;
        }
    }

    public class LinkList<T>{

        //定义一个链表的表头
        public Node<T> first;
        private int pos = 0;
        public LinkList(){
            this.first = null;
        }

        //插入一个头节点(头插法)
        public void insertFront(T date){
            Node<T> node = new Node<>(date);
            node.next = this.first;
            this.first = node;
        }

    }

    @Test
    public void test12(){

        User user = new User();
        System.out.println(user);

    }







}
