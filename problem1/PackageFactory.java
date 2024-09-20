import Package.Advanced;
import Package.Basic;
import Package.Package;
import Package.Premium;
import Package.Standard;

public class PackageFactory {
    public static Package getPackage(String choice){
        if (choice==null) {
            return null;
        }
        if(choice.equalsIgnoreCase("Basic")){
            return new Basic();
        }
        if(choice.equalsIgnoreCase("Standard")){
            return new Standard();
        }
        if(choice.equalsIgnoreCase("Advanced")){
            return new Advanced();
        }
        if(choice.equalsIgnoreCase("Premium")){
            return new Premium();
        }
        return null;
    }
}
