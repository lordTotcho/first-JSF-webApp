import java.text.DateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;

// Indicate that the JSF framework should create and manage the webTimeBean objects
@ManagedBean( name="webTimeBean" )
public class WebTimeBean {
	
	public String getTime() {
		return DateFormat.getTimeInstance( DateFormat.LONG ).format( new Date() );
	}

}
