package shop.vo;

import shop.type.ForSaleType;

public class ProductVO {
	private int productId;
	private String productName;
	private int productPrice;
	private ForSaleType forSale;
	private int partId;

	public ProductVO() {
	}

	public ProductVO(int productId, String productName, int productPrice, ForSaleType forSale, int partId) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.forSale = forSale;
		this.partId = partId;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public ForSaleType getForSale() {
		return forSale;
	}

	public int getPartId() {
		return partId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public void setForSale(ForSaleType forSale) {
		this.forSale = forSale;
	}

	public void setPartId(int partId) {
		this.partId = partId;
	}

	@Override
	public String toString() {
		return "ProductVO []";
	}

}
