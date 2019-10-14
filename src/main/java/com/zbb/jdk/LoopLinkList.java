package com.zbb.jdk;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 * 描述：
 * 循环链表 实现
 *
 * @author bbzhou
 * @created 2019/3/15
 */
public class LoopLinkList {

    /*private final static Logger logger = LoggerFactory.getLogger(LoopLinkList.class);

    // 头结点
    private Node first;

    // 位置
    private int pos = 0;

    public LoopLinkList() {
        this.first = null;
    }

    // 添加头节点
    public void addFirstNode(int data) {
        Node node = new Node(data);
        node.next = first;
        first = node;
    }

    // 在任何位置添加数据
    public void add(int index, int data) {
        Node addNode = new Node(data);
        Node current = first;
        Node previous = first;
        while (pos != index) {
            if(current == null) {
                logger.warn("linkAddWarn", "插入位置不存在，插入失败");
                return;
            }
            previous = current;
            current = current.next;
            pos++;
        }
        previous.next = addNode;
        addNode.next = current;
        pos = 0;
    }

    // 删除头节点
    public void deleteFirstNode() {
        Node current = first;
        first = current.next;
    }

    // 在任何位置删除节点
    public Node deleteByPos(int index) {
        Node current = first;
        Node previous = first;
        while (index != pos && current != null) {
            previous = current;
            current = current.next;
            if(current == null) {
                logger.warn("deleteByPosWarn", "删除数据失败！");
                pos = 0;
                return null;
            }
            pos++;
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
            pos = 0;
        }
        return current;
    }

    // 根据数据删除节点
    public Node deleteByData(int data) {
        Node current = first;
        Node previous = first;
        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
            if(current == null){
                logger.warn("deleteByDataWarn", "删除失败！");
                return null;
            }

        }
        if (current.data == first.data) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    // 根据位置找节点数据
    public Node findByIndex(int index) {
        Node current = first;
        while (pos != index && current != null) {
            current = current.next;
            pos++;
        }
        pos = 0;
        return current;
    }

    // 根据数据找节点
    public Node findByData(int data) {
        Node current = first;
        if(current == null) {
            logger.warn("findWarn", "查找数据失败！");
            return null;
        }
        while (current.data != data) {
            current = current.next;
            if(current == null){
                logger.warn("findWarn", "查找数据失败！");
                return null;
            }
        }
        return current;
    }

    // 打印 链表数据
    public String print() {
        StringBuilder sb = new StringBuilder();
        Node current = first;
        while (current != null) {
            sb.append(current.getData()).append(",");
            current = current.next;
        }
        return sb.length() > 0 ? sb.toString().substring(0, sb.toString().lastIndexOf(",")) : "";
    }*/

}

