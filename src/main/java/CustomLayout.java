import org.springframework.boot.loader.tools.CustomLoaderLayout;
import org.springframework.boot.loader.tools.Layouts;
import org.springframework.boot.loader.tools.LibraryScope;
import org.springframework.boot.loader.tools.LoaderClassesWriter;

import java.io.IOException;

/**
 * Created by malcolm on 3/2/2017.
 */
public class CustomLayout extends Layouts.Jar implements CustomLoaderLayout {

    @Override
    public void writeLoadedClasses(LoaderClassesWriter writer) throws IOException
    {
        writer.writeLoaderClasses();
    }

    @Override
    public String getLauncherClassName() {
        return "org.springframework.boot.loader.PropertiesLauncher";
    }

    @Override
    public String getLibraryDestination(String libraryName, LibraryScope scope) {
        return "lib/";
    }

    @Override
    public String getClassesLocation() {
        return "";
    }

    @Override
    public String getRepackagedClassesLocation() {
        return "";
    }

    @Override
    public boolean isExecutable() {
        return true;
    }


}
