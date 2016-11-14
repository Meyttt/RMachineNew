package Other;

import Logic.Arm;
import Logic.ArmLine;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Set;

/**
 * Created by Anton on 16.10.2016.
 * здесь будет непосредственный обработчик
 * или не здесь
 * ОБНОВЛЕНИЕ: по замыслу здесь
 */
public class R_machine {
    AllStorage allStorage;
    Storage storage;
    Tape tape;

    public R_machine(AllStorage allStorage) {
        this.allStorage=allStorage;
        this.storage=allStorage.getStorage();
        this.tape=allStorage.getTape();
    }
    public Arm start(){
        Set<String> armnumbers = storage.arms.keySet();
        Arm firstArm = null;
        if(armnumbers.contains("0")){
            firstArm=storage.arms.get("0");
        }else{
            System.err.println("Нет узла с нулевым номером!");
        }
        return firstArm;
    }

    public void checkArm(Arm curretArm) {
        ArrayList<ArmLine> lines = curretArm.getLines();
        for(ArmLine line:lines){
            if(line.compare(tape)){

            }
        }
    }

    public static void main(String args[]) throws FileNotFoundException {


    }
}
