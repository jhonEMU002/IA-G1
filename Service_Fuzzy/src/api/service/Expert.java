package api.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import api.fuzzy.Fuzzy_IAr;


@Path("/fuzzy/{pComent}/{raiting}/{vejez}")
public class Expert {
	@GET
	public String Fuzzyfica(@PathParam("pComent") String pComent,@PathParam("raiting") String raiting,
			@PathParam("vejez") String vejez){
		double []parametros  = new double[3];
		double []resultados;
		parametros[0] = Double.valueOf(pComent);
		parametros[1] = Double.valueOf(raiting);
		parametros[2] = Double.valueOf(vejez);
		Fuzzy_IAr fuzificador = new Fuzzy_IAr();
		resultados =fuzificador.crispInference(parametros);
		if (parametros[0] == 0){
			return String.valueOf(resultados[1]);
		}else{
			return String.valueOf(resultados[0]);
		}
		
	}
}
