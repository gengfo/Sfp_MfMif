/*
 * XML Type:  TestMsgType
 * Namespace: http://mypack.msg.schema
 * Java type: mypack.msg.schema.TestMsgType
 *
 * Automatically generated - do not modify.
 */
package mypack.msg.schema;


/**
 * An XML TestMsgType(@http://mypack.msg.schema).
 *
 * This is a complex type.
 */
public interface TestMsgType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TestMsgType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0DC18BB3F321DBBAB96D091E2C059B29").resolveHandle("testmsgtypebda5type");
    
    /**
     * Gets the "systemName" element
     */
    java.lang.String getSystemName();
    
    /**
     * Gets (as xml) the "systemName" element
     */
    mypack.msg.schema.TestMsgType.SystemName xgetSystemName();
    
    /**
     * Sets the "systemName" element
     */
    void setSystemName(java.lang.String systemName);
    
    /**
     * Sets (as xml) the "systemName" element
     */
    void xsetSystemName(mypack.msg.schema.TestMsgType.SystemName systemName);
    
    /**
     * Gets the "content" element
     */
    java.lang.String getContent();
    
    /**
     * Gets (as xml) the "content" element
     */
    mypack.msg.schema.TestMsgType.Content xgetContent();
    
    /**
     * Sets the "content" element
     */
    void setContent(java.lang.String content);
    
    /**
     * Sets (as xml) the "content" element
     */
    void xsetContent(mypack.msg.schema.TestMsgType.Content content);
    
    /**
     * An XML systemName(@http://mypack.msg.schema).
     *
     * This is an atomic type that is a restriction of mypack.msg.schema.TestMsgType$SystemName.
     */
    public interface SystemName extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SystemName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0DC18BB3F321DBBAB96D091E2C059B29").resolveHandle("systemnamef8efelemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static mypack.msg.schema.TestMsgType.SystemName newValue(java.lang.Object obj) {
              return (mypack.msg.schema.TestMsgType.SystemName) type.newValue( obj ); }
            
            public static mypack.msg.schema.TestMsgType.SystemName newInstance() {
              return (mypack.msg.schema.TestMsgType.SystemName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static mypack.msg.schema.TestMsgType.SystemName newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (mypack.msg.schema.TestMsgType.SystemName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML content(@http://mypack.msg.schema).
     *
     * This is an atomic type that is a restriction of mypack.msg.schema.TestMsgType$Content.
     */
    public interface Content extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Content.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0DC18BB3F321DBBAB96D091E2C059B29").resolveHandle("content6520elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static mypack.msg.schema.TestMsgType.Content newValue(java.lang.Object obj) {
              return (mypack.msg.schema.TestMsgType.Content) type.newValue( obj ); }
            
            public static mypack.msg.schema.TestMsgType.Content newInstance() {
              return (mypack.msg.schema.TestMsgType.Content) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static mypack.msg.schema.TestMsgType.Content newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (mypack.msg.schema.TestMsgType.Content) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static mypack.msg.schema.TestMsgType newInstance() {
          return (mypack.msg.schema.TestMsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static mypack.msg.schema.TestMsgType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (mypack.msg.schema.TestMsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static mypack.msg.schema.TestMsgType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (mypack.msg.schema.TestMsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static mypack.msg.schema.TestMsgType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mypack.msg.schema.TestMsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static mypack.msg.schema.TestMsgType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mypack.msg.schema.TestMsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static mypack.msg.schema.TestMsgType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mypack.msg.schema.TestMsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static mypack.msg.schema.TestMsgType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mypack.msg.schema.TestMsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static mypack.msg.schema.TestMsgType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mypack.msg.schema.TestMsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static mypack.msg.schema.TestMsgType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mypack.msg.schema.TestMsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static mypack.msg.schema.TestMsgType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mypack.msg.schema.TestMsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static mypack.msg.schema.TestMsgType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mypack.msg.schema.TestMsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static mypack.msg.schema.TestMsgType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mypack.msg.schema.TestMsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static mypack.msg.schema.TestMsgType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (mypack.msg.schema.TestMsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static mypack.msg.schema.TestMsgType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mypack.msg.schema.TestMsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static mypack.msg.schema.TestMsgType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (mypack.msg.schema.TestMsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static mypack.msg.schema.TestMsgType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mypack.msg.schema.TestMsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mypack.msg.schema.TestMsgType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mypack.msg.schema.TestMsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mypack.msg.schema.TestMsgType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mypack.msg.schema.TestMsgType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
