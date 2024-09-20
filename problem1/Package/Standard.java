package Package;

import DisplayUnit.DisplayUnit;
import DisplayUnit.Display.LED;
import DisplayUnit.Microcontroller.ArduinoMega;

public class Standard implements Package {
    @Override
    public DisplayUnit displayUnit(){
        DisplayUnit displayUnit= new DisplayUnit();
        displayUnit.display= new LED();
        displayUnit.microcontroller=new ArduinoMega();
        return displayUnit;
    }
}
