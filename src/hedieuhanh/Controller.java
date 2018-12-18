package hedieuhanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Controller {
	public List<TienTrinh> getTienTrinh(String fileName){
		List<TienTrinh> alItem=new ArrayList<>();
		File file=new File(fileName);
		FileReader frd=null;
		BufferedReader bfd=null;
		try {
			frd=new FileReader(file);
			bfd=new BufferedReader(frd);
			String tmp="";
			while((tmp=bfd.readLine())!=null) {
				TienTrinh item=new TienTrinh(tmp.split("-")[0], Integer.parseInt(tmp.split("-")[1]));
				alItem.add(item);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alItem;
	}
	
	public List<Integer> getOnho(String fileName){
		List<Integer> alItem=new ArrayList<>();
		File file=new File(fileName);
		FileReader frd=null;
		BufferedReader bfd=null;
		try {
			frd=new FileReader(file);
			bfd=new BufferedReader(frd);
			String tmp="";
			while((tmp=bfd.readLine())!=null) {
				int item= Integer.parseInt(tmp);
				alItem.add(item);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return alItem;
	}
	
	public void bestFix(List<TienTrinh> tt, List<Integer> on) {
		int tem,viTri;
		List<Integer> hieu=new ArrayList<>();
		for(int i=0;i<tt.size();i++) {
			for(int j=0;j<on.size();j++) {
				if(on.get(j)>= tt.get(i).getDungLuong()) {
					tem=on.get(j)-tt.get(i).getDungLuong();
					hieu.add(tem);
				}
			}
			int min=hieu.get(0);
			for(int k=1;k<hieu.size();k++) {
				if(hieu.get(k) <= min) {
					min=hieu.get(k);
				}
			}
			for(int m=0;m<on.size();m++) {
				if(on.get(m) - tt.get(i).getDungLuong()== min) {
					viTri=m;
				}
			}
		}
		
		
	}
	
	public void firstFix(List<TienTrinh> tt, List<Integer> on) {
		int viTri;
		for(int i=0;i<tt.size();i++) {
			for(int j=0;j<on.size();j++) {
				if(on.get(j)>= tt.get(i).getDungLuong()) {
					viTri=j;
					break;
				}
			}
		}
	}
	
	public void worstFix(List<TienTrinh> tt, List<Integer> on) {
		int tem,viTri;
		List<Integer> hieu=new ArrayList<>();
		for(int i=0;i<tt.size();i++) {
			for(int j=0;j<on.size();j++) {
				if(on.get(j)>= tt.get(i).getDungLuong()) {
					tem=on.get(j)-tt.get(i).getDungLuong();
					hieu.add(tem);
				}
			}
			int max=hieu.get(0);
			for(int k=1;k<hieu.size();k++) {
				if(hieu.get(k) >= max) {
					max=hieu.get(k);
				}
			}
			for(int m=0;m<on.size();m++) {
				if(on.get(m) - tt.get(i).getDungLuong()== max) {
					viTri=m;
				}
			}
		}
	}
	

}
