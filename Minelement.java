package Stack;

import java.util.Stack;

public class Minelement {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

    public void pushing(int val) {

        stack.push(val);

        // Fix here
        if (minstack.isEmpty() || val <= minstack.peek()) {
            minstack.push(val);
        }
    }

    public void popping() {

        if (stack.peek().equals(minstack.peek())) {
            minstack.pop();
        }

        stack.pop();
    }

    public int topEle() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }

    public static void main(String[] args) {

        Minelement gm = new Minelement();

        gm.pushing(5);
        gm.pushing(-3);
        gm.pushing(0);
        gm.pushing(-2);
        gm.pushing(4);

        System.out.println(gm.topEle()); // 4
        System.out.println(gm.getMin()); // -3

        gm.popping();

        System.out.println(gm.topEle()); // -2
        System.out.println(gm.getMin()); // -3
    }
}