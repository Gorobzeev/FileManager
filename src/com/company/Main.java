package com.company;


import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args[0].equals("create")){
            String fileName = args[1];
            File file = new File("D:/MyProjects/FileManager/"+fileName);
            file.createNewFile();
            System.out.println("���� "+args[1]+"������.");
        }
        else if (args[0].equals("delete")){
            File dir = new File(args[1]);
            if (dir.isDirectory()){
                System.out.println(args[1]+" �������� ���������.");
                File[] flist = dir.listFiles();
                System.out.println("� �������� " + args[1]+" - "+flist.length+ " ����(��).");
                if (flist.length == 0){
                    System.out.println("������� "+args[1]+" ����.");
                    dir.delete();
                    System.out.println("������� "+args[1]+" ������.");
                    return;
                }
                else{
                    for (int i=0; i<flist.length; i++){
                        flist[i].delete();
                    }
                    System.out.println("������� "+flist.length+" ����(��) �� �������� "+args[1]+".");
                }
                dir.delete();
                System.out.println("������� "+args[1]+" �������.");
                return;
            }
            dir.delete();
            System.out.println("���� "+args[1]+" ������.");
            return;
        }
        else if (args[0].equals("renamme")){

        }
    }
}
