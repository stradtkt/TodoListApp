package com.todolist;

import com.todolist.datamodel.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;
    public void initialize() {
        TodoItem item1 = new TodoItem("Mail a birthday card", "Buy a 80th birthday card for grandpa",
                LocalDate.of(2018, Month.DECEMBER, 10));
        TodoItem item2 = new TodoItem("Interview", "Interview for a job position in Cincinnati",
                LocalDate.of(2018, Month.DECEMBER, 4));
        TodoItem item3 = new TodoItem("Friends Giving", "Friends giving party hopefully I can attend",
                LocalDate.of(2018, Month.DECEMBER, 1));
        TodoItem item4 = new TodoItem("Doctors Appointment", "Doctors appointment in clifton before psi",
                LocalDate.of(2018, Month.NOVEMBER, 28));
        TodoItem item5 = new TodoItem("Jury duty", "A large case that needed many jury people",
                LocalDate.of(2018, Month.DECEMBER, 21));
        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);
    }
}
