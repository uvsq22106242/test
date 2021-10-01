package com.company;

public class Fraction {
    float a;
    float b;
  public void Fraction(float a, float b){
      this.a=a;
      this.b=b;
  }
    public void Fraction(){

    }
  public void SetFraction(float a, float b){
      this.a=a;
      if(b!=0) {
          System.out.println("You can't set dénominateur on 0 ");


          this.b = b;
      }
      else{
          this.b = 1;

      }
    }
    public void printFraction(){
      System.out.println("Cette fraction a comme numérateur : %f"+ a+" et comme dénominateur : %f "+ b+ "==>"+a+"/"+b);
    }

}
    git remote add origin https://github.com/uvsq22106242/test.git
        git branch -M
        git push -u origin main