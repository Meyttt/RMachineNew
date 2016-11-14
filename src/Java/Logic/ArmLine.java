package Logic;

import Other.Tape;

import java.util.ArrayList;

/**
 * Created by Admin on 28.10.2016.
 */

/**
 * Класс одного ребра алгоритма.Хранит текущий номер, усдлвие (предикат) и список операций.
 */
public class ArmLine {
    /**
     *
     * @param currentArmNumber номер текущей вершины (для удобства обработки)
     * @param condition экземпляр класса Condition, определяет логику прохождения
     * @param statements список операций, выполняемых, если преликат condition истинный
     */
    public ArmLine(String currentArmNumber, Condition condition, ArrayList<Statement> statements) {
        this.currentArmNumber = currentArmNumber;
        this.condition = condition;
        this.statements = statements;
    }

    /**
     * Вывод на консоль содержимое ребра (метод toString() переопределять нет смысла)
     */
    public void printLine(){
        //System.out.println("current arm: "+currentArmNumber);
        System.out.println("conditon: "+"\n"+condition);
        System.out.println("statements: ");
        for(int i=0;i<statements.size();i++){
            System.out.println(statements.get(i));
        }
    }
    public boolean compare(Tape tape){
        return condition.checkABoolean(tape);
    }
    String currentArmNumber;
    Condition condition;
    ArrayList<Statement> statements;

}
