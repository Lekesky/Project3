package com.company;

import java.util.Collections;

public class Task implements Comparable<Task> {
    private String title;
    private String desc;
    public int priority;

    public Task(String title, String desc, int priority) {
        this.title = title;
        this.desc = desc;
        this.priority = priority;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", priority=" + priority +
                '}';
    }


    public void sortTask() {
//        if(this.priority > Main.list.indexOf(this.priority)){
//            System.out.println(Main.list.get(1));
//        }


    }

    @Override
    public int compareTo(Task list) {

        if (this.priority == list.getPriority()) {
            return 0;
        } else if (this.priority > list.getPriority()) {
            return 1;
        } else {
            return -1;
        }
    }
}
interface Sort{
    void compareTo();

}