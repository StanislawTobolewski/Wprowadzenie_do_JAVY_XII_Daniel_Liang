package chapter_IV;

public class Employee_23 {

    String name;
    int hoursPerWeek;
    int pay;
    double taxSum;
    double incomeTax;
    double incomeTaxValue;
    double pensionTax;
    double pensionTaxValue;
    double netPaycheck;
    double bruttoPaycheck;

    public Employee_23(String name, int hoursPerWeek, int pay, double incomeTax, double pensionTax) {
        this.name = name;
        this.hoursPerWeek = hoursPerWeek;
        this.pay = pay;
        this.incomeTax = incomeTax;
        this.pensionTax = pensionTax;
        this.bruttoPaycheck = hoursPerWeek * pay;
        calculateIncomeTax();
        calculatePensionTax();
        calcPaychack();
    }

    public Employee_23(){

    }

    @Override
    public String  toString(){
        String data = "Name: \t\t\t" + this.getName() + "\n" +
                "Wok time: \t\t" + this.getHoursPerWeek() + "\n" +
                "Pay: \t\t\t" + this.getPay() + "\n" +
                "Paycheck: \t\t" + this.bruttoPaycheck + "\n" +
                "Taxes:___________\n" +
                "Income tax: \t" + this.incomeTaxValue + "\n" +
                "Pension tax: \t" + this.pensionTaxValue + "\n" +
                "Tax sum: \t\t" + this.taxSum + "\n" +
                "Paycheck net: \t" + this.netPaycheck;

        return data;
    }

    public void calculateIncomeTax(){
        this.incomeTaxValue = (this.pay * this.hoursPerWeek) * this.incomeTax;
    }
    public void calculatePensionTax(){
        this.pensionTaxValue = (this.pay * this.hoursPerWeek) * this.pensionTax;
    }
    public void calcPaychack(){
        this.netPaycheck = (this.pay * this.hoursPerWeek) -incomeTaxValue -pensionTaxValue;
        this.taxSum = (incomeTaxValue + pensionTaxValue);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public double getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(double incomeTax) {
        this.incomeTax = incomeTax;
    }

    public double getPensionTax() {
        return pensionTax;
    }

    public void setPensionTax(double pensionTax) {
        this.pensionTax = pensionTax;
    }
}
