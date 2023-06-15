package Cau2;

import Cau1.RollRoyce;

import java.io.*;

public class CRUDRollRoyce {
    public RollRoyce [] arrayRollRoyce;
    public static int numberOfRollRoyce;
    public CRUDRollRoyce(){
       this.arrayRollRoyce = new RollRoyce[100];
       numberOfRollRoyce = 0;
    }
    public boolean addRollRoyce(RollRoyce objRollRoyce){
        this.arrayRollRoyce[numberOfRollRoyce++] = objRollRoyce;
        return true;
    }
    public boolean addRollRoyceToFile(RollRoyce objRollRoyce, String fileName)throws IOException {
        ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream(fileName)){
            @Override
            public void writeStreamHeader(){
            }
        };
        objectOutput.writeObject(objRollRoyce);
        objectOutput.close();
        return true;
    }
    public RollRoyce getRollRoyceFromFile(String fileName) {
       try {
           ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(fileName)){
               @Override
               public void readStreamHeader(){
               }
           };
           RollRoyce rollRoyce = (RollRoyce) objectInput.readObject();
           objectInput.close();
           return rollRoyce;
       }catch (IOException | ClassNotFoundException e){
           e.getMessage();
       }
       return null;
    }
    public boolean addRollRoyceListToFile(RollRoyce[] listRollRoyce, String fileName) throws IOException {
        ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream(fileName)){
            @Override
            public void writeStreamHeader(){
            }
        };
        objectOutput.writeObject(listRollRoyce);
        objectOutput.close();
        return true;
    }
    public RollRoyce[] getAllRollRoyceFromFile(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(fileName)){
            @Override
            public void readStreamHeader(){
            }
        };
        RollRoyce [] rollRoyces = (RollRoyce[]) objectInput.readObject();
        for (RollRoyce list: rollRoyces) {
            if (list == null){
                break;
            }
            System.out.println(list);
        }
        objectInput.close();
        return rollRoyces;
    }
}
