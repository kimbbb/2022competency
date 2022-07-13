package shop.vo;

import java.util.ArrayList;
import java.util.List;

import shop.type.OrderStatusType;

public class OrderVO {
	private int orderId;
	private String orderedDate;
	private String orderedTime;
	private OrderStatusType orderStatus;
	private int clientId;
	private ClientVO client;
	private List<OrderListVO> orderLists = new ArrayList<>();

	public OrderVO() {
	}

	public OrderVO(int orderId, String orderedDate, String orderedTime, OrderStatusType orderStatus, int clientId) {
		this.orderId = orderId;
		this.orderedDate = orderedDate;
		this.orderedTime = orderedTime;
		this.orderStatus = orderStatus;
		this.clientId = clientId;
	}

	public int getOrderId() {
		return orderId;
	}

	public String getOrderedDate() {
		return orderedDate;
	}

	public String getOrderedTime() {
		return orderedTime;
	}

	public OrderStatusType getOrderStatus() {
		return orderStatus;
	}

	public int getClientId() {
		return clientId;
	}

	public ClientVO getClient() {
		return client;
	}

	public List<OrderListVO> getOrderLists() {
		return orderLists;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setOrderedDate(String orderedDate) {
		this.orderedDate = orderedDate;
	}

	public void setOrderedTime(String orderedTime) {
		this.orderedTime = orderedTime;
	}

	public void setOrderStatus(OrderStatusType orderStatus) {
		this.orderStatus = orderStatus;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public void setClient(ClientVO client) {
		this.client = client;
	}

	public void setOrderLists(List<OrderListVO> orderLists) {
		this.orderLists = orderLists;
	}

	@Override
	public String toString() {
		return "OrderVO []";
	}

}
