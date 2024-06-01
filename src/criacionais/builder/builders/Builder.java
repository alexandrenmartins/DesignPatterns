package criacionais.builder.builders;

import criacionais.builder.cars.CarType;
import criacionais.builder.components.Engine;
import criacionais.builder.components.GPSNavigator;
import criacionais.builder.components.Transmission;
import criacionais.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}