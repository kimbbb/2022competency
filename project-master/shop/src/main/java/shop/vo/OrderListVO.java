package shop.vo;

public class OrderListVO {
	private int orderListId;
	private int productId;
	private int unitCount;
	private int productPrice;
	private ProductVO product;

	public OrderListVO() {
	}

	public OrderListVO(int orderListId, int productId, int unitCount, int productPrice) {
		this.orderListId = orderListId;
		this.productId = productId;
		this.unitCount = unitCount;
		this.productPrice = productPrice;
	}

	public int getOrderListId() {
		return orderListId;
	}

	public int getProductId() {
		return productId;
	}

	public int getUnitCount() {
		return unitCount;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public ProductVO getProduct() {
		return product;
	}

	public void setOrderListId(int orderListId) {
		this.orderListId = orderListId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setUnitCount(int unitCount) {
		this.unitCount = unitCount;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public void setProduct(ProductVO product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "OrderListVO []";
	}

}
