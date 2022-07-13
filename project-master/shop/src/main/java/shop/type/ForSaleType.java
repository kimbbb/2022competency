package shop.type;

public enum ForSaleType {
	SALE("Y"), NOT_SALE("N"), UNKNOWN("UNKNOWN");
	private String code;
	
	private ForSaleType(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	
	public static ForSaleType getType(String code) {
		ForSaleType[] types = ForSaleType.values();
		for (ForSaleType type : types) {
			if (type.code.equals(code)) {
				return type;
			}
		}
		return ForSaleType.UNKNOWN;
	}
}


