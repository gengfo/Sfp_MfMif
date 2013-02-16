/*
 * XML Type:  TestMsgType
 * Namespace: http://mypack.msg.schema
 * Java type: mypack.msg.schema.TestMsgType
 *
 * Automatically generated - do not modify.
 */
package mypack.msg.schema.impl;
/**
 * An XML TestMsgType(@http://mypack.msg.schema).
 *
 * This is a complex type.
 */
public class TestMsgTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mypack.msg.schema.TestMsgType
{
    private static final long serialVersionUID = 1L;
    
    public TestMsgTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEMNAME$0 = 
        new javax.xml.namespace.QName("http://mypack.msg.schema", "systemName");
    private static final javax.xml.namespace.QName CONTENT$2 = 
        new javax.xml.namespace.QName("http://mypack.msg.schema", "content");
    
    
    /**
     * Gets the "systemName" element
     */
    public java.lang.String getSystemName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "systemName" element
     */
    public mypack.msg.schema.TestMsgType.SystemName xgetSystemName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mypack.msg.schema.TestMsgType.SystemName target = null;
            target = (mypack.msg.schema.TestMsgType.SystemName)get_store().find_element_user(SYSTEMNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "systemName" element
     */
    public void setSystemName(java.lang.String systemName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSTEMNAME$0);
            }
            target.setStringValue(systemName);
        }
    }
    
    /**
     * Sets (as xml) the "systemName" element
     */
    public void xsetSystemName(mypack.msg.schema.TestMsgType.SystemName systemName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mypack.msg.schema.TestMsgType.SystemName target = null;
            target = (mypack.msg.schema.TestMsgType.SystemName)get_store().find_element_user(SYSTEMNAME$0, 0);
            if (target == null)
            {
                target = (mypack.msg.schema.TestMsgType.SystemName)get_store().add_element_user(SYSTEMNAME$0);
            }
            target.set(systemName);
        }
    }
    
    /**
     * Gets the "content" element
     */
    public java.lang.String getContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "content" element
     */
    public mypack.msg.schema.TestMsgType.Content xgetContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mypack.msg.schema.TestMsgType.Content target = null;
            target = (mypack.msg.schema.TestMsgType.Content)get_store().find_element_user(CONTENT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "content" element
     */
    public void setContent(java.lang.String content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTENT$2);
            }
            target.setStringValue(content);
        }
    }
    
    /**
     * Sets (as xml) the "content" element
     */
    public void xsetContent(mypack.msg.schema.TestMsgType.Content content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mypack.msg.schema.TestMsgType.Content target = null;
            target = (mypack.msg.schema.TestMsgType.Content)get_store().find_element_user(CONTENT$2, 0);
            if (target == null)
            {
                target = (mypack.msg.schema.TestMsgType.Content)get_store().add_element_user(CONTENT$2);
            }
            target.set(content);
        }
    }
    /**
     * An XML systemName(@http://mypack.msg.schema).
     *
     * This is an atomic type that is a restriction of mypack.msg.schema.TestMsgType$SystemName.
     */
    public static class SystemNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements mypack.msg.schema.TestMsgType.SystemName
    {
        private static final long serialVersionUID = 1L;
        
        public SystemNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SystemNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML content(@http://mypack.msg.schema).
     *
     * This is an atomic type that is a restriction of mypack.msg.schema.TestMsgType$Content.
     */
    public static class ContentImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements mypack.msg.schema.TestMsgType.Content
    {
        private static final long serialVersionUID = 1L;
        
        public ContentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ContentImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
