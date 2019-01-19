package orgg.react.app.stock;

public class StockInfo {
    private String companyName;
    private int sharePrice;

    public StockInfo(String companyName, int sharePrice) {
        this.companyName = companyName;
        this.sharePrice = sharePrice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    @Override
    public String toString() {
        return "StockInfo{" +
                "companyName='" + companyName + '\'' +
                ", sharePrice=" + sharePrice +
                '}';
    }
}
