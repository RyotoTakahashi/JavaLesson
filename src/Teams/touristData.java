package Teams;

public class touristData {
	
	//保持データ
	private Integer domesticTourist;//国内観光客数
	private Integer foreignTourist;//外国人観光客数
	private Integer totalTourist;//そう観光客数
	private double foreignPercent;//外国人の割合

	public touristData(Integer domesticTourist, Integer foreignTourist) {
		this.setDomesticTourist(domesticTourist);
		this.setForeignTourist(foreignTourist);
		setTotalTourist();
		setForeignPercent();
	}
	
	//getter 国内観光客数
	public Integer getDomesticTourist() {
		return domesticTourist;
	}
	
	//setter 国内観光客数
	public void setDomesticTourist(Integer domesticTourist) {
		if (domesticTourist > 0) {
			this.domesticTourist = domesticTourist;
		}
		//安全装置
		if (foreignTourist != null && foreignTourist != 0) {
			totalTourist = domesticTourist + foreignTourist;
			setForeignPercent();
		}
	}

	//getter 外国人観光客数
	public Integer getForeignTourist() {
		return foreignTourist;
	}

	//setter 外国人観光客数
	public void setForeignTourist(Integer foreignTourist) {
		if (domesticTourist > 0) {
			this.foreignTourist = foreignTourist;
		}
		//安全装置
		if (domesticTourist != null && domesticTourist != 0) {
			totalTourist = domesticTourist + foreignTourist;
			setForeignPercent();
		}

	}
	
	//getter 総観光客数
	public Integer getTotalTourist() {
		return totalTourist;
	}
	
	//setter 総観光客数
	public void setTotalTourist() {
		this.totalTourist=(domesticTourist + foreignTourist);
	}
	
	//getter 外国人観光客の割合
	public double getForeignPercent() {
		return foreignPercent;

	}
	
	//setter 外国人観光客の割合
	public void setForeignPercent() {
		this.foreignPercent = (double) foreignTourist * 100 / totalTourist;
		//intだと正確に演算できないのでdoubleにキャスト
	}

}
