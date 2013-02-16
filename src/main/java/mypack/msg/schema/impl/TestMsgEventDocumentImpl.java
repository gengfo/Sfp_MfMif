/*
 * An XML document type.
 * Localname: TestMsgEvent
 * Namespace: http://mypack.msg.schema
 * Java type: mypack.msg.schema.TestMsgEventDocument
 *
 * Automatically generated - do not modify.
 */
package mypack.msg.schema.impl;
/**
 * A document containing one TestMsgEvent(@http://mypack.msg.schema) element.
 *
 * This is a complex type.
 */
public class TestMsgEventDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mypack.msg.schema.TestMsgEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public TestMsgEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTMSGEVENT$0 = 
        new javax.xml.namespace.QName("http://mypack.msg.schema", "TestMsgEvent");
    
    
    /**
     * Gets the "TestMsgEvent" element
     */
    public mypack.msg.schema.TestMsgEventDocument.TestMsgEvent getTestMsgEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mypack.msg.schema.TestMsgEventDocument.TestMsgEvent target = null;
            target = (mypack.msg.schema.TestMsgEventDocument.TestMsgEvent)get_store().find_element_user(TESTMSGEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TestMsgEvent" element
     */
    public void setTestMsgEvent(mypack.msg.schema.TestMsgEventDocument.TestMsgEvent testMsgEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mypack.msg.schema.TestMsgEventDocument.TestMsgEvent target = null;
            target = (mypack.msg.schema.TestMsgEventDocument.TestMsgEvent)get_store().find_element_user(TESTMSGEVENT$0, 0);
            if (target == null)
            {
                target = (mypack.msg.schema.TestMsgEventDocument.TestMsgEvent)get_store().add_element_user(TESTMSGEVENT$0);
            }
            target.set(testMsgEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "TestMsgEvent" element
     */
    public mypack.msg.schema.TestMsgEventDocument.TestMsgEvent addNewTestMsgEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mypack.msg.schema.TestMsgEventDocument.TestMsgEvent target = null;
            target = (mypack.msg.schema.TestMsgEventDocument.TestMsgEvent)get_store().add_element_user(TESTMSGEVENT$0);
            return target;
        }
    }
    /**
     * An XML TestMsgEvent(@http://mypack.msg.schema).
     *
     * This is a complex type.
     */
    public static class TestMsgEventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mypack.msg.schema.TestMsgEventDocument.TestMsgEvent
    {
        private static final long serialVersionUID = 1L;
        
        public TestMsgEventImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TESTMSG$0 = 
            new javax.xml.namespace.QName("http://mypack.msg.schema", "testMsg");
        
        
        /**
         * Gets the "testMsg" element
         */
        public mypack.msg.schema.TestMsgType getTestMsg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                mypack.msg.schema.TestMsgType target = null;
                target = (mypack.msg.schema.TestMsgType)get_store().find_element_user(TESTMSG$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "testMsg" element
         */
        public void setTestMsg(mypack.msg.schema.TestMsgType testMsg)
        {
            synchronized (monitor())
            {
                check_orphaned();
                mypack.msg.schema.TestMsgType target = null;
                target = (mypack.msg.schema.TestMsgType)get_store().find_element_user(TESTMSG$0, 0);
                if (target == null)
                {
                    target = (mypack.msg.schema.TestMsgType)get_store().add_element_user(TESTMSG$0);
                }
                target.set(testMsg);
            }
        }
        
        /**
         * Appends and returns a new empty "testMsg" element
         */
        public mypack.msg.schema.TestMsgType addNewTestMsg()
        {
            synchronized (monitor())
            {
                check_orphaned();
                mypack.msg.schema.TestMsgType target = null;
                target = (mypack.msg.schema.TestMsgType)get_store().add_element_user(TESTMSG$0);
                return target;
            }
        }
    }
}
