class Calculator implements java.io.Serializable {
    private double operandOne;
    private double operandTwo;
    private String operation;
    private double result;

    public Calculator(){
    }

    // getters
    public double getOperandOne(){ return operandOne; }
    public double getOperandTwo(){ return operandTwo; }
    public String getOperation(){ return operation; }
    public double getResult(){ return result; }

    // setters
    public void setOperandOne(double opOne){
        this.operandOne = opOne;
    }
    public void setOperandTwo(double opTwo){
        this.operandTwo = opTwo;
    }
    public void setOperation(String o){
        this.operation = o;
    }
    public void setResult(double res){
        this.result = res;
    }

    public void performOperation(){
        if (getOperation() == "+"){
            setResult(getOperandOne() + getOperandTwo());
        }
        else { System.out.println ("Invalid operation."); }
    }




}
