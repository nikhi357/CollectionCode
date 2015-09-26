package com.mypackage;

class Gene<G> {
	G obj;

	public Gene(G obj) {
		this.obj = obj;
	}

	G getObj() {
		return obj;
	}
}

public class GenericDemo {
	public static void main(String[] args) {
		// To display Integer object
		Double x = 26.555;
		Gene<Integer> g = new Gene<Integer>(26);
		System.out.println(g.getObj());
		Gene<Float> f = new Gene<Float>(14.8f);
		System.out.println(f.getObj());
		Gene<Double> d = new Gene<Double>(x);
		System.out.println(d.getObj());
		Gene<String> st = new Gene<String>("Raja");
		System.out.println(st.getObj());

	}

}
