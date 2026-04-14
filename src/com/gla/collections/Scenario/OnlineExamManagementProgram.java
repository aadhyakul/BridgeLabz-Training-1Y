package com.gla.collections.Scenario;
import java.util.*;

class ExamQ { String q; ExamQ(String q){ this.q=q; } }
class ExamS { String id; ExamS(String id){ this.id=id; } }

public class OnlineExamManagementProgram {
    public static void main(String[] args) {

        List<ExamQ> questions = new ArrayList<>();
        questions.add(new ExamQ("Q1"));
        questions.add(new ExamQ("Q2"));
        Collections.shuffle(questions);

        Set<String> students = new HashSet<>();
        students.add("S1");
        students.add("S1");

        Queue<ExamS> queue = new LinkedList<>();
        queue.add(new ExamS("S1"));

        Stack<ExamQ> stack = new Stack<>();
        stack.push(questions.get(0));

        System.out.println("Students: "+students);
    }
}