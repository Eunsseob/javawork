package _07_comparable;

public class sugang implements Comparable<sugang>{
	private String object;
	private int cost;
	
	public sugang(String object, int cost) {
		this.object = object;
		this.cost = cost;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "sugang [object=" + object + ", cost=" + cost + "]\n";
	}
	
	@Override
	public int compareTo(sugang s) { // 수강 코스트 오름차순 정렬
		if(cost < s.cost)
			return -1;
		else if(cost == s.cost)
			return 0;
		else
			return 1;
	}
}

class revsugangcost implements Comparable<revsugangcost>{
	private String object;
	private int cost;
	
	public revsugangcost(String object, int cost) {
		this.object = object;
		this.cost = cost;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	public int compareTo(revsugangcost s1) { // 수강 코스트 오름차순 정렬
		if(cost > s1.cost)
			return -1;
		else if(cost == s1.cost)
			return 0;
		else
			return 1;
	}
	
	@Override
	public String toString() {
		return "revsugang [object=" + object + ", cost=" + cost + "]\n";
	}
	
}
