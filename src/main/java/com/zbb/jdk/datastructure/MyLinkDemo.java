package com.zbb.jdk.datastructure;

/**
 * 描述：单链表
 *
 * @author: 46409
 * @created 2019/10/14
 */
public class MyLinkDemo {

    // 头节点
    private Node head;

    // 实际链表数据数量
    private int size;

    public void insert(int index, int data){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("参数不合法");
        }
        Node insertData = new Node(data);
        if(size == 0){
            head = insertData;
        }else if(index == 0){
            insertData.next = head;
            head = insertData;
        }else{
            Node preNode = get(index - 1);
            insertData.next = preNode.next;
            preNode.next = insertData;
        }
        size++;
    }

    public Node delete(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("参数不合法");
        }
        Node deleteNode = null;
        if(index == 0){
            deleteNode = head;
            head = head.next;
        }else{
            deleteNode = get(index);
            Node preNode = get(index - 1);
            preNode.next = deleteNode.next;
        }
        size--;
        return deleteNode;
    }

    public Node get(int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("参数不合法");
        }
        Node node = head;
        for(int i = 1; i <= index; i++){
            node = node.next;
        }
        return node;
    }

    public String output(){
        StringBuffer sb = new StringBuffer();
        if(head != null){
            sb.append(head.data).append("-");
            Node next = head.next;
            while (next != null){
                sb.append(next.data).append("-");
                next = next.next;
            }
            return sb.toString().substring(0, sb.toString().lastIndexOf("-"));
        }
        return "";
    }

    public static void main(String[] args) {
        MyLinkDemo myLinkDemo = new MyLinkDemo();
        myLinkDemo.insert(0, 5);
        myLinkDemo.insert(1, 2);
        myLinkDemo.insert(2, 4);
        myLinkDemo.insert(3, 1);
        myLinkDemo.insert(4, 3);
        System.out.println(myLinkDemo.output());
        Node delete = myLinkDemo.delete(0);
        System.out.println(delete.data + "----------" + myLinkDemo.output());
       /* Node node = myLinkDemo.get(2);
        Node node1 = myLinkDemo.get(4);
        System.out.println(node.data +"====="+ node1.data);*/
    }
}



// node 节点
class Node{

    int data;

    Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
