package MODUL6;
/**
 *
 * @author Titus Guritno
 */
public class KonstantaInfix {
    char operator[] = {'+','-','*','/','^'};
    char operand[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                      'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private char data;
    
    public KonstantaInfix(){
        data = ' ';
    }
    
    public void setData(char data_in){
        data = data_in;
    }
    
    public boolean isOperator(){
        for(int i = 0; i < operator.length; i++){
            if(data == operator[i]){
                return true;
            }
        }
        return false;
    }
    
    public boolean isOperand(){
        for(int i = 0; i < operand.length; i++){
            if(data == operand[i]){
                return true;
            }
        }
        return false;
    }
}
