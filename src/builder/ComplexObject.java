package builder;

public class ComplexObject {
	private String name;
	private String codeName;
	private boolean isBig;
	private boolean isAuto;
	private int number;

	
	public String getName() {
		return name;
	}
	public String getCodeName() {
		return codeName;
	}
	public boolean isBig() {
		return isBig;
	}
	public boolean isAuto() {
		return isAuto;
	}
	public int getNumber() {
		return number;
	}
	
	private ComplexObject(ComplexObjectBuilder complexObjectBuilder) {
		this.name = complexObjectBuilder.name;
		this.codeName = complexObjectBuilder.codeName;
		this.isBig = complexObjectBuilder.isBig;
		this.isAuto = complexObjectBuilder.isAuto;
		this.number = complexObjectBuilder.number;
	}
		


	/**
	 * "Constructeur" de la classe ComplexObject
	 * 
	 * @author Hugo DUMONT
	 *		
	 */
	public static class ComplexObjectBuilder {

		private String name;
		private String codeName;
		private boolean isBig;
		private boolean isAuto;
		private int number;
		
		public ComplexObjectBuilder(String name, String codeName) {
			this.name = name;
			this.codeName = codeName;
		}
		public ComplexObjectBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public ComplexObjectBuilder setCodeName(String codeName) {
			this.codeName = codeName;
			return this;
		}
		public ComplexObjectBuilder setBig(boolean isBig) {
			this.isBig = isBig;
			return this;
		}
		public ComplexObjectBuilder setAuto(boolean isAuto) {
			this.isAuto = isAuto;
			return this;
		}
		public ComplexObjectBuilder setNumber(int number) {
			this.number = number;
			return this;
		}
		
		
		public ComplexObject build(){
			return new ComplexObject(this);
		}
	
	}
	
	
	@Override
	public String toString() {
		return "ComplexObject [name=" + name + ", codeName=" + codeName + ", isBig=" + isBig + ", isAuto=" + isAuto
				+ ", number=" + number + "]";
	}
	
}