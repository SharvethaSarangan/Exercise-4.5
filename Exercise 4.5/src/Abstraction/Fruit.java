package Abstraction;

	public abstract class Fruit {
		
		protected String name;
		
		public Fruit(String n) {
			this.name = n;
			System.out.println(name + " constructor is invoked");
		}
		
		public String Factsaboutapple() { // constructor with argument
			return "\n\n---FACTS ABOUT APPLE---" +
		               "\nApple is a member of rose family" +
					   "\nIt takes about 36 apples to create one gallon of apple cider"+
					   "\nApples ripen or soften ten times faster at room temperature than if they were refrigerated" ;
				}
		
		public abstract double totalPrice();


		}


