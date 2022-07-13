package shop.vo;

import shop.type.ClientType;

public class ClientVO {
	private int clientId;
	private int clientIp;
	private int clientName;
	private ClientType clientType;

	public ClientVO() {
	}

	public ClientVO(int clientId, int clientIp, int clientName, ClientType clientType) {
		this.clientId = clientId;
		this.clientIp = clientIp;
		this.clientName = clientName;
		this.clientType = clientType;
	}

	public int getClientId() {
		return clientId;
	}

	public int getClientIp() {
		return clientIp;
	}

	public int getClientName() {
		return clientName;
	}

	public ClientType getClientType() {
		return clientType;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public void setClientIp(int clientIp) {
		this.clientIp = clientIp;
	}

	public void setClientName(int clientName) {
		this.clientName = clientName;
	}

	public void setClientType(ClientType clientType) {
		this.clientType = clientType;
	}

	@Override
	public String toString() {
		return "ClientVO []";
	}

}
