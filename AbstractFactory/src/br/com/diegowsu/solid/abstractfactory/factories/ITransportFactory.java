package br.com.diegowsu.solid.abstractfactory.factories;

import br.com.diegowsu.solid.abstractfactory.aircrafts.IAircraft;
import br.com.diegowsu.solid.abstractfactory.boats.IBoat;
import br.com.diegowsu.solid.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
    IBoat createTransportBoat();
}
