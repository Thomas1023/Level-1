package animal;


	public class Cat {


		private String name;
		private static int lives;


		Cat(String name, int lives) {
			
			this.name = name;
			this.lives= lives;
		}


		void meow() {
			System.out.println("meeeeeooooooooooowwwwwwwww!!");
		}


		public void printName() {
			if (name == null)
				System.out.println("i don't know my own name!");
			else
				System.out.println("my name is " + name);
		}


		void kill() {
			lives--;
			if (lives > 0)
				System.out.println("nice try, but I still have " + lives + " lives left");
			else if (lives < 0)
				System.out.println("that's overkill yo!");
			else
				System.out.println("DEAD CAT :(");
		}


		public static void main(String[] args) {
			/* Do the following things without changing the Cat class */
			Cat s = new Cat("s",3);


			// 1. Make the Cat meow
			s.meow();
			// 2. Get the Cat to print it's name
			 s.printName();


			// 3. Kill the Cat!
			 for (int i = 0; i <= lives; i++) {
				s.kill();
			}


		}
	}


