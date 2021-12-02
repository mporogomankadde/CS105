package chapter5;

public class Computer {
	
	 private String manufacturer;
	 private String processor;
	 private int ramSize;
	 private double processorSpeed;
	 Computer(String man,String proc,int ram,double procspd){
		 manufacturer=man;
		 processor=proc;
		 ramSize=ram;
		 processorSpeed=procspd;
	 }
	 public double computerPower() {
		 return (ramSize*processorSpeed);
	 }
	 public int getRamSize() {
		 System.out.print("The initial Ram is ");
		 return ramSize;
	 }
	 public void setRamSize(int ramSize) {
		 this.ramSize=ramSize;
	 
	 }
	 @Override 
	 public String toString() {
		return "The manufacturer is "+ manufacturer+"\n"+"The processor is "+ processor+"\n"+"The ramSize is "+ ramSize+"\n"+"The processorSpeed is "
	 + processorSpeed+"\n"+"The computerPower is "+ computerPower();
	 }
	 public boolean equals(Computer object) {
		 boolean res = (manufacturer.equals(object.manufacturer)&& processor.equals(object.processor) &&
		 ramSize==object.ramSize && processorSpeed==object.processorSpeed);
		 return res;
	 }

	 }

