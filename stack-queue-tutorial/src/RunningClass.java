public class RunningClass {
    public static void main(String[] args) throws Exception {
//        CustomStack stack = new CustomStack(5);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        DynamicStack stack = new DynamicStack(5);
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//        stack.push(7);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//        queue.insert(4);
//        queue.insert(5);
//
//        queue.display();
//
//        System.out.println(queue.remove());
//        queue.display();

//        CircularQueue queue = new CircularQueue(5);
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//        queue.insert(4);
//        queue.display();
//        System.out.println(queue.remove());
//        queue.display();
//        queue.insert(8);
//        queue.insert(89);
//        queue.display();

        DynamicQueue queue = new DynamicQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
        queue.insert(8);
        queue.insert(89);
        queue.display();
    }
}
