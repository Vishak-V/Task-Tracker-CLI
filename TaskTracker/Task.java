package TaskTracker;

import java.util.Date;

public class Task{
    public String id;
    public String description;
    public String status;
    public Date createdAt;
    public Date updatedAt;

    @Override
    public String toString(){
        return String.format(
            "Task ID: %s\nDescription: %s\nStatus: %s\nCreated At: %s\nUpdated At: %s",
            id, description, status, createdAt, updatedAt
        );
    }
}