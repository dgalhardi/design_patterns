package br.com.diegowsu.solid.abstractfactory.app;

import br.com.diegowsu.solid.abstractfactory.aircrafts.IAircraft;
import br.com.diegowsu.solid.abstractfactory.boats.IBoat;
import br.com.diegowsu.solid.abstractfactory.factories.ITransportFactory;
import br.com.diegowsu.solid.abstractfactory.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;
    private IBoat boat;

    public Application(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
        boat = factory.createTransportBoat();
    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
        boat.startRoute();
    }
}
