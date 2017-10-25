package package1;

public class Ipv4 {
	Integer atr1;
	Integer atr2;
	Integer atr3;
	Integer atr4;
	StatusPing status;
	Float ttl;

	public Ipv4() {
		super();
	}

	public Ipv4(Integer atr1, Integer atr2, Integer atr3, Integer atr4, StatusPing status, Float ttl) {
		super();
		this.atr1 = atr1;
		this.atr2 = atr2;
		this.atr3 = atr3;
		this.atr4 = atr4;
		this.status = status;
		this.ttl = ttl;
	}

	public Integer getAtr1() {
		return atr1;
	}

	public void setAtr1(Integer atr1) {
		this.atr1 = atr1;
	}

	public Integer getAtr2() {
		return atr2;
	}

	public void setAtr2(Integer atr2) {
		this.atr2 = atr2;
	}

	public Integer getAtr3() {
		return atr3;
	}

	public void setAtr3(Integer atr3) {
		this.atr3 = atr3;
	}

	public Integer getAtr4() {
		return atr4;
	}

	public void setAtr4(Integer atr4) {
		this.atr4 = atr4;
	}

	public StatusPing getStatus() {
		return status;
	}

	public void setStatus(StatusPing status) {
		this.status = status;
	}

	public Float getTtl() {
		return ttl;
	}

	public void setTtl(Float ttl) {
		this.ttl = ttl;
	}

	public Integer incrementAtr1(Integer atr1) {
		while (this.atr1 != 223) {
			this.atr1++;
			System.out.println("<>");
		}
		return atr1;
	}

	public Integer decrementAtr1(Integer atr1) {
		while (this.atr1 != 0) {
			this.atr1--;
			System.out.println("<>");
		}
		return atr1;
	}

	public Integer incrementAtr2(Integer atr2) {
		while (this.atr2 != 255) {
			this.atr2++;
			System.out.println("<>");
		}
		return atr2;
	}

	public Integer decrementAtr2(Integer atr2) {
		while (this.atr2 != 0) {
			this.atr2--;
			System.out.println("<>");
		}
		return atr2;
	}
}
