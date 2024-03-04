package controller;

import model.VirtualPet;
import view.VirtualPetView;

public class VirtualPetController {
    private VirtualPet pet;
    private VirtualPetView view;

    public VirtualPetController(VirtualPet pet, VirtualPetView view) {
        this.pet = pet;
        this.view = view;
    }

    public double getX() {
        return pet.getX();
    }

    public double getY() {
        return pet.getY();
    }

    public void movePet(double x, double y) {
        pet.setX(x);
        pet.setY(y);
        view.updatePetPosition(x, y);
    }

}