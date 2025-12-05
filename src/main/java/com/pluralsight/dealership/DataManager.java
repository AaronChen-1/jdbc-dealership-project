package com.pluralsight.dealership;

import java.util.List;

public interface DataManager {

    List<Vehicle> getAllVehicles();
    Vehicle getVehicleByVin(int vin);
    void addVehicle(Vehicle vehicle);
    void updateVehicle(Vehicle vehicle);
    void removeVehicle(int vin);

    void saveContract(Contract contract);
    List<Contract> getAllContracts();
}