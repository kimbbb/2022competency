package shop.dto;

public class WebSocketDto {
	public enum Type {
		ADD, CHANGE;
	}

	private Type type;
	private Object data;

	public WebSocketDto() {
	}

	public WebSocketDto(Type type, Object data) {
		this.type = type;
		this.data = data;
	}

	public Type getType() {
		return type;
	}

	public Object getData() {
		return data;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "WebSocketDto []";
	}

}
