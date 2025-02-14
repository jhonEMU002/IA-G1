package api.fuzzy;
//++++++++++++++++++++++++++++++++++++++++++++++++++++++//
//                                                      //
// Class:  OperatorSet                                  //
//                                                      //
// Author: Automatically generated by Xfuzzy            //
//                                                      //
// Description: Abstract class of an operator set       //
//                                                      //
//++++++++++++++++++++++++++++++++++++++++++++++++++++++//



public abstract class OperatorSet {
 public abstract double and(double a, double b);
 public abstract double or(double a, double b);
 public abstract double also(double a, double b);
 public abstract double imp(double a, double b);
 public abstract double not(double a);
 public abstract double very(double a);
 public abstract double moreorless(double a);
 public abstract double slightly(double a);
 public abstract double defuz(OutputMembershipFunction mf);
}
