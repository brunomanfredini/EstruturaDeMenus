package programaJava;

 import java.util.ArrayList;
 
 public class Programa {
 	
	public static void main(String[] args) {		
		ArrayList<Menus> menu1 = new ArrayList<Menus>();
		ArrayList<Menus> menu2 = new ArrayList<Menus>();
		
 		ArrayList<SubMenus> subMenu1 = new ArrayList<SubMenus>();
 		ArrayList<SubMenus> subMenu2 = new ArrayList<SubMenus>();
 		
 		menu1.add(new Menus("Pessoas"));
 		menu2.add(new Menus("Produtos"));
 		
		subMenu1.add(new SubMenus("Joao"));
 		subMenu1.add(new SubMenus("Maria"));
 		subMenu1.add(new SubMenus("Carlos"));
 		
 		subMenu2.add(new SubMenus("Bicicleta"));
 		subMenu2.add(new SubMenus("Carro"));
 		subMenu2.add(new SubMenus("Notebook"));
 		
 		
		for(Menus i: menu1) {
 			System.out.println(i.nome);
			for(SubMenus j: subMenu1) {
 				System.out.println("  " + j.nome);
 			}
		}
		
		for(Menus i: menu2) {
	 		System.out.println(i.nome);
			for(SubMenus j: subMenu2) {
	 			System.out.println("  " + j.nome);
	 		}
 		}
 	}
}		

