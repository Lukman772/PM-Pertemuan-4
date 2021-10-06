public class Stack<L> {

        public L[] data;
        public int top = 0;

        public Stack(int DataAngka) {

            data = (L[]) new Object[DataAngka];
        }

        public boolean isEmpty() {
            return top == 0;

        }

        public boolean isFull() {
            return top == data.length;

        }
        public void push(L AngkaValue) {

            if (!isFull()) {
                data[top] = AngkaValue;
                top = top + 1;
            } else {
                
                System.out.println("Stack Penuh");
            }
        }
        public L pop() {

            if (!isEmpty()) {
                top = top-1;

                L r = data[top];
                return r;
            } else {
                return null;
            }
        }

        public L peek() {

            if (!isEmpty()) {
                return data[top - 1];
            } else {
                return null;
            }
        }
}
