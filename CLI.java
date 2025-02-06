import java.util.Date;
import java.util.Scanner;

import TaskTracker.Task;

import java.util.ArrayList;

public class CLI{

    

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<TaskTracker.Task> tasks = new ArrayList<>();
        int curId=0;
        while (true) {
            String input = scanner.next();
            if (input.equals("add")){
                curId+=1;
                String newDescription = scanner.next();
                Task newTask = new TaskTracker.Task();
                newTask.id=Integer.toString(curId);
                newTask.description=newDescription;
                newTask.createdAt=new Date();
                newTask.updatedAt=new Date();
                newTask.status="todo";
                tasks.add(newTask);
                System.out.println(newTask);
                System.out.println("Added");

            }
            else if (input.equals("update")){
                String updatingId = scanner.next();
                for (int i = 0;i<tasks.size();i++){
                    if (updatingId.equals(tasks.get(i).id)){
                        tasks.get(i).description=scanner.next();
                        System.out.println(tasks.get(i));
                    }
                }
                System.out.println("Updated");

            }
            else if (input.equals("delete")){
                String deletingId = scanner.next();
                for (int i = 0;i<tasks.size();i++){
                    if (deletingId.equals(tasks.get(i).id)){
                        System.out.println(tasks.get(i));
                        tasks.remove(i);
                       
                        System.out.println("Deleted");
                        break;
                    }
                }


            }
            else if (input.equals("mark-in-progress")){
                String updatingId = scanner.next();
                for (int i = 0;i<tasks.size();i++){
                    if (updatingId.equals(tasks.get(i).id)){
                        tasks.get(i).status="in-progress";
                        System.out.println(tasks.get(i));
                    }
                }
                System.out.println("marked in progress");

            }
            else if (input.equals("mark-done")){
                String updatingId = scanner.next();
                for (int i = 0;i<tasks.size();i++){
                    if (updatingId.equals(tasks.get(i).id)){
                        tasks.get(i).status="done";
                        System.out.println(tasks.get(i));
                    }
                }
                System.out.println("marked done");

            }
            else if (input.equals("list")){
                String type = scanner.nextLine().trim();

                if (type.equals("done") || type.equals("todo") || type.equals("in-progress")){
                    for (int i = 0;i<tasks.size();i++){
                        if (tasks.get(i).status.equals(type)){
                            System.out.println(tasks.get(i));
                        }
                    }
                }
                else if (type.isEmpty()){
                    for (int i = 0;i<tasks.size();i++){
                        System.out.println(tasks.get(i));
                    }

                }
                else{
                    System.out.println("List only supports done,in-progress,todo");
                }

            }
            else if (input.equals("exit")){
                System.out.println("Exiting");
                System.out.println(tasks);
                break;
            }
            else{
                System.out.println("'exit' to exit the program");
            }
        }

        scanner.close();
    }
}