package de.timroes.axmlrpc.serializer;

import de.timroes.axmlrpc.XMLUtil;
import de.timroes.axmlrpc.xmlcreator.XmlElement;
import java.math.BigDecimal;

/**
 * This serializer is responsible for floating point numbers.
 * 
 * @author Tim Roes
 */
public class DoubleSerializer implements Serializer {

	public XmlElement serialize(Object object) {
		// Turn double value of object into a BigDecimal to get the
		// right decimal point format.
		BigDecimal bd = BigDecimal.valueOf(((Number)object).doubleValue());
		return XMLUtil.makeXmlTag(SerializerHandler.TYPE_DOUBLE, bd.toPlainString());
	}

}
