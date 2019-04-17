package project;
import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import project.model.Model;

public class CMain {

	private static int exp1, exp2, exp3, exp4, exp5, exp6;

	public static void setExp1(int exp1) { CMain.exp1 = exp1; }

	public static void setExp2(int exp2) { CMain.exp2 = exp2; }

	public static void setExp3(int exp3) { CMain.exp3 = exp3; }

	public static void setExp4(int exp4) { CMain.exp4 = exp4; }

	public static void setExp5(int exp5) { CMain.exp5 = exp5; }

	public static void setExp6(int exp6) { CMain.exp6 = exp6; }

	public static void setBase1(int base1) { CMain.base1 = base1; }

	public static void setBase2(int base2) { CMain.base2 = base2; }

	public static void setBase3(int base3) { CMain.base3 = base3; }

	public static void setBase4(int base4) { CMain.base4 = base4; }

	public static void setBase5(int base5) { CMain.base5 = base5; }

	public static void setBase6(int base6) { CMain.base6 = base6; }

	public static void setQuant(int quant) { CMain.quant = quant; }

	private static int quant, base1, base2, base3, base4, base5, base6;
	private static String sinal1, sinal2,sinal3, sinal4, sinal5;

	public static void setSinal1(String sinal1) { CMain.sinal1 = sinal1; }

	public static void setSinal2(String sinal2) { CMain.sinal2 = sinal2; }

	public static void setSinal3(String sinal3) { CMain.sinal3 = sinal3; }

	public static void setSinal4(String sinal4) { CMain.sinal4 = sinal4; }

	public static void setSinal5(String sinal5) { CMain.sinal5 = sinal5; }

	public static void solveit(int quant) {
		BrentSolver solver = new BrentSolver();
		UnivariateFunction f = new UnivariateFunction() {
			@Override
			public double value(double x) {
				switch (quant){
					case 1:
						return base1*Math.pow(x, exp1);

					case 2:
						double x1 = base1*Math.pow(x, exp1);
						double x2 = base2*Math.pow(x, exp2);
						return Model.calculate(x1,x2,sinal1);

						case 3:
						x1 = base1*Math.pow(x, exp1);
						x2 = base2*Math.pow(x, exp2);
						double x3 = base3*Math.pow(x, exp3);
						if (pref(sinal2,sinal1) == true){
							x2 = Model.calculate(x2,x3,sinal2);
							return Model.calculate(x1,x2,sinal1);
						}
						else {
							x2 = Model.calculate(x2, x1, sinal1);
							return Model.calculate(x2,x3,sinal2);
						}

					case 4:
						x1 = base1*Math.pow(x, exp1);
						x2 = base2*Math.pow(x, exp2);
						x3 = base3*Math.pow(x, exp3);
						double x4 = base4*Math.pow(x, exp4);


						case 5:
						x1 = base1 * Math.pow(x, exp1);
						x2 = base2 * Math.pow(x, exp2);
						x3 = base3*Math.pow(x, exp3);
						x4 = base4*Math.pow(x, exp4);
						double x5 = base5*Math.pow(x, exp5);

				}

			return 0;}
		};
		
		double intervalStart = -10;
		double intervalSize = 0.2;
		while(intervalStart <= 10) {
			intervalStart+= intervalSize;
			if(Math.signum(f.value(intervalStart)) != Math.signum(f.value(intervalStart+intervalSize))) {
				System.out.println("x = " + solver.solve(100, f, intervalStart, intervalStart+intervalSize));
			}
		}
	}

	private static boolean pref(String s1, String s2){
		if (s1.equals("*") || s1.equals("/"))
			return true;
		else
			return false;
	}
	
	public static void main (String[] args) {
		new CMain().solveit(5);
	}
}
