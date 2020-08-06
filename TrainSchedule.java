package Train;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
public class TrainSchedule{
	public static void main(String[] args){
		ArrayList trainList = new ArrayList<Train>();
		HashMap<String,String> stopMap = new HashMap<>();
		
		
		
		Train mumbaiExpress = new Train();
		mumbaiExpress.initialize(123,"Mumbai Express","Chennai","Mumbai","06:00 AM","10:AM");
		stopMap.put("MAA","Chennai");
		stopMap.put("VJD","Vijayawada Junction");
		stopMap.put("PUN","Pune Junction");
		stopMap.put("WDI","Wadi Junction");
		stopMap.put("SPR","Solapur Junction");
		mumbaiExpress.addStop(stopMap);
		trainList.add(mumbaiExpress);
		stopMap.clear();
	
		
		
		Train maduraiExpress = new Train();
		maduraiExpress.initialize(456,"Madurai Express","Kovilpatti","Madurai","07:00 AM","10:29 AM");
		stopMap.put("IXM","Madurai Junction");
		stopMap.put("STR","Sattur Junction");
		stopMap.put("TPR","Thiruparangundram Junction");
		maduraiExpress.addStop(stopMap);
		trainList.add(maduraiExpress);
		stopMap.clear();

		
		Train nagercoilExpress = new Train();
		nagercoilExpress.initialize(678,"Nagercoil Express","Virudhunagar","Nagercoil","08:00 AM","12:00 PM");
		stopMap.put("VNR","Virudhunagar");
		stopMap.put("CVP","Kovilpatti Junction");
		stopMap.put("KPY","Kayathar Junction");
		stopMap.put("SAR","Salaiputhur Junction");
		stopMap.put("AVL","AralvaiMozhi Junction");
		nagercoilExpress.addStop(stopMap);
		trainList.add(nagercoilExpress);
		stopMap.clear();
	
		
		
		Train vaigaiExpress = new Train();
		vaigaiExpress.initialize(246,"Vaigai Express","Madurai","Trichy","09:00 AM","1:00 AM");
		stopMap.put("TPM","Thiruparangundram Junction");
		stopMap.put("KPI","Kallupatti Junction");
		stopMap.put("MDI","Malamadai Junction");
		stopMap.put("TCY","Tiruchirapalli Junction");
		stopMap.put("CVP","Kovilpatti Junction");
		vaigaiExpress.addStop(stopMap);
		trainList.add(vaigaiExpress);
		stopMap.clear();
		
		
		System.out.println("Please enter  code----->");
		Scanner trainScanner = new Scanner(System.in);
		String cde = trainScanner.next();
		for(int i=0;i<trainList.size();i++){
			Train currentTrain = (Train)trainList.get(i);
			
			for(Map.Entry<String,String>currStop:currentTrain.getStopMap().entrySet()){
				if(currStop.getKey().equalsIgnoreCase(cde)){
					currentTrain.print();
					
				}
		
			
			}

		}
	
		
			
		}
			
	}


		
		
	
			
		
		
	

		
		