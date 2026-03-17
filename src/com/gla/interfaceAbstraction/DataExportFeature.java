package com.gla.interfaceAbstraction;

interface Exportable {
    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exporting to JSON via default method");
    }
}

class SalesReport implements Exportable {
    public void exportToCSV() {
        System.out.println("Sales Report exported to CSV");
    }

    public void exportToPDF() {
        System.out.println("Sales Report exported to PDF");
    }
}

class InventoryReport implements Exportable {
    public void exportToCSV() {
        System.out.println("Inventory Report exported to CSV");
    }

    public void exportToPDF() {
        System.out.println("Inventory Report exported to PDF");
    }

    public void exportToJSON() {
        System.out.println("Inventory Report custom JSON export");
    }
}

public class DataExportFeature {
    public static void main(String[] args) {
        Exportable r1 = new SalesReport();
        r1.exportToCSV();
        r1.exportToPDF();
        r1.exportToJSON();

        Exportable r2 = new InventoryReport();
        r2.exportToCSV();
        r2.exportToPDF();
        r2.exportToJSON();
    }
}