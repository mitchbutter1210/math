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
		long x = Long.parseLong(num1);
		long y = Long.parseLong(num2);
		if(x != 0){
			long z = x / y;
			String answer = Long.toString(z);
			return answer;
		}
		else{
			String error = "Cannot divide by zero!";
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
}
