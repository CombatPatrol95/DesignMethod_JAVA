package builder_method;

public class Director {

	private Builder builder;
	public Director(Builder builder) {
		this.builder = builder;
	}
	public void construct() {
		builder.makeTitle("blyat");
		builder.makeString("AM to PM");
		builder.makeItems(new String[] {
				"cyka",
				"nahuy",
		});
	builder.makeString("nacht");
	builder.makeItems(new String[]{
			"morgen"
	});
	builder.close();
	}
}
