import java.util.Scanner;

public class App{
  public static void main(String[] args) {
        String showMenu = "show, mark, add, archive, exit";

        TodoList ToDoList = new TodoList();

        while (true) {
            System.out.println(showMenu);
            System.out.println("Please type an option: ");
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine().toUpperCase();

            if(answer.equals("SHOW")) {
                showAllItems(ToDoList);

            } else if(answer.equals("ADD")) {
                System.out.println("Please provide new item: ");

                String name = scan.nextLine().toUpperCase();
                TodoItem ToDoItem = new TodoItem(name);
                addNewItem(ToDoItem, ToDoList);

            } else if(answer.equals("MARK")){
                showAllItems(ToDoList);
                System.out.println("Please type item you want to mark: ");
                String name = scan.nextLine().toUpperCase();
                markItem(name, ToDoList);

            } else if(answer.equals("ARCHIVE")){
                archive(ToDoList);

            } else if(answer.equals("EXIT")){
                System.exit(0);
            }


            }
        }



    public static void showAllItems(TodoList ToDoList) {
        ToDoList.showTasks();
    }

    public static void addNewItem(TodoItem name, TodoList ToDoList) {
        ToDoList.addToList(name);
    }

    public static void markItem(String name, TodoList ToDoList) {
        for (TodoItem item : ToDoList.getItems()) {
            if (item.getName().equals(name)) {
                item.isCompleted = true;
            }
        }
    }

    public static void archive(TodoList ToDoList) {
        ToDoList.deleteItem();
    }
}
