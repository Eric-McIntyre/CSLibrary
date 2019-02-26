package cs.csmath.complexnumber;

public class ComplexNumber {
    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    private double realPart;

    public double getImagPart() {
        return imagPart;
    }

    public void setImagPart(double imagPart) {
        this.imagPart = imagPart;
    }

    private double imagPart;


    //****************Constructors ********************************

    public ComplexNumber(double real, double imag) {
        this.setRealPart(real);
        this.setImagPart(imag);

    }
    /*public ComplexNumber(ComplexNumber cn) {
        this.setRealPart(cn) = getRealPart();
        this.setImagPart(cn) = getImagPart();
    }*/

    //************* Arithmetic Operators ********************
    public void add(ComplexNumber otherCN)  {
        double newRealPart = this.getRealPart() + otherCN.getRealPart();
        double newImagPart = this.getImagPart() + otherCN.getImagPart();
        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);
    }
    public void sub(ComplexNumber otherCN) {
        double newRealPart = this.getRealPart() - otherCN.getRealPart();
        double newImagPart = this.getImagPart() - otherCN.getImagPart();
        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);
    }

    public void mult(ComplexNumber otherCN) {
        double newRealPart = (this.getRealPart() * otherCN.getRealPart()) - (this.getImagPart() * otherCN.getImagPart());
        double newImagPart = (this.getImagPart() * otherCN.getRealPart()) + (this.getRealPart() * otherCN.getImagPart());
        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);
    }

    public void div (ComplexNumber otherCN) {
        double newRealPart = (this.getRealPart()*otherCN.getRealPart()+this.getImagPart() * otherCN.getImagPart()) /
                (otherCN.getRealPart()*otherCN.getRealPart()+ otherCN.getImagPart()* otherCN.getImagPart());
        double newImagPart = (this.getImagPart()* otherCN.getRealPart() - this.getRealPart()* otherCN.getImagPart()) /
                (otherCN.getRealPart()*otherCN.getRealPart()+ otherCN.getImagPart()* otherCN.getImagPart());
        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);
    }

     public ComplexNumber conj () {

         return null;

     }
      public double abs() {
        return 0.0;

      }

      public static void main(String[] args){
        ComplexNumber cn1 = new ComplexNumber(1.0, 1.0);
        //System.out.println("cn1 real:" + cn1.getRealPart() + "imag" + cn1.getImagPart());
        ComplexNumber cn2 = new ComplexNumber(1.0,1.0);
        cn1.mult(cn2);
        //System.out.println("CN1 real: " + cn1.getRealPart() + "imag" + cn1.getImagPart());
      }


 






}
