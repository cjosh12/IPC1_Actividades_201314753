package model;
import controller.CalculatorController;
/**
 *
 * @author josue
 */
public class Modelo {
   private UserModel[] user;
   private CalculatorModel calcu;
   private CalculatorController controller;

    public Modelo() {
    }

    public UserModel[] getUser() {
        return user;
    }

    public void setUser(UserModel[] user) {
        this.user = user;
    }

    public CalculatorModel getCalcu() {
        return calcu;
    }

    public void setCalcu(CalculatorModel calcu) {
        this.calcu = calcu;
    }

    public CalculatorController getController() {
        return controller;
    }

    public void setController(CalculatorController controller) {
        this.controller = controller;
    }
   
    
}
