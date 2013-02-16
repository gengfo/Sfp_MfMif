package mypack.msg.sender.decrator;

import java.util.List;

import com.oocl.frm.mif.common.decorator.Decorator;
import com.oocl.frm.mif.data.MessageMetaData;
import com.oocl.frm.mif.data.transobj.TransportObject;
import com.oocl.frm.mif.exception.MIFDecorateException;


public class TestMsgDecrator implements Decorator{

	public Object decorate(Object decorateObject, MessageMetaData metaData,
			List<String> infoMessages) throws MIFDecorateException {
		
		TransportObject to = new TransportObject(decorateObject,null);

		// TODO Auto-generated method stub
		return to;
	}

	

}
