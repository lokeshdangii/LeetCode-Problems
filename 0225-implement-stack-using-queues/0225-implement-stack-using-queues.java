class MyStack {



    Queue<Integer>q1=new LinkedList<>();
    Queue<Integer>q2=new LinkedList<>();
    int top;
    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
        //top=0;
    }
    
    public void push(int x) {
        q1.offer(x);
        top=x;
    }
    
    public int pop() {
        while(q1.size()>1){
            top=q1.poll();
            q2.offer(top);
        }
        int val=q1.poll();
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
        return val;
    }
    
    public int top() {
       // if(!q1.isEmpty())
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }



    
    // static Queue<Integer> q1 = new LinkedList<>();
    // static Queue<Integer> q2 = new LinkedList<>();

    // public MyStack() {
        
    // }
    
    // public void push(int x) {
    //     // Emptying Queue s1
    //         while(!q1.isEmpty()){
    //             q2.add(q1.remove());
    //         }

    //         q1.add(x);

    //         // pushing s2 elements in s1
    //         while(!q2.isEmpty()){
    //             q1.add(q2.remove());
    //         }
    // }
    
    // public int pop() {
    //     return q1.remove();
    // }
    
    // public int top() {

    //     return q1.peek();
    // }
    
    // public boolean empty() {
    //     return q1.isEmpty();
    // }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();

         if(empty()){
                return -1;
            }
 */