package api.fuzzy;
//++++++++++++++++++++++++++++++++++++++++++++++++++++++//
//                                                      //
// Class:  Fuzzy_IAr                           //
//                                                      //
// Author: Automatically generated by Xfuzzy            //
//                                                      //
// Description: Fuzzy inference engine "Fuzzy_IAr"       //
//                                                      //
//++++++++++++++++++++++++++++++++++++++++++++++++++++++//



public class Fuzzy_IAr implements FuzzyInferenceEngine {

 //+++++++++++++++++++++++++++++++++++++++++++++++++++++//
 //  Rulebase RL_Rules  //
 //+++++++++++++++++++++++++++++++++++++++++++++++++++++//

 private MembershipFunction[] RL_Rules(MembershipFunction P_comentario, MembershipFunction Calificacion, MembershipFunction Vejez) {
  double _rl;
  double _input[] = new double[3];
  if(P_comentario instanceof FuzzySingleton)
   _input[0] = ((FuzzySingleton) P_comentario).getValue();
  if(Calificacion instanceof FuzzySingleton)
   _input[1] = ((FuzzySingleton) Calificacion).getValue();
  if(Vejez instanceof FuzzySingleton)
   _input[2] = ((FuzzySingleton) Vejez).getValue();
  OP_Fuzzy_IAr_op _op = new OP_Fuzzy_IAr_op();
  OutputMembershipFunction Recomendada = new OutputMembershipFunction();
  Recomendada.set(27,_op,_input);
  TP_Fuzzy_IAr_P_Comentario _t_P_comentario = new TP_Fuzzy_IAr_P_Comentario();
  TP_Fuzzy_IAr_Calificacion _t_Calificacion = new TP_Fuzzy_IAr_Calificacion();
  TP_Fuzzy_IAr_Vejez _t_Vejez = new TP_Fuzzy_IAr_Vejez();
  TP_Fuzzy_IAr_Recomendada _t_Recomendada = new TP_Fuzzy_IAr_Recomendada();
  int _i_Recomendada=0;
  _rl = _op.and(_op.and(_t_P_comentario.Bajo.isEqual(P_comentario),_t_Calificacion.Mala.isEqual(Calificacion)),_t_Vejez.Muy_Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Poco_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Bajo.isEqual(P_comentario),_t_Calificacion.Mala.isEqual(Calificacion)),_t_Vejez.Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Poco_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Bajo.isEqual(P_comentario),_t_Calificacion.Mala.isEqual(Calificacion)),_t_Vejez.Actual.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Medianamente_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Bajo.isEqual(P_comentario),_t_Calificacion.Regular.isEqual(Calificacion)),_t_Vejez.Muy_Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Poco_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Bajo.isEqual(P_comentario),_t_Calificacion.Regular.isEqual(Calificacion)),_t_Vejez.Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Poco_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Bajo.isEqual(P_comentario),_t_Calificacion.Regular.isEqual(Calificacion)),_t_Vejez.Actual.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Medianamente_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Bajo.isEqual(P_comentario),_t_Calificacion.Buena.isEqual(Calificacion)),_t_Vejez.Muy_Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Medianamente_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Bajo.isEqual(P_comentario),_t_Calificacion.Buena.isEqual(Calificacion)),_t_Vejez.Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Medianamente_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Bajo.isEqual(P_comentario),_t_Calificacion.Buena.isEqual(Calificacion)),_t_Vejez.Actual.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Medianamente_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Medio.isEqual(P_comentario),_t_Calificacion.Mala.isEqual(Calificacion)),_t_Vejez.Muy_Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Poco_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Medio.isEqual(P_comentario),_t_Calificacion.Mala.isEqual(Calificacion)),_t_Vejez.Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Poco_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Medio.isEqual(P_comentario),_t_Calificacion.Mala.isEqual(Calificacion)),_t_Vejez.Actual.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Medianamente_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Medio.isEqual(P_comentario),_t_Calificacion.Regular.isEqual(Calificacion)),_t_Vejez.Muy_Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Medianamente_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Medio.isEqual(P_comentario),_t_Calificacion.Regular.isEqual(Calificacion)),_t_Vejez.Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Medianamente_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Medio.isEqual(P_comentario),_t_Calificacion.Regular.isEqual(Calificacion)),_t_Vejez.Actual.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Medianamente_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Medio.isEqual(P_comentario),_t_Calificacion.Buena.isEqual(Calificacion)),_t_Vejez.Muy_Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Medianamente_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Medio.isEqual(P_comentario),_t_Calificacion.Buena.isEqual(Calificacion)),_t_Vejez.Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Medianamente_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Medio.isEqual(P_comentario),_t_Calificacion.Buena.isEqual(Calificacion)),_t_Vejez.Actual.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Medianamente_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Alto.isEqual(P_comentario),_t_Calificacion.Mala.isEqual(Calificacion)),_t_Vejez.Muy_Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Medianamente_recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Alto.isEqual(P_comentario),_t_Calificacion.Mala.isEqual(Calificacion)),_t_Vejez.Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Muy_Recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Alto.isEqual(P_comentario),_t_Calificacion.Mala.isEqual(Calificacion)),_t_Vejez.Actual.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Muy_Recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Alto.isEqual(P_comentario),_t_Calificacion.Regular.isEqual(Calificacion)),_t_Vejez.Muy_Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Muy_Recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Alto.isEqual(P_comentario),_t_Calificacion.Regular.isEqual(Calificacion)),_t_Vejez.Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Muy_Recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Alto.isEqual(P_comentario),_t_Calificacion.Regular.isEqual(Calificacion)),_t_Vejez.Actual.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Muy_Recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Alto.isEqual(P_comentario),_t_Calificacion.Buena.isEqual(Calificacion)),_t_Vejez.Muy_Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Muy_Recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Alto.isEqual(P_comentario),_t_Calificacion.Buena.isEqual(Calificacion)),_t_Vejez.Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Muy_Recomendada); _i_Recomendada++;
  _rl = _op.and(_op.and(_t_P_comentario.Alto.isEqual(P_comentario),_t_Calificacion.Buena.isEqual(Calificacion)),_t_Vejez.Actual.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Muy_Recomendada); _i_Recomendada++;
  MembershipFunction[] _output = new MembershipFunction[1];
  _output[0] = new FuzzySingleton(Recomendada.defuzzify());
  return _output;
 }

 //+++++++++++++++++++++++++++++++++++++++++++++++++++++//
 //  Rulebase RL_Rules2  //
 //+++++++++++++++++++++++++++++++++++++++++++++++++++++//

 private MembershipFunction[] RL_Rules2(MembershipFunction Calificacion, MembershipFunction Vejez) {
  double _rl;
  double _input[] = new double[2];
  if(Calificacion instanceof FuzzySingleton)
   _input[0] = ((FuzzySingleton) Calificacion).getValue();
  if(Vejez instanceof FuzzySingleton)
   _input[1] = ((FuzzySingleton) Vejez).getValue();
  OP_Fuzzy_IAr_op _op = new OP_Fuzzy_IAr_op();
  OutputMembershipFunction Recomendada = new OutputMembershipFunction();
  Recomendada.set(9,_op,_input);
  TP_Fuzzy_IAr_Calificacion _t_Calificacion = new TP_Fuzzy_IAr_Calificacion();
  TP_Fuzzy_IAr_Vejez _t_Vejez = new TP_Fuzzy_IAr_Vejez();
  TP_Fuzzy_IAr_Recomendada _t_Recomendada = new TP_Fuzzy_IAr_Recomendada();
  int _i_Recomendada=0;
  _rl = _op.and(_t_Calificacion.Mala.isEqual(Calificacion),_t_Vejez.Muy_Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Poco_recomendada); _i_Recomendada++;
  _rl = _op.and(_t_Calificacion.Mala.isEqual(Calificacion),_t_Vejez.Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Poco_recomendada); _i_Recomendada++;
  _rl = _op.and(_t_Calificacion.Mala.isEqual(Calificacion),_t_Vejez.Actual.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Medianamente_recomendada); _i_Recomendada++;
  _rl = _op.and(_t_Calificacion.Regular.isEqual(Calificacion),_t_Vejez.Muy_Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Poco_recomendada); _i_Recomendada++;
  _rl = _op.and(_t_Calificacion.Regular.isEqual(Calificacion),_t_Vejez.Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Medianamente_recomendada); _i_Recomendada++;
  _rl = _op.and(_t_Calificacion.Regular.isEqual(Calificacion),_t_Vejez.Actual.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Medianamente_recomendada); _i_Recomendada++;
  _rl = _op.and(_t_Calificacion.Buena.isEqual(Calificacion),_t_Vejez.Muy_Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Medianamente_recomendada); _i_Recomendada++;
  _rl = _op.and(_t_Calificacion.Buena.isEqual(Calificacion),_t_Vejez.Vieja.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Muy_Recomendada); _i_Recomendada++;
  _rl = _op.and(_t_Calificacion.Buena.isEqual(Calificacion),_t_Vejez.Actual.isEqual(Vejez));
  Recomendada.set(_i_Recomendada,_rl, _t_Recomendada.Muy_Recomendada); _i_Recomendada++;
  MembershipFunction[] _output = new MembershipFunction[1];
  _output[0] = new FuzzySingleton(Recomendada.defuzzify());
  return _output;
 }

 //+++++++++++++++++++++++++++++++++++++++++++++++++++++//
 //               Fuzzy Inference Engine                //
 //+++++++++++++++++++++++++++++++++++++++++++++++++++++//

 public double[] crispInference(double[] _input) {
  MembershipFunction P_Comentario = new FuzzySingleton(_input[0]);
  MembershipFunction Calificacion = new FuzzySingleton(_input[1]);
  MembershipFunction Vejez = new FuzzySingleton(_input[2]);
  MembershipFunction Recomendada;
  MembershipFunction Recomendada_sin_comentario;
  MembershipFunction[] _call;
  _call = RL_Rules(P_Comentario,Calificacion,Vejez); Recomendada=_call[0];
  _call = RL_Rules2(Calificacion,Vejez); Recomendada_sin_comentario=_call[0];
  double _output[] = new double[2];
  if(Recomendada instanceof FuzzySingleton)
   _output[0] = ((FuzzySingleton) Recomendada).getValue();
  else _output[0] = ((OutputMembershipFunction) Recomendada).defuzzify();
  if(Recomendada_sin_comentario instanceof FuzzySingleton)
   _output[1] = ((FuzzySingleton) Recomendada_sin_comentario).getValue();
  else _output[1] = ((OutputMembershipFunction) Recomendada_sin_comentario).defuzzify();
  return _output;
 }

 public double[] crispInference(MembershipFunction[] _input) {
  MembershipFunction P_Comentario = _input[0];
  MembershipFunction Calificacion = _input[1];
  MembershipFunction Vejez = _input[2];
  MembershipFunction Recomendada;
  MembershipFunction Recomendada_sin_comentario;
  MembershipFunction[] _call;
  _call = RL_Rules(P_Comentario,Calificacion,Vejez); Recomendada=_call[0];
  _call = RL_Rules2(Calificacion,Vejez); Recomendada_sin_comentario=_call[0];
  double _output[] = new double[2];
  if(Recomendada instanceof FuzzySingleton)
   _output[0] = ((FuzzySingleton) Recomendada).getValue();
  else _output[0] = ((OutputMembershipFunction) Recomendada).defuzzify();
  if(Recomendada_sin_comentario instanceof FuzzySingleton)
   _output[1] = ((FuzzySingleton) Recomendada_sin_comentario).getValue();
  else _output[1] = ((OutputMembershipFunction) Recomendada_sin_comentario).defuzzify();
  return _output;
 }

 public MembershipFunction[] fuzzyInference(double[] _input) {
  MembershipFunction P_Comentario = new FuzzySingleton(_input[0]);
  MembershipFunction Calificacion = new FuzzySingleton(_input[1]);
  MembershipFunction Vejez = new FuzzySingleton(_input[2]);
  MembershipFunction Recomendada;
  MembershipFunction Recomendada_sin_comentario;
  MembershipFunction[] _call;
  _call = RL_Rules(P_Comentario,Calificacion,Vejez); Recomendada=_call[0];
  _call = RL_Rules2(Calificacion,Vejez); Recomendada_sin_comentario=_call[0];
  MembershipFunction _output[] = new MembershipFunction[2];
  _output[0] = Recomendada;
  _output[1] = Recomendada_sin_comentario;
  return _output;
 }

 public MembershipFunction[] fuzzyInference(MembershipFunction[] _input) {
  MembershipFunction P_Comentario = _input[0];
  MembershipFunction Calificacion = _input[1];
  MembershipFunction Vejez = _input[2];
  MembershipFunction Recomendada;
  MembershipFunction Recomendada_sin_comentario;
  MembershipFunction[] _call;
  _call = RL_Rules(P_Comentario,Calificacion,Vejez); Recomendada=_call[0];
  _call = RL_Rules2(Calificacion,Vejez); Recomendada_sin_comentario=_call[0];
  MembershipFunction _output[] = new MembershipFunction[2];
  _output[0] = Recomendada;
  _output[1] = Recomendada_sin_comentario;
  return _output;
 }

}

