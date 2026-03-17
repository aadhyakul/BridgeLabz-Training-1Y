package com.gla.javaPackages.Q10_CompanyAnalyticsSubPackages;

import com.gla.javaPackages.Q10_CompanyAnalyticsSubPackages.com.company.analytics.sales.SalesReport;
import com.gla.javaPackages.Q10_CompanyAnalyticsSubPackages.com.company.analytics.hr.EmployeeReport;

public class Main_CompanyAnalyticsSubPackages {
    public static void main(String[] args) {
        System.out.println("======= Combined Company Report =======\n");

        SalesReport sales = new SalesReport();
        sales.printSalesData();

        System.out.println();

        EmployeeReport hr = new EmployeeReport();
        hr.printEmployeePerformance();
    }
}
