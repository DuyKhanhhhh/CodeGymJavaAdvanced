package Cau2;

import Cau1.RollRoyce;

import java.io.IOException;

public class AppRollRoyce {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = ("C:\\Users\\TítDzvl\\IdeaProjects\\KiemTraDocGhiFile\\src\\Cau2\\CarList.txt");
        RollRoyce rollRoyce = new RollRoyce("RollRoyce", "Đen", "40023", 2004, 20450, 3040, 502000);
        RollRoyce rollRoyce1 = new RollRoyce("RollRoyce", "Hồng", "4002", 1223, 20110, 3200, 500000);
        RollRoyce rollRoyce2 = new RollRoyce("RollRoyce", "Đỏ", "40041", 10450, 22020, 3003, 600000);
        CRUDRollRoyce crudRollRoyce = new CRUDRollRoyce();
        RollRoyce rollRoyce3 = null;
        System.out.println("--------Đối Tượng----------");
        //Add array
        crudRollRoyce.addRollRoyce(rollRoyce);
        crudRollRoyce.addRollRoyce(rollRoyce1);
        crudRollRoyce.addRollRoyce(rollRoyce2);
        //Add toFile
        crudRollRoyce.addRollRoyceToFile(rollRoyce,fileName);
        crudRollRoyce.addRollRoyceToFile(rollRoyce1,fileName);
        crudRollRoyce.addRollRoyceToFile(rollRoyce2,fileName);
//        Return
        rollRoyce3 = crudRollRoyce.getRollRoyceFromFile(fileName);
        System.out.println(rollRoyce3);
        System.out.println("---------Mảng-----------");
        crudRollRoyce.addRollRoyceListToFile(crudRollRoyce.arrayRollRoyce, fileName);
        crudRollRoyce.getAllRollRoyceFromFile(fileName);

    }
}
