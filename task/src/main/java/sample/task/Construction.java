package sample.task;
import java.util.Scanner;

public class Construction {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("enter total area:");
		double area=sc.nextDouble();
		System.out.println("enter type of standard \n 1)standar_material\n 2)high_material\n3)material\n4)fullyautomated ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:standard_material sm = new standard_material(area);
				System.out.println("Simple interest=" +sm.calculate());
				break;
		case 2:high_material hsm=new high_material(area);
				System.out.println("Total cost:"+hsm.calculate());
				break;
		case 3:material asm=new material(area);
		System.out.println("Total cost:"+asm.calculate());
		break;	
		case 4:fully_automated hsmf=new fully_automated(area);
		System.out.println("Total cost:"+hsmf.calculate());
		break;
		default:System.out.println("enter valid type in range 1 to 4");
		break;
				
		}
		
		
	}

}
