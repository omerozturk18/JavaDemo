package Business;

import Entities.User;

public class UserManager {
    public void add(final User user) {
        System.out.println(user.getFirstName() + " kullanıcısı eklendi.");
    }

    public void delete(final User user) {
        System.out.println(user.getFirstName() + " kullanıcısı silindi.");
    }

    public void getAll() {
        System.out.println("Tüm kullanıcılar listelendi.");
    }

    public void getById(final int userId) {
        System.out.println("İlgili kullanıcı listelendi.");
    }

    public void login(final String email, final String password) {
        System.out.println(email + " e-postaya sahip kullanıcı tarafından giriş yapıldı.");
    }

    public void logout(final User user) {
        System.out.println(
                user.getEmail() + " e-postaya sahip " + user.getFirstName() + "kullanıcı tarafından çıkış yapıldı.");
    }

    public void update(final User user) {
        System.out.println(user.getFirstName() + " kullanıcısı güncellendi.");
    }
}
