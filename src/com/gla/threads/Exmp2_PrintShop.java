package com.gla.threads;
class PrintJob implements Runnable {
    private String documentName;
    private int pages;

    public PrintJob(String documentName, int pages) {
        this.documentName = documentName;
        this.pages = pages;
    }

    public void run() {
        System.out.println("Printing " + documentName + " (" + pages + " pages)");
        for (int i = 1; i <= pages; i++) {
            System.out.println(documentName + " - Page " + i + " of " + pages);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(documentName + " printed successfully!");
    }
}

public class Exmp2_PrintShop {
    public static void main(String[] args) {
        Thread printer1 = new Thread(new PrintJob("Report.docx", 3));
        Thread printer2 = new Thread(new PrintJob("Invoice.pdf", 2));
        printer1.start();
        printer2.start();
    }
}