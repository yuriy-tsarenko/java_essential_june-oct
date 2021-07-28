package com.java_essential.kvirikadze.homework.lesson3.issue3;

public class Main {
    public static void main(String[] args) {
        String license = License.getLicenseFromUser();
        DocumentWorker doc;
        if (License.checkLicenseIsPro(license)) {
            doc = new ProDocumentWorker();
        } else if (License.checkLicenseIsExpert(license)) {
            doc = new ExpertDocumentWorker();
        } else {
            doc = new DocumentWorker();
        }

        doc.openDocument();
        doc.editDocument();
        doc.saveDocument();
    }

}
