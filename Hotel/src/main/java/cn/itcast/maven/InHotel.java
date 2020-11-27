package cn.itcast.maven;

public class InHotel{

	IData iData;
	public InHotel(IData iData) {
		this.iData = iData;
	}
	public InHotel() {
		
	}
	public String in(int roomNo,String name) {
		return iData.in_Out_Rooms(roomNo,name);
	}
	
}

