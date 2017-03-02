import org.springframework.boot.loader.tools.Layout;
import org.springframework.boot.loader.tools.LayoutFactory;

import java.io.File;

/**
 * Created by malcolm on 3/2/2017.
 */
public class CustomLayoutFactory implements LayoutFactory {

    @Override
    public Layout getLayout(File source)
    {
        return new CustomLayout();
    }
}
