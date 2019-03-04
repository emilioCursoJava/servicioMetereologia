package service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import model.RegistroDatos;
import model.TemperaturaHora;

interface ServicioClimatologia {



	/*
	 * Método que devuelve las temperaturas máximas agrupadas por provincia
	 */
	public Map<String, Optional<TemperaturaHora>> temperaturaMaximaProvincias();

	/*
	 * Método que devuelve las temperaturas mínimas agrupadas por provincia
	 */

	public Map<String, Optional<TemperaturaHora>> temperaturaMinimaProvincias();

	
	/*
	 * Método que calcula las temperaturas medias agrupadas por provincia
	 */
	public Map<String, Double> temperaturaMediaProvincias();

	/*
	 * Método que filtra los datos para obtener los de una provincia en particular
	 */
	public List<RegistroDatos> datosProvincia(String provincia) ;

	/*
	 * Método que obtiene la temperatura máxima total
	 */
	public Optional<RegistroDatos> maximaTotal();
	/*
	 * Método que obtiene la temperatura mínima total
	 */
	public Optional<RegistroDatos> minimaTotal();

}
