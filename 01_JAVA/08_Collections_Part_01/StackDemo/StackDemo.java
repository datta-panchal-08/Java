package StackDemo;

import java.util.Stack;

public class StackDemo {
    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(13);
        st.push(34);
        st.push(16);
        System.out.println("Stack : "+st);
        System.out.println("Pop : "+st.pop());
        System.out.println("Pop : "+st.pop());
        System.out.println("Stack after removing an Element : "+st);
        st.push(78);
        st.push(89);
        System.out.println("Stack : "+st);
    }
}
