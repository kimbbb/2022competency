package shop.vo;

import java.util.ArrayList;
import java.util.List;

public class PartVO {
	private int partId;
	private String partTag;
	private String partName;
	List<ProductVO> products = new ArrayList<>();
	public PartVO() {}
	public PartVO(int partId, String partTag, String partName) {
		super();
		this.partId = partId;
		this.partTag = partTag;
		this.partName = partName;
	}
	public int getPartId() {
		return partId;
	}
	public String getPartTag() {
		return partTag;
	}
	public String getPartName() {
		return partName;
	}
	public List<ProductVO> getProducts() {
		return products;
	}
	public void setPartId(int partId) {
		this.partId = partId;
	}
	public void setPartTag(String partTag) {
		this.partTag = partTag;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public void setProducts(List<ProductVO> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "PartVO []";
	}
	public void addProduct(ProductVO product) {
		products.add(product);
	}
	public void removeProduct(int productId) {
		for (ProductVO product: products) {
			if (product.getProductId() == productId) {
				products.remove(product);
				return;
			}
		}
	}
	public ProductVO findProduct(int productId) {
		for (ProductVO product: products) {
			if (product.getProductId() == productId) 
				return product;
		}
		return null;
	}
}
