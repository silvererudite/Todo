public class Task {

    private String taskName;
    private int taskId;

    private String getTaskDesc;

    private String taskDesc;
    private String taskType;
    public Task(String taskName, String taskType, String taskDesc){
        this.taskName = taskName;
        this.taskType = taskType;
        this.taskDesc = taskDesc;
    }

    @Override
    public String toString() {
        return "Task {" +
                "taskName='" + taskName + '\'' +
                ", taskId=" + taskId +
                ", getTaskDesc='" + getTaskDesc + '\'' +
                ", taskDesc='" + taskDesc + '\'' +
                ", taskType='" + taskType + '\'' +
                '}';
    }
}
