package data_str_stack;

public class stack_array {
    int size;
    int [] arr;
    int top;
    stack_array(int size)

    {
        arr= new int[size];
        this.size=5;
        top=-1;
    }
    void push(int data){
        if(top==size-1){
            System.out.println("stack full");
        }
        top++;
        arr[top]=data;
    }
    int pop(){
        if(top==-1){
            System.out.println("empty");
        }
        int val= arr[top];
        return val;
    }
    int peek(){
        return arr[top];
    }

    void display(){
        for(int i=top;i>=1;i--){
            System.out.print( arr[i]+"<-");
        }
    }
    public static void main(String[] args) {
        stack_array obj= new stack_array(5);
        obj.push(1);
        obj.push(2);
        System.out.println(obj.pop());

        obj.display();
    }

}
