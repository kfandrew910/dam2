package dam2.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Alumno> alumnos = cargarDatos();
    	List<String> nombres;
    	List<Float> notas;
    	Stream<Alumno> stream;
    	long cuantos;
    	float media;
    	
    	stream = alumnos.stream();
    	/*
    	stream.filter(a -> a.getNota() >= 5).
    		map(a -> a.getNia() + " -> " + a.getNota() + ((a.getNota() >= 5)?" Aprobado":" Suspenso"))
    		.forEach((a) -> System.out.println(a));
    	*/
    	
    	nombres = stream.filter(a -> a.getNota() >= 5)
    			.map(a -> a.getNombre())
    			.distinct()
    			.toList();//Pasa a Stream<String>
    	//Recuerda remapear el stream cada vez que lo mapees
    	stream = alumnos.stream();
    	
    	cuantos = stream.filter(a -> a.getNota()>=5)
    			.count(); //Reduccion
    	
    	stream = alumnos.stream();
    	
    	notas = stream.map(a -> a.getNota()).toList();
    	
    	media = (float) alumnos.stream()			//Creación
    			.filter(a -> a.getNota() >= 5)		//Transformación
    			//.peek(a -> System.out.println(a))	//Para depurar, SOLO DESARROLLO
    			.mapToDouble(a -> a.getNota())		//Transformación
    			.average()							//Consumición
    			.orElse(0f);						//Consumición
    	
    	System.out.println(media);
    	
    	alumnos.stream()
    			.sorted((a, b) -> Float.compare(a.getNota(), b.getNota()))
    			.findFirst()
    			.map(a -> a.getNombre())
    			.ifPresentOrElse(a -> System.out.println(a), () -> System.out.println("no hay alumnos"));
    }
    
    public static List<Alumno> cargarDatos(){
    	List<Alumno> alumnos = new ArrayList<Alumno>();
    	int amount = 1000;
    	Alumno a;
        String n;
        char c;
        
    	for(int i=0; i<amount; i++) {
    		c = (char) (i % 255);
    		n = "" + c; 
    		a = Alumno.builder().nia("00" + i).nota(Math.round(Math.random()*10)).nombre(n).build();
        	alumnos.add(a);
    	}
        return alumnos;
    }
}
