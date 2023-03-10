

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.ibm.icu.math.BigDecimal;
// --- <<IS-END-IMPORTS>> ---

public final class converters

{
	// ---( internal utility methods )---

	final static converters _instance = new converters();

	static converters _newInstance() { return new converters(); }

	static converters _cast(Object o) { return (converters)o; }

	// ---( server methods )---




	public static final void convertStringToBigDecimal (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(convertStringToBigDecimal)>> ---
		// @sigtype java 3.5
		// [i] field:0:required inString
		// [o] object:0:required output
		IDataCursor pipelineCursor = pipeline.getCursor();
		String inString = IDataUtil.getString( pipelineCursor, "inString" );
		pipelineCursor.destroy();
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		BigDecimal bigDecimal = new BigDecimal(inString);
		
		 
		IDataUtil.put( pipelineCursor_1, "output", bigDecimal.toBigDecimal() );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}
}

