package lec06_Enum;

public enum Months {
	JENUERY(31,Seasons.WINTER),FEBRUERY(28,Seasons.WINTER),
	MARCH(31,Seasons.SPRING),APRIL(30,Seasons.SPRING),MAY(31,Seasons.SPRING),
	JUNE(30,Seasons.SUMMER),JULY(31,Seasons.SUMMER),AUGUST(31,Seasons.SUMMER),
	SEPTEMBER(30,Seasons.AUTUMN),OCTOBER(31,Seasons.AUTUMN),NOVEMBER(30,Seasons.AUTUMN),
	DECEMBER(31, Seasons.WINTER);
	
	private int days;
	private Seasons season;
	Months(int days, Seasons season){
		this.days=days;
		this.season=season;
	}
	public int getDays() {
		return days;
	}
	public Seasons getSeason() {
		return season;
	}
	
	
	
	

}
