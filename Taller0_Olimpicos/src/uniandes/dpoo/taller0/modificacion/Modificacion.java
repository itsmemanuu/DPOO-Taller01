package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion 
{
	public static void main(String[] args)
	{
		String archivo = "C:\\Users\\manue\\Documents\\Uniandes\\2022-2\\DPOO\\Taller1_Olimpicos_esqueleto\\Taller0_Olimpicos\\data\\atletas.csv";
		
		try
		{
			CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo(archivo);
			Map<String, Integer> info = calc.paisConMasMedallistas();
			for (String nombre : info.keySet())
			{
				System.out.println(nombre + " ha tenido " + info.get(nombre) + " medallistas");
			}
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("ERROR: el archivo indicado no se encontró.");
		}
		catch (IOException e)
		{
			System.out.println("ERROR: hubo un problema leyendo el archivo.");
			System.out.println(e.getMessage());
		}
		
	}
}
