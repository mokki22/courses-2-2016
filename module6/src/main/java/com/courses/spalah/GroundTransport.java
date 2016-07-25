package com.courses.spalah;

public class GroundTransport extends  Transport{ // наземный транспорт
    public final boolean canDrive = true;
}

class RoadTransport extends  GroundTransport { // можно ездить по дороге
    public final boolean canDriveTheRoad = true;
}

class RailsTransport extends  GroundTransport { // можно ездить по рельсам
    public final boolean canDriveTheRails = true;
}

class Train extends RailsTransport {

}
class Tram extends RailsTransport {

}


class ElectricTransport extends  RoadTransport { // электротранспорт
    public final boolean canDriveByElectric = true;
}


class Trolleybus extends ElectricTransport{

}


class FuelTransport extends  RoadTransport {  // транспорт работающий на горючем
    public final boolean canDriveByFuel = true;
}


class Car extends FuelTransport {
    public final boolean roof = true;
}

class PassengerCar extends Car{

}
class FreightCar extends Car{

}
class Bus extends Car{

}


class Motorcycle extends FuelTransport {
    public final boolean roof = false;
}

class SportBike extends  Motorcycle{

}
class Tricycle extends Motorcycle{

}
class QuadBike extends Motorcycle{

}










