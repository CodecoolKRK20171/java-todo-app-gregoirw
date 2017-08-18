import java.util.ArrayList;

public class TodoItem{
    private String name;
    Boolean isCompleted = false;

    public TodoItem(String name){
        this.name = name;

        }
    public void getCompleted(TodoItem this){
        this.isCompleted = true;
    }

    public String getName(){
        return this.name;
    }

}
