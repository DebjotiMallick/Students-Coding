class CallByValue{

    int data = 50; // global data variable

    void change(int data){
        data = data + 100; // 500 + 100 = 600 is stored in local data variable
        System.out.println("after change from method: " + data);
    }

    public static void main(String[] args){
        CallByValue cbv = new CallByValue();
        System.out.println("before change: " + cbv.data);
        cbv.change(500);
        System.out.println("after change: " + cbv.data);
    }
}