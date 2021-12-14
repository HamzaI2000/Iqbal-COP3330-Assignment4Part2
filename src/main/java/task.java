import java.time.chrono.Chronology;

public class task {

    private String description;
    private boolean status;
    private String dueDate;

    public Task(String description, String dueDate) {
        this.description = description;
        this.status = true;
        this.dueDate = dueDate;
    }

    //*******Getters and Setters**********//

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String isStatus() {
        if(status)
            return "Not Complete.";
        return "Complete";
    }

    public boolean isStatusbool()
    {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
