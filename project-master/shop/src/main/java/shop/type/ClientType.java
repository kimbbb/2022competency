package shop.type;

public enum ClientType {
	CLIENT("CLIENT"), SHOP("SHOP"), UNKNOWN("UNKNOWN");
	private String name;
	
	private ClientType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public static ClientType getType(String name) {
		ClientType[] types = ClientType.values();
		for (ClientType type : types) {
			if (type.name.equals(name)) {
				return type;
			}
		}
		return ClientType.UNKNOWN;
	}
}


