package service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import model.RegistroDatos;
import model.TemperaturaHora;

interface ServicioClimatologia {



	/*
	 * M�todo que devuelve las temperaturas m�ximas agrupadas por provincia
	 */
	public Map<String, Optional<TemperaturaHora>> temperaturaMaximaProvincias();

	/*
	 * M�todo que devuelve las temperaturas m�nimas agrupadas por provincia
	 */

	public Map<String, Optional<TemperaturaHora>> temperaturaMinimaProvincias();

	
	/*
	 * M�todo que calcula las temperaturas medias agrupadas por provincia
	 */
	public Map<String, Double> temperaturaMediaProvincias();

	/*
	 * M�todo que filtra los datos para obtener los de una provincia en particular
	 */
	public List<RegistroDatos> datosProvincia(String provincia) ;

	/*
	 * M�todo que obtiene la temperatura m�xima total
	 */
	public Optional<RegistroDatos> maximaTotal();
	/*
	 * M�todo que obtiene la temperatura m�nima total
	 */
	public Optional<RegistroDatos> minimaTotal();

}
