package com.gla.threads;

class DownloadThread extends Thread {
    private String fileName;

    public DownloadThread(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println("Downloading " + fileName + "...");
        for (int i = 1; i <= 5; i++) {
            System.out.println(fileName + " - Progress: " + (i * 20) + "%");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(fileName + " download complete!");
    }
}

public class Exmp1_DownloadManager {
    public static void main(String[] args) {
        DownloadThread file1 = new DownloadThread("Document.pdf");
        DownloadThread file2 = new DownloadThread("Video.mp4");
        file1.start();
        file2.start();
    }
}
