import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class CMain {

	static ArrayList<Object> checkIf = new ArrayList<Object>();
	static String Cderivada = new String();
	static String resp, resp1;
	static ScriptEngineManager mgr = new ScriptEngineManager();
	static ScriptEngine engine = mgr.getEngineByName("JavaScript");
	static Pattern pattern = Pattern.compile("[x]");

	private void solveit() throws Exception {
		BrentSolver solver = new BrentSolver();
		UnivariateFunction f = new UnivariateFunction() {
			@Override
			public double value(double x) {
				// return 103*Math.pow(x, 5.0)-5*Math.pow(x, 4.0)-5*Math.pow(x,
				// 3.0)-5*Math.pow(x, 2.0)-5*x-105;
				return 1 * Math.pow(x, 2.0) - 5 * Math.pow(x, 1) + 6;
			}
		};

		String str = "1*Math.pow(x, 2.0)-5*Math.pow(x, 1)+6";
		str = str.replaceAll("Math.pow(([^<]*))", "$1");
		str = str.replaceAll("Math.pow(([^<]*))", "$1");
		str = str.replaceAll("Math.pow(([^<]*))", "$1");
		str = str.replaceAll("Math.pow(([^<]*))", "$1");
		str = str.replaceAll("Math.pow(([^<]*))", "$1");
		str = str.replaceAll("Math.pow(([^<]*))", "$1");
		str = str.replace("(", "").replace(")", "").replace(",", "^").replace(" ", "");

		System.out.println("str: " + str);
		double intervalStart = -10;
		double intervalSize = 0.2;
		Cderivada = str;

		derivador();
		resp1 = resp;
		while (intervalStart <= 10) {
			
			Matcher matcher = pattern.matcher(resp);
			StringBuilder builder = new StringBuilder();
			int i = 0;
			while (matcher.find()) {
				
				String replacement = Double.toString(intervalStart);
				builder.append(resp.substring(i, matcher.start()));

				builder.append(replacement);
				i = matcher.end();
			}
			builder.append(resp.substring(i, resp.length()));
			System.out.println(builder.toString());
			String f1 = engine.eval(builder.toString()).toString();
			int fOne = Integer.parseInt(f1);
			
			Matcher matcher1 = pattern.matcher(resp1);
			StringBuilder builder1 = new StringBuilder();
			i = 0;
			while (matcher.find()) {
				
				String replacement = Double.toString(intervalStart+intervalSize);
				builder.append(resp1.substring(i, matcher.start()));

				builder.append(replacement);
				i = matcher.end();
			}
			builder.append(resp1.substring(i, resp.length()));
			System.out.println(builder1.toString());
			String f2 = engine.eval(builder1.toString()).toString();
			int fTwo = Integer.parseInt(f1);
			

			if (Math.signum(f.value(intervalStart)) * Math.signum(f.value(intervalStart + intervalSize)) == 0) {
				double firstResult = solver.solve(100, f, intervalStart, intervalStart + intervalSize);
				System.out.println("x = " + firstResult);
				checkIf.add(firstResult);
			}
			if (Math.signum(f.value(intervalStart)) * Math.signum(f.value(intervalStart + intervalSize)) < 0) {
				double secondResult = solver.solve(100, f, intervalStart, intervalStart + intervalSize);
				System.out.println("x = " + secondResult);
				checkIf.add(secondResult);
			}
			if (Math.signum(f.value(intervalStart)) * Math.signum(f.value(intervalStart + intervalSize)) != 0 && fOne * fTwo == 0) {
				

			}
			intervalStart += intervalSize;
		}
	}

	static void derivador() throws ScriptException {
		DJep j = new DJep();
		// DJep es la clase encargada de la derivacion en su escencia
		j.addStandardConstants();
		// agrega constantes estandares, pi, e, etc
		j.addStandardFunctions();
		// agrega funciones estandares cos(x), sin(x)
		j.addComplex();
		// por si existe algun numero complejo
		j.setAllowUndeclared(true);
		// permite variables no declarables
		j.setAllowAssignment(true);
		// permite asignaciones
		j.setImplicitMul(true);
		// regla de multiplicacion o para sustraccion y sumas
		j.addStandardDiffRules();
		try {
			// coloca el nodo con una funcion preestablecida
			Node node = j.parse(Cderivada);
			// deriva la funcion con respecto a x
			Node diff = j.differentiate(node, "x");
			// Simplificamos la funcion con respecto a x
			Node simp = j.simplify(diff);
			// Convertimos el valor simplificado en un String
			resp = j.toString(simp);
			System.out.println(resp);
			// resp = resp.replace("x", "-10");
			// System.out.println(engine.eval(resp));
			

		} catch (ParseException e) {
			// JOptionPane.showMessageDialog(null, "ERROR DE SINTAXIS", "ERROR", 2, new
			// ImageIcon("imagenes/logo.png"));
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			new CMain().solveit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
