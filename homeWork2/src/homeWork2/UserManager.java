package homeWork2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getId()+" e-mail adresli kişi kayıt oldu");
	}
	public void delete(User user) {
		System.out.println(user.getId()+" e-mail adresli kişi silidi");
	}
	public void update(User user) {
		System.out.println(user.getId()+" e-mail adresli kişinin bilgileri güncellendi");
	}
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
}
