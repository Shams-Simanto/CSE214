package Package;

import DisplayUnit.DisplayUnit;
import DisplayUnit.Display.OLED;
import DisplayUnit.Microcontroller.RaspberryPi;

public class Advanced implements Package {
    @Override
    public DisplayUnit displayUnit(){
        DisplayUnit displayUnit= new DisplayUnit();
        displayUnit.display= new OLED();
        displayUnit.microcontroller=new RaspberryPi();
        return displayUnit;
    }
}
