package com.gla.collections.Scenario;

import java.util.*;

class PolicyRecord implements Comparable<PolicyRecord>{
    String policyNo, holder, type;
    Date expiry;
    double premium;

    PolicyRecord(String p,String h,Date e,String t,double pr){
        policyNo=p; holder=h; expiry=e; type=t; premium=pr;
    }

    public int compareTo(PolicyRecord o){
        return this.expiry.compareTo(o.expiry);
    }

    public int hashCode(){ return policyNo.hashCode(); }

    public boolean equals(Object o){
        return (o instanceof PolicyRecord) &&
                ((PolicyRecord)o).policyNo.equals(this.policyNo);
    }
}

public class InsurancePolicyManagementProgram {
    public static void main(String[] args) {

        Set<PolicyRecord> hashSet = new HashSet<>();
        Set<PolicyRecord> linkedSet = new LinkedHashSet<>();
        Set<PolicyRecord> treeSet = new TreeSet<>();

        PolicyRecord p1 = new PolicyRecord("P1","A",new Date(),"Health",1000);
        PolicyRecord p2 = new PolicyRecord("P2","B",new Date(System.currentTimeMillis()+100000000),"Auto",2000);

        hashSet.add(p1);
        hashSet.add(p2);

        linkedSet.addAll(hashSet);
        treeSet.addAll(hashSet);

        System.out.println(hashSet);
        System.out.println(treeSet);
    }
}