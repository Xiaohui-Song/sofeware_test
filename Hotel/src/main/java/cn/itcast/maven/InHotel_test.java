package cn.itcast.maven;

public class InHotel_test {

	IData iData;
	public InHotel_test(IData iData) {
		this.iData = iData;
	}
	public InHotel_test() {
		
	}
	public String in(int roomNo,String name) {
		return iData.in_Out_Rooms(roomNo,name);
	}
	
}

