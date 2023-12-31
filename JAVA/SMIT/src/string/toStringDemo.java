package string;

class Box {
	double width;
	double height;
	double depth;

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	@Override
	public String toString() {
		return "Dimentions are " + width + " by " + depth + " by " + height + ".";
	}
}

class toStringDemo {
	public static void main(String[] args) {
		Box b = new Box(10, 12, 14);
		String s = "Box b: " + b; // concatenate Box object
		System.out.println(b);
		System.out.println(s);
	}
}
