package me.dwtj.ex.eclipse.dbproc;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

@SupportedAnnotationTypes("*")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class DebuggableProc extends AbstractProcessor {

	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		note("\"Hello\", from `DebuggableEclipseProc`.");
		return false;
	}

	private void note(Object obj) {
		processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, obj.toString());
	}
}
