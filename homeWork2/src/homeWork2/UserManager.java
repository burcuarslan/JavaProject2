package homeWork2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getId()+" e-mail adresli ki�i kay�t oldu");
	}
	public void delete(User user) {
		System.out.println(user.getId()+" e-mail adresli ki�i silidi");
	}
	public void update(User user) {
		System.out.println(user.getId()+" e-mail adresli ki�inin bilgileri g�ncellendi");
	}
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
}
