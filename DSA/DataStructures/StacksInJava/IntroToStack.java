package DSA.DataStructures.StacksInJava;

class StackFullException extends Exception {

}

class StackEmptyException extends Exception {

}

class Stack {
    private int data[];
    private int topIndex; // index of the top most element of the stack

    public Stack() {
        data = new int[2];
        topIndex = -1;
    }

    public Stack(int size) {
        data = new int[size];
        topIndex = -1;
    }

    public int size() {
        return topIndex + 1;
    }

    public boolean isEmpty() {
        // if(topIndex==-1){
        // return true;
        // }else{
        // return false;
        // }
        // or, anmother version of the above code is
        return topIndex == -1;
    }

    public void push(int elem) throws StackFullException {
        // if stack is full
        if (topIndex == data.length - 1) {
            doubleCapacity();
        }

        data[++topIndex] = elem;
    }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }

    public int top() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    public int pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException();
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }
}

public class IntroToStack {
    public static void main(String[] args) {
        Stack stack = new Stack();

        int arr[] = { 5, 6, 7, 1, 9 };
        for (int i = 0; i < arr.length; i++) {
            try {
                stack.push(arr[i]);
            } catch (StackFullException e) {
                e.printStackTrace();
            }
        }

        while (!stack.isEmpty()) {
            try {
                System.out.println(stack.pop());
            } catch (StackEmptyException e) {
                e.printStackTrace();
            }
        }
    }
}
