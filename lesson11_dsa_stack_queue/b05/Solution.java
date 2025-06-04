package b05;

public class Solution {
    Queue queue;

    public Solution() {
        queue = new Queue();
    }

    public void enQueue(int value) {
        Node newNode = new Node(value);
        if (queue.front == null) {
            queue.front = queue.rear = newNode;
            queue.rear.link = queue.front;
        } else {
            queue.rear.link = newNode;
            queue.rear = newNode;
            queue.rear.link = queue.front; // Đảm bảo vòng tròn
        }
    }

    public Integer deQueue() {
        if (queue.front == null) {
            System.out.println("Queue is empty");
            return null;
        }

        int value = queue.front.data;

        if (queue.front == queue.rear) {
            queue.front = queue.rear = null;
        } else {
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }
        return value;
    }

    public void displayQueue() {
        if (queue.front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = queue.front;
        System.out.printf("Queue: ");
        do {
            System.out.println(temp.data);
            temp = temp.link;
        } while (temp != queue.front);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.enQueue(14);
        solution.displayQueue();

        solution.enQueue(22);
        solution.displayQueue();

        solution.enQueue(-6);
        solution.displayQueue();

        solution.deQueue();
        solution.displayQueue();

        solution.deQueue();
        solution.displayQueue();

        solution.enQueue(9);
        solution.displayQueue();

        solution.enQueue(20);
        solution.displayQueue();
    }
}
