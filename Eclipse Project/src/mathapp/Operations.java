package mathapp;

public class Operations {
	
	static Main m = new Main();

	public String add(String num1, String num2){
		long x = Long.parseLong(num1);
		long y = Long.parseLong(num2);
		long z = x + y;
		String answer = Long.toString(z);
		return answer;
	}
	
	public String sub(String num1, String num2){
		long x = Long.parseLong(num1);
		long y = Long.parseLong(num2);
		long z = x - y;
		String answer = Long.toString(z);
		return answer;
	}
	
	public String mul(String num1, String num2){
		long x = Long.parseLong(num1);
		long y = Long.parseLong(num2);
		long z = x * y;
		String answer = Long.toString(z);
		return answer;
	}
	
	public String div(String num1, String num2){
		String error = "Cannot divide by zero!";
		long x = Long.parseLong(num1);
		long y = Long.parseLong(num2);
		if(x != 0){
			long z = x / y;
			String answer = Long.toString(z);
			return answer;
		}
		else{
			return error;
		}
	}
	
	public String power(String base, String power){
		double x = Double.parseDouble(base);
		double y = Double.parseDouble(power);
		double z = Math.pow(x, y);
		String answer = Double.toString(z);
		return answer;
	}
	
	public String root(String root){
		double x = Double.parseDouble(root);
		double y = Math.sqrt(x);
		String answer = Double.toString(y);
		return answer;
	}
	
	public String Distance(double x1, double x2, double y1, double y2){
		double left = Math.pow(x2 - x1, 2);
		double right = Math.pow(y2 - y1, 2);
		double preSquare = left - right;
		double answer = Math.sqrt(preSquare);
		String ans = Double.toString(answer);
		return ans;
	}
	
	@SuppressWarnings("unused")
	public String quad1(double a, double b, double c){
		double sqrtPre = Math.pow(b, 2) - (4*a*c);
		double bottom = 2 * a;
		double sqrt = Math.sqrt(sqrtPre);
		double answer1 = (-b + sqrt) / bottom;
		double answer2 = (-b - sqrt) / bottom;
		String ans1 = Double.toString(answer1);
		String ans2 = Double.toString(answer2);
		return ans1;
	}
	
	@SuppressWarnings("unused")
	public String quad2(double a, double b, double c){
		double sqrtPre = Math.pow(b, 2) - (4*a*c);
		double bottom = 2 * a;
		double sqrt = Math.sqrt(sqrtPre);
		double answer1 = (-b + sqrt) / bottom;
		double answer2 = (-b - sqrt) / bottom;
		String ans1 = Double.toString(answer1);
		String ans2 = Double.toString(answer2);
		return ans2;
	}
}
