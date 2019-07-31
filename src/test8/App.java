package test8;

public class App {
	public static void main(String[] args) {
		App a = new App();
		App.L l = a.new L();
		l.PrivateClass();
	}
	private static class Z {
		public static int tmp = 5;
		public static int k = 10;
		private static void Stream() {
		}
		private class M {
			private class Zz {
				private void Stream() {
				}
			}
			private class L {
				private void PrivateClass() {
					App app = new App();
					App.Z zo = new App.Z();
					App.Z z1 = new App.Z();
					zo.tmp = 500;
					System.out.println("Private lol " + z1.tmp);
					System.out.println(App.Z.tmp);
				}
			}
		}
	}
	class L {
		public void PrivateClass() {
			App app = new App();
			App.Z z = new App.Z();
			App.Z z1 = new App.Z();
			z.Stream();
			App.Z.M m = z.new M();
			App.Z.M.L l = m.new L();
			l.PrivateClass();
		}
	}
}

class C {
	public void Ok() {
	}
}