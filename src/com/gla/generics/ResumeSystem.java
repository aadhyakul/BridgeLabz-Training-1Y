package com.gla.generics;
import java.util.*;

abstract class JobRole {}
class SoftwareEngineer extends JobRole {}

class Resume<T extends JobRole>{
    T role;
    Resume(T r){ role = r; }
}

public class ResumeSystem {
    static void process(List<? extends JobRole> list){
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<SoftwareEngineer> list = Arrays.asList(new SoftwareEngineer());
        process(list);
    }
}
