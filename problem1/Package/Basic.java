package Package;

import DisplayUnit.DisplayUnit;
import DisplayUnit.Display.LCD;
import DisplayUnit.Microcontroller.ATMega32;

public class Basic implements Package{
    @Override
    public DisplayUnit displayUnit(){
        DisplayUnit displayUnit= new DisplayUnit();
        displayUnit.display= new LCD();
        displayUnit.microcontroller=new ATMega32();
        return displayUnit;
    }
}
