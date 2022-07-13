package shop.type;

public enum OrderStatusType {
	PROCEEDING("N"), COMPLETED("Y"), UNKNOWN("UNKNOWN");
	private String code;
	
	private OrderStatusType(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	
	public static OrderStatusType getType(String code) {
		OrderStatusType[] types = OrderStatusType.values();
		for (OrderStatusType type : types) {
			if (type.code.equals(code)) {
				return type;
			}
		}
		return OrderStatusType.UNKNOWN;
	}
}


