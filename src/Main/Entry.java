package Main;

import java.time.LocalDate;
import java.util.ArrayList;

public class Entry {

    private String id;
    private String clientID;
    private LocalDate date;

    private EquipementType equipementType;
    private Problem problem;
    private String notes;

    private boolean paid;
    private Status status;
    private double cost; // prix en DA
    private ArrayList<String> history;

    public Entry(String id, Client client, EquipementType equipement, Problem pb, String notes) {
        this.id = id;
        this.status = Status.RECU;
        this.clientID = client.getId();
        this.equipementType = equipement;
        this.date = LocalDate.now();
        this.problem = pb;
        this.notes = notes;

    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "\tEquipement: " + equipementType.toString() + "\t Date: " + this.date.toString()
                + "\t ClientID: " + clientID + "\t Problème: " + this.problem + "\t Statut: " + this.status
                + "\t paiement: " + paid;
    }

    public boolean isPaid() {
        return paid;
    }

    public boolean pay() {
        if (!paid) {
            this.paid = true;
            return true;
        } else
            return false;

    }

    public void nextStatus() {
        int newValue = (this.status.ordinal() + 1) % 5;
        this.status = Status.values()[newValue];
    }

    public void setToRepaired() {
        this.status = Status.REPARE;
    }
}
