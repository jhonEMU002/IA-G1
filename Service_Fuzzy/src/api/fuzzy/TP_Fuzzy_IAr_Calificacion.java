package api.fuzzy;
//++++++++++++++++++++++++++++++++++++++++++++++++++++++//
//                                                      //
// Class:  TP_Fuzzy_IAr_Calificacion                           //
//                                                      //
// Author: Automatically generated by Xfuzzy            //
//                                                      //
// Description: Type "Calificacion"                      //
//                                                      //
//++++++++++++++++++++++++++++++++++++++++++++++++++++++//



public class TP_Fuzzy_IAr_Calificacion {
 private double min = 1.0;
 private double max = 5.0;
 private double step = 0.01568627450980392;
 double _ps_Mala[] = { 0.0,1.0,2.0,3.0 };
 double _pl_Mala[] = {  };
 double _ps_Regular[] = { 2.0,3.0,4.0 };
 double _pl_Regular[] = {  };
 double _ps_Buena[] = { 3.0,4.0,5.0,6.0 };
 double _pl_Buena[] = {  };
 MF_xfl_trapezoid Mala = new MF_xfl_trapezoid(min,max,step,_ps_Mala,_pl_Mala);
 MF_xfl_triangle Regular = new MF_xfl_triangle(min,max,step,_ps_Regular,_pl_Regular);
 MF_xfl_trapezoid Buena = new MF_xfl_trapezoid(min,max,step,_ps_Buena,_pl_Buena);
}


