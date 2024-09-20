package Package;

import DisplayUnit.DisplayUnit;
import DisplayUnit.Display.TouchScreen;
import DisplayUnit.Microcontroller.RaspberryPi;

public class Premium implements Package {
    @Override
    public DisplayUnit displayUnit(){
        DisplayUnit displayUnit= new DisplayUnit();
        displayUnit.display= new TouchScreen();
        displayUnit.microcontroller=new RaspberryPi();
        return displayUnit;
    }
}
