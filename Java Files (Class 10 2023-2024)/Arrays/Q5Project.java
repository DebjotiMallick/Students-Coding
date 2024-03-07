import java.util.Scanner;

class Q5Project{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int N = sc.nextInt();
        String name[] = new String[N];
        int totalmarks[] = new int[N];
        System.out.println("Enter name and marks for each student:");
        for (int i = 0; i < N; i++){
            name[i] = sc.next();
            totalmarks[i] = sc.nextInt();
        }

        double sum = 0.0;
        for(int i = 0; i < N; i++){
            sum += totalmarks[i];
        }

        double average = (double)(sum / N);
        System.out.format("Average marks of students: %.2f\n", average);

        for(int i = 0; i < N; i++){
            System.out.format("Deviation of "+name[i]+" is %.2f\n",(totalmarks[i] - average));
        }

    }
}