package Business;

import Core.Logger.Logger;
import Entities.Instructor;
import Entities.User;

public class InstructorManager extends UserManager {
    private Logger logger;

    public InstructorManager(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void add(User entity) {
        super.add(entity);
        System.out.println("Eğitmen Ekleme İşlemi Başarılı.");
        logger.log();
    }

    @Override
    public void delete(User entity) {
        super.delete(entity);
        System.out.println("Eğitmen Silme İşlemi Başarılı.");
        logger.log();
    }

    @Override
    public void update(User entity) {
        super.update(entity);
        System.out.println("Eğitmen Güncellendi.");
        logger.log();
    }

    @Override
    public void getAll() {
        super.getAll();
        System.out.println("Eğitmenler Listesi.");
        logger.log();
    }

    public void addDepartment(Instructor entity, String department) {
        entity.setDepartment(department);
        System.out.println("Eğitmen için yeni alan: " + entity.getDepartment() + " olarak eklendi.");
        logger.log();
    }
}
