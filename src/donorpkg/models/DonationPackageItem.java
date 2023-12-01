package donorpkg.models;

/**
 *
 * @author dewan
 */
public class DonationPackageItem {
    
    private String goodsItem;
    private int goodsItemAmount;

    public DonationPackageItem(String goodsItem, int goodsItemAmount) {
        this.goodsItem = goodsItem;
        this.goodsItemAmount = goodsItemAmount;
    }

    public String getGoodsItem() {
        return goodsItem;
    }

    public void setGoodsItem(String goodsItem) {
        this.goodsItem = goodsItem;
    }

    public int getGoodsItemAmount() {
        return goodsItemAmount;
    }

    public void setGoodsItemAmount(int goodsItemAmount) {
        this.goodsItemAmount = goodsItemAmount;
    }
    
}
