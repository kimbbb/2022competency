package shop.dto;

public class ResponseDto {
	public static final String STATUS_OK = "OK";
	public static final String STATUS_ERROR = "ERROR";
	public static final String DEFAULT_MESSAGE = "요청이 정상적으로 처리되었습니다.";
	private String status;
	private String message;
	private Object data;

	public ResponseDto() {
		this(STATUS_OK, DEFAULT_MESSAGE);
	}

	public ResponseDto(Object data) {
		this(STATUS_OK, DEFAULT_MESSAGE, data);
	}

	public ResponseDto(String status, String message) {
		this(status, message, null);
	}

	public ResponseDto(String status, String message, Object data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public Object getData() {
		return data;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseDto []";
	}

}
