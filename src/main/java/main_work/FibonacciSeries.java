package main_work;



public class FibonacciSeries
{
    public long fibonacci(long number) {
        if(number==0){
            return 0;
        }
        if(number ==1 || number==2  ){
            return 1;
        }
        if(number<0){
            return -1;
        }
        return fibonacci(number-1)+fibonacci(number-2);
    }
    public void printFibonacciSeries(long number){
        for(int i=0;i<number;i++){
            System.out.println(fibonacci(i)+ "");
        }
    }
    public static void main( String[] args )
    {
        FibonacciSeries fib = new FibonacciSeries();
        fib.printFibonacciSeries(10);

    }
}
