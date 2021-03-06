package itexto.embarcagroovy;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import groovy.lang.Script;

public class Executor {
	
	public Object execute(double x, double y, Operacao operacao) {
		// obtem o codigo fonte
		String code = new ScriptLoader().getScript(operacao);
		// cria o binding de variaveis
		Binding binding = new Binding();
		binding.setVariable("x", x);
		binding.setVariable("y", y);
		GroovyShell shell = new GroovyShell(binding);
		
		return shell.evaluate(code);
	}
	
}
