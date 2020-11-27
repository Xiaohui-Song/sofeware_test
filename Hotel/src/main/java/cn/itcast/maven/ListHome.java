package cn.itcast.maven;

public class ListHome{
	private static IData iData;
	
	public ListHome() {
		
	}
	
	public ListHome(IData iData) {
		this.iData = iData;
	}
	
	public void search() {
		for(int i=0;i<iData.getRoom().length;i++) {
			for(int j =0;j<iData.getRoom()[0].length;j++) {
				int roomNo = (i+1)*100+j+1;
				System.out.print(roomNo+"\t");
			}
			System.out.print("\r\n");
			for(int j=0;j<iData.getRoom()[0].length;j++) {
				System.out.print(iData.getRoom()[i][j]+"\t");
			}
		}
	}
}
