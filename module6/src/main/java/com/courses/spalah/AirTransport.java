package com.courses.spalah;

public class AirTransport extends  Transport { // воздушный транспорт
    public final boolean canFly = true;
}

class  AirTransportWithMotors extends  AirTransport{ // с мотором
    public final boolean haveMotors = true;
}

class  AirTransportWithoutMotors extends  AirTransport{ // без мотора (воздушный шар и тп.)
    public final boolean haveMotors = false;
}

class AirTransportWithWings extends AirTransportWithMotors{ // с крыльями
    public final boolean haveWings = true;
}

class AirTransportWithoutWings extends AirTransportWithMotors{ // без крыльев
    public final boolean haveWings = false;
}

class Airplane extends  AirTransportWithWings{

}

class Helicopter extends AirTransportWithoutWings {

}
