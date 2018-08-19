
package tasks;

import java.util.Scanner;


public class TaskRandom {
    static Scanner input = new Scanner(System.in);
    String rd;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TaskRandom ta = new TaskRandom();
       
        
       System.out.println("Enter number of iteration");
       int in = input.nextInt();
       for(int i = 0; i <in; i++){
           TaskRandom [] list = ta.getQuestionBank();
           ta.printRandom(list);
           double ran = Math.random();
           double range = ran * 30;
           long indx = Math.round(range);
           System.out.println("Question " + indx);
       }
    }
    
    
    
    TaskRandom [] getQuestionBank(){
        System.out.println("Please Enter number of Questions");
        int num = input.nextInt();
        TaskRandom [] fillList = new TaskRandom[num];
        for(int i = 0; i < num; i++){
            TaskRandom rand = new TaskRandom();
             System.out.println("Q Num " + (i+1));
             System.out.println("q");
//            System.out.println("Please Enter Number of Questions");
//            Integer a = input.nextInt();
//            for(int x = 0; x < a; x++){
//                System.out.println("Q Num " + (x+1));
//            }
            System.out.println();
            fillList[i] = rand;
        }
        return fillList;
    }
    void printRandom(TaskRandom[] list){
        for(int i = 0; i<list.length;i++){
            TaskRandom rand = list[i];
            System.out.println(rand);
        }
    }
}
