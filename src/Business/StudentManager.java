package Business;

import Core.Logger.Logger;
import Entities.Student;
import Entities.User;

public class StudentManager extends UserManager {
    private Logger logger;

    public StudentManager(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void add(User entity) {
        super.add(entity);
        System.out.println("Öğrenci Ekleme İşlemi Başarılı.");
        logger.log();
    }

    @Override
    public void delete(User entity) {
        super.delete(entity);
        System.out.println("Silme İşlemi Başarılı.");
        logger.log();
    }

    @Override
    public void update(User entity) {
        super.update(entity);
        System.out.println("Öðrenci Güncellendi.");
        logger.log();
    }

    @Override
    public void getAll() {
        super.getAll();
        System.out.println("Öğrenci Listesi.");
        logger.log();
    }

    public void addAddress(Student entity, String address) {
        entity.setAddress(address);
        System.out.println("Öğrenci için yeni adres: " + entity.getAddress() + " olarak eklendi.");
        logger.log();
    }
}