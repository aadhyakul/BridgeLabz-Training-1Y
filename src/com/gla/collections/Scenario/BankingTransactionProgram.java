package com.gla.collections.Scenario;

import java.util.*;

class TransactionRecord {
    int id;
    TransactionRecord(int i){ id=i; }
}

class AccountRecord {
    int id;
    AccountRecord(int i){ id=i; }

    public int hashCode(){ return id; }

    public boolean equals(Object o){
        return (o instanceof AccountRecord) &&
                ((AccountRecord)o).id==this.id;
    }
}

public class BankingTransactionProgram {
    public static void main(String[] args) {

        Queue<TransactionRecord> queue = new LinkedList<>();
        Stack<TransactionRecord> stack = new Stack<>();

        queue.add(new TransactionRecord(1));

        while(!queue.isEmpty()){
            TransactionRecord t = queue.poll();
            stack.push(t);
        }

        System.out.println("Rollback: "+stack.pop().id);
    }
}