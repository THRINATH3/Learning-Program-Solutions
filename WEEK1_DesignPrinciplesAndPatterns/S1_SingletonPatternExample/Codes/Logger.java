package WEEK1_DesignPrinciplesAndPatterns.S1_SingletonPatternExample.Codes;

class Logger{
    
    private static Logger inst = new Logger();

    private Logger(){

    }

    public static Logger getInst(){
        return inst;
    }

    public void msg(String m){
        System.out.println(m);
    }
}