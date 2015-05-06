package com.company;


import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args[0].equals("create")){
            String fileName = args[1];
            File file = new File("D:/MyProjects/FileManager/"+fileName);
            file.createNewFile();
            System.out.println("Файл "+args[1]+" создан.");
        }


        else if (args[0].equals("delete")){
            File dir = new File(args[1]);
            if (dir.isDirectory()){
                System.out.println(args[1]+" является каталогом.");
                File[] flist = dir.listFiles();
                System.out.println("В каталоге " + args[1]+" - "+flist.length+ " файл(ов).");
                if (flist.length == 0){
                    System.out.println("Каталог "+args[1]+" пуст.");
                    dir.delete();
                    System.out.println("Каталог "+args[1]+" удален.");
                    return;
                }
                else{
                    for (int i=0; i<flist.length; i++){
                        flist[i].delete();
                    }
                    System.out.println("Удалено "+flist.length+" файл(ов) из каталога "+args[1]+".");
                }
                dir.delete();
                System.out.println("каталог "+args[1]+" удалена.");
                return;
            }
            dir.delete();
            System.out.println("Файл "+args[1]+" удален.");
            return;
        }


        else if (args[0].equals("rename")){
            File dir = new File(args[1]);
            File name = new File(args[2]);
            if (dir.renameTo(name)){
                System.out.println("Файл переименован.");
                return;
            }
            else {
                System.out.println("Файл не переименован");
                return;
            }
        }

        else {
            System.out.println("Команда введена не правильно, повторите ввод");
            return;

        }
    }
}
