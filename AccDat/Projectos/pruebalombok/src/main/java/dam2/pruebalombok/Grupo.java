package dam2.pruebalombok;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Singular;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class Grupo {
	@NonNull
	@EqualsAndHashCode.Include
	private String nombre;
	private String tutor;
	//@Singular //Para poder meter uno por uno directamente en builder
	
	private List<Alumno> alumnos;
	
	public boolean addAlumno(Alumno alumno) {
		if(alumnos != null)
			setAlumnos(new ArrayList<>(alumnos));
		else
			setAlumnos(new ArrayList<Alumno>(alumnos));
		return alumnos.add(alumno);
	}
}
