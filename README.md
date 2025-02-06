
# 📝 Task Tracker CLI (Java)  

A simple **Task Tracker Command-Line Interface (CLI) application** built in **Java**. This project was created as a learning exercise to understand Java fundamentals, including **classes, objects, I/O handling, and ArrayLists**.

## 🚀 Features  
✅ Add new tasks with descriptions  
✅ Update task descriptions  
✅ Delete tasks  
✅ Mark tasks as **in-progress** or **done**  
✅ List all tasks or filter by status  

---

## 🛠️ Setup & Installation  

### **1️⃣ Clone the Repository**  
```sh
git clone https://github.com/yourusername/TaskTrackerJava.git
cd TaskTrackerJava
```

### **2️⃣ Compile the Java Files**  
```sh
javac CLI.java
```

### **3️⃣ Run the Application**  
```sh
java CLI
```

---

## 📌 Usage Instructions  

The CLI accepts **commands** to manage tasks. Below are the supported commands:

| Command                  | Description                          | Example Usage |
|--------------------------|--------------------------------------|--------------|
| `add <description>`       | Adds a new task                     | `add Finish homework` |
| `update <task_id> <new_description>` | Updates an existing task | `update 1 Review notes` |
| `delete <task_id>`       | Deletes a task                      | `delete 2` |
| `mark-in-progress <task_id>` | Marks a task as **in-progress** | `mark-in-progress 3` |
| `mark-done <task_id>`    | Marks a task as **done**            | `mark-done 4` |
| `list`                   | Lists **all tasks**                 | `list` |
| `list done`              | Lists only **completed tasks**      | `list done` |
| `list in-progress`       | Lists only **in-progress tasks**    | `list in-progress` |
| `exit`                   | Exits the CLI                       | `exit` |



---

## 📚 Concepts Learned  
✅ Object-Oriented Programming (OOP)  
✅ Working with Java's **Scanner** class for user input  
✅ Using **ArrayLists** to manage tasks  
✅ Basic file structuring and class separation  

