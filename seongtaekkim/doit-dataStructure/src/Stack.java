import java.util.Scanner;

public class Stack {

    public Stack() {
        new IntStackTester();
        //new GenericStackTester();
        //new IntStack2TrackTester();
    }
}


class IntStack {
    private int max;
    private int ptr;
    private int[] stk;

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    public class OverFlowIntStackException extends RuntimeException {
        public OverFlowIntStackException() {};
    }


    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max];
        } catch(OutOfMemoryError e) {
            max = 0;
        }
    }

    public int push(int x) throws OverFlowIntStackException {
        if(ptr >= max) {
            throw new OverFlowIntStackException();
        }
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException {
        if(ptr <= 0 )
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    public int peek() throws EmptyIntStackException {
        if(ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr -1];
    }

    public int indexOf(int x) {
        for(int i=ptr-1 ; i>=0 ; i--) {
            if(stk[i] == x)
                return i;
        }
        return -1;
    }
    public void clear() {
        ptr = 0;
    }
    public int capacity() {
        return max;
    }

    public int size() {
        return ptr;
    }
    public boolean isEmpty() {
        return ptr <= 0;
    }

    public boolean isFull() {
        return ptr>=max;
    }
    public void dump() {
        if(ptr<=0) {
            System.out.println("stack is empty");
        } else {
            for(int i=0; i<ptr ; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }

}



class EmptyIntStackException extends RuntimeException {
    public EmptyIntStackException() {}
}

class OverFlowIntStackException extends RuntimeException {
    public OverFlowIntStackException() {};
}

class GenericStack<E> {
    private int max;
    private int ptr;
    private E[] stk;


    @SuppressWarnings("uncheck")
    public GenericStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = (E[]) new Object[max];
        } catch(OutOfMemoryError e) {
            max = 0;
        }
    }

    public E push(E x) throws OverFlowIntStackException {
        if(ptr >= max) {
            throw new OverFlowIntStackException();
        }
        return stk[ptr++] = x;
    }

    public E pop() throws EmptyIntStackException {
        if(ptr <= 0 )
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    public E peek() throws EmptyIntStackException {
        if(ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr -1];
    }

    public int indexOf(E x) {
        for(int i=ptr-1 ; i>=0 ; i--) {
            if(x.equals(stk[i]))
                return i;
        }
        return -1;
    }
    public void clear() {
        ptr = 0;
    }
    public int capacity() {
        return max;
    }

    public int size() {
        return ptr;
    }
    public boolean isEmpty() {
        return ptr <= 0;
    }

    public boolean isFull() {
        return ptr>=max;
    }
    public void dump() {
        if(ptr<=0) {
            System.out.println("stack is empty");
        } else {
            for(int i=0; i<ptr ; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }

}

/**
 * q2 stack to generic stack
 */
class GenericStackTester {

    public GenericStackTester() {
        Scanner stdIn = new Scanner(System.in);
        GenericStack<String> s = new GenericStack<>(16);

        while(true) {
            System.out.println("current size is " +s.size() + "/" + s.capacity());
            System.out.println("(0)exit (1)push (2)pop (3)peek (4)dump (5)indexOf (6)clear (7)isEmpty (8)isFull");

            int menu = stdIn.nextInt();
            if(menu == 0)
                break;
            String x=null;
            switch(menu) {
                case 1:
                    System.out.println("data : ");
                    x = stdIn.next();
                    try {
                        s.push(x);
                    } catch(IntStack.OverFlowIntStackException e) {
                        System.out.println("stack is full");
                    }
                    break;
                case 2:
                    try {
                        x = s.pop();
                        System.out.println("pop data is " + x);
                    } catch(IntStack.EmptyIntStackException e) {
                        System.out.println("stack is empty");
                    }
                    break;
                case 3:
                    try {
                        x = s.peek();
                        System.out.println("peak data is " + x);
                    } catch(IntStack.EmptyIntStackException e) {
                        System.out.println("stack is empty");
                    }
                    break;
                case 4:
                    s.dump();
                    break;
                case 5:
                    System.out.print("find data : ");
                    String data = stdIn.next();
                    int idx = s.indexOf(data);
                    if(idx == -1 ) {
                        System.out.println("not data");
                    } else {
                        System.out.println("index num is " + idx);
                    }
                    break;
                case 6:
                    s.clear();
                    break;
                case 7:
                    if(s.isEmpty()) {
                        System.out.println("stack is empty");
                    } else {
                        System.out.println("stack is not empty");
                    }
                    break;
                case 8:
                    if(s.isFull()) {
                        System.out.println("stack is full");
                    } else {
                        System.out.println("stack is not full");
                    }
                    break;
                default :
                    break;
            }
        }

    }
}


class IntStack2Track {
    public int max;
    public int ptrLeft;
    public int ptrRight;
    public int[] stk;
    public final static int STACK_TRACK_LEFT = 1;
    public final static int STACK_TRACK_RIGHT = 2;


    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    public class OverFlowIntStackException extends RuntimeException {
        public OverFlowIntStackException() {};
    }

    public class TrackSelectException extends RuntimeException {
        public TrackSelectException() {}
    }


    public IntStack2Track(int capacity) {
        ptrLeft = 0;
        max = capacity;
        ptrRight = max-1;
        try {
            stk = new int[max];
        } catch(OutOfMemoryError e) {
            max = 0;
        }
    }

    public int push(int x, int track) throws OverFlowIntStackException, TrackSelectException {
        //System.out.println("track : " +track);
        System.out.println("x : " + x);
        if(ptrLeft + (max-1-ptrRight) >= max) {
            throw new OverFlowIntStackException();
        }
        if(track == this.STACK_TRACK_LEFT) {
            return stk[ptrLeft++] = x;
        } else if(track == this.STACK_TRACK_RIGHT)  {
            return stk[ptrRight--] = x;
        } else {
            throw new TrackSelectException();
        }
    }

    public int pop(int track) throws EmptyIntStackException,TrackSelectException {
        if(track == this.STACK_TRACK_LEFT) {
            if(ptrLeft <= 0 )
                throw new EmptyIntStackException();
            return stk[ptrLeft--];
        } else if(track == this.STACK_TRACK_RIGHT)  {
            if(ptrRight >= max )
                throw new EmptyIntStackException();
            return stk[ptrRight++];
        } else {
            throw new TrackSelectException();
        }

    }

    public int peek(int track) throws EmptyIntStackException,TrackSelectException {

        if(track == this.STACK_TRACK_LEFT) {
            if(ptrLeft <= 0 )
                throw new EmptyIntStackException();
            return stk[ptrLeft-1];
        } else if(track == this.STACK_TRACK_RIGHT)  {
            if(ptrRight >= max )
                throw new EmptyIntStackException();
            return stk[ptrRight+1];
        } else {
            throw new TrackSelectException();
        }
    }

    public int indexOf(int x, int track) {
        if(track == this.STACK_TRACK_LEFT) {
            for(int i=ptrLeft-1 ; i>=0 ; i--) {
                if(stk[i] == x)
                    return i;
            }
        } else if(track == this.STACK_TRACK_RIGHT)  {
            for(int i=ptrRight+1 ; i<max ; i++) {
                if(stk[i] == x)
                    return i;
            }
        } else {
            throw new TrackSelectException();
        }
        return -1;
    }
    public void clearAll() {
        ptrRight = max;
        ptrLeft = 0;
    }
    public void clear(int track) {
        if(track == this.STACK_TRACK_LEFT) {
            ptrLeft = 0;
        } else if(track == this.STACK_TRACK_RIGHT)  {
            ptrRight = max;
        } else {
            throw new TrackSelectException();
        }
    }
    public int capacity() {
        return max;
    }

    public int size() {
        return ptrLeft + (max-1-ptrRight);
    }
    public boolean isEmpty() {
        return (ptrLeft+(max-1-ptrRight)) <= 0;
    }

    public boolean isFull() {
        return (ptrLeft+(max-1-ptrRight))>=max;
    }

    public void dump(int track) {
        if(track == this.STACK_TRACK_LEFT) {
            System.out.println("ptrLeft : "  +ptrLeft);
            if(ptrLeft<=0) {
                System.out.println("stack is empty");
            } else {
                for(int i=0; i<ptrLeft ; i++)
                    System.out.print(stk[i] + " ");
                System.out.println();
            }
        } else if(track == this.STACK_TRACK_RIGHT)  {
            if(ptrRight>max) {
                System.out.println("stack is empty");
            } else {
                for(int i=ptrRight+1; i<max ; i++)
                    System.out.print(stk[i] + " ");
                System.out.println();
            }
        } else {
            throw new TrackSelectException();
        }

    }

}


class IntStackTester {

    public IntStackTester() {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while(true) {
            System.out.println("current size is " +s.size() + "/" + s.capacity());
            System.out.println("(0)exit (1)push (2)pop (3)peek (4)dump (5)indexOf (6)clear (7)isEmpty (8)isFull");

            int menu = stdIn.nextInt();
            if(menu == 0)
                break;
            int x;
            switch(menu) {
                case 1:
                    System.out.println("data : ");
                    x = stdIn.nextInt();
                    try {
                        s.push(x);
                    } catch(IntStack.OverFlowIntStackException e) {
                        System.out.println("stack is full");
                    }
                    break;
                case 2:
                    try {
                        x = s.pop();
                        System.out.println("pop data is " + x);
                    } catch(IntStack.EmptyIntStackException e) {
                        System.out.println("stack is empty");
                    }
                    break;
                case 3:
                    try {
                        x = s.peek();
                        System.out.println("peak data is " + x);
                    } catch(IntStack.EmptyIntStackException e) {
                        System.out.println("stack is empty");
                    }
                    break;
                case 4:
                    s.dump();
                    break;
                case 5:
                    System.out.print("find data : ");
                    int data = stdIn.nextInt();
                    x = s.indexOf(data);
                    if(x == -1 ) {
                        System.out.println("not data");
                    } else {
                        System.out.println("index num is " + x);
                    }
                    break;
                case 6:
                    s.clear();
                    break;
                case 7:
                    if(s.isEmpty()) {
                        System.out.println("stack is empty");
                    } else {
                        System.out.println("stack is not empty");
                    }
                    break;
                case 8:
                    if(s.isFull()) {
                        System.out.println("stack is full");
                    } else {
                        System.out.println("stack is not full");
                    }
                    break;
                default :
                    break;
            }
        }

    }
}

class IntStack2TrackTester {
    private IntStack2Track s;

    public IntStack2TrackTester() {

        Scanner stdIn = new Scanner(System.in);
        s = new IntStack2Track(5);

        while(true) {
            System.out.println("(1)elft (2)right");
            int track = stdIn.nextInt();
            boolean bRet = doStack(track);
            if(bRet == false) {
                break;
            }

        }

    }

    public boolean doStack(int track) {
        Scanner stdIn = new Scanner(System.in);


        System.out.println("current size is " + s.size() + "/" + s.capacity());
        System.out.println("(0)exit (1)push (2)pop (3)peek (4)dump (5)indexOf (6)clear (7)isEmpty (8)isFull");


        int menu = stdIn.nextInt();
        if (menu == 0)
            return false;
        int x;
        switch (menu) {
            case 1:
                System.out.println("data : ");
                x = stdIn.nextInt();
                try {
                    s.push(x, track);
                } catch (IntStack.OverFlowIntStackException e) {
                    System.out.println("stack is full");
                }
                break;
            case 2:
                try {
                    x = s.pop(track);
                    System.out.println("pop data is " + x);
                } catch (IntStack.EmptyIntStackException e) {
                    System.out.println("stack is empty");
                }
                break;
            case 3:
                try {
                    x = s.peek(track);
                    System.out.println("peak data is " + x);
                } catch (IntStack.EmptyIntStackException e) {
                    System.out.println("stack is empty");
                }
                break;
            case 4:
                s.dump(track);
                break;
            case 5:
                System.out.print("find data : ");
                int data = stdIn.nextInt();
                x = s.indexOf(data, track);
                if (x == -1) {
                    System.out.println("not data");
                } else {
                    System.out.println("index num is " + x);
                }
                break;
            case 6:
                s.clear(track);
                break;
            case 7:
                if (s.isEmpty()) {
                    System.out.println("stack is empty");
                } else {
                    System.out.println("stack is not empty");
                }
                break;
            case 8:
                if (s.isFull()) {
                    System.out.println("stack is full");
                } else {
                    System.out.println("stack is not full");
                }
                break;
            default:
                break;
        }
        return true;
    }

}