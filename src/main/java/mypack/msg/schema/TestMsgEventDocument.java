/*
 * An XML document type.
 * Localname: TestMsgEvent
 * Namespace: http://mypack.msg.schema
 * Java type: mypack.msg.schema.TestMsgEventDocument
 *
 * Automatically generated - do not modify.
 */
package mypack.msg.schema;


/**
 * A document containing one TestMsgEvent(@http://mypack.msg.schema) element.
 *
 * This is a complex type.
 */
public interface TestMsgEventDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TestMsgEventDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0DC18BB3F321DBBAB96D091E2C059B29").resolveHandle("testmsgevent8401doctype");
    
    /**
     * Gets the "TestMsgEvent" element
     */
    mypack.msg.schema.TestMsgEventDocument.TestMsgEvent getTestMsgEvent();
    
    /**
     * Sets the "TestMsgEvent" element
     */
    void setTestMsgEvent(mypack.msg.schema.TestMsgEventDocument.TestMsgEvent testMsgEvent);
    
    /**
     * Appends and returns a new empty "TestMsgEvent" element
     */
    mypack.msg.schema.TestMsgEventDocument.TestMsgEvent addNewTestMsgEvent();
    
    /**
     * An XML TestMsgEvent(@http://mypack.msg.schema).
     *
     * This is a complex type.
     */
    public interface TestMsgEvent extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TestMsgEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0DC18BB3F321DBBAB96D091E2C059B29").resolveHandle("testmsgevent4408elemtype");
        
        /**
         * Gets the "testMsg" element
         */
        mypack.msg.schema.TestMsgType getTestMsg();
        
        /**
         * Sets the "testMsg" element
         */
        void setTestMsg(mypack.msg.schema.TestMsgType testMsg);
        
        /**
         * Appends and returns a new empty "testMsg" element
         */
        mypack.msg.schema.TestMsgType addNewTestMsg();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static mypack.msg.schema.TestMsgEventDocument.TestMsgEvent newInstance() {
              return (mypack.msg.schema.TestMsgEventDocument.TestMsgEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static mypack.msg.schema.TestMsgEventDocument.TestMsgEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (mypack.msg.schema.TestMsgEventDocument.TestMsgEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static mypack.msg.schema.TestMsgEventDocument newInstance() {
          return (mypack.msg.schema.TestMsgEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static mypack.msg.schema.TestMsgEventDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (mypack.msg.schema.TestMsgEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static mypack.msg.schema.TestMsgEventDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (mypack.msg.schema.TestMsgEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static mypack.msg.schema.TestMsgEventDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mypack.msg.schema.TestMsgEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static mypack.msg.schema.TestMsgEventDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mypack.msg.schema.TestMsgEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static mypack.msg.schema.TestMsgEventDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mypack.msg.schema.TestMsgEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static mypack.msg.schema.TestMsgEventDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mypack.msg.schema.TestMsgEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static mypack.msg.schema.TestMsgEventDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mypack.msg.schema.TestMsgEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static mypack.msg.schema.TestMsgEventDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mypack.msg.schema.TestMsgEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static mypack.msg.schema.TestMsgEventDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mypack.msg.schema.TestMsgEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static mypack.msg.schema.TestMsgEventDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mypack.msg.schema.TestMsgEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static mypack.msg.schema.TestMsgEventDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mypack.msg.schema.TestMsgEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static mypack.msg.schema.TestMsgEventDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (mypack.msg.schema.TestMsgEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static mypack.msg.schema.TestMsgEventDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mypack.msg.schema.TestMsgEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static mypack.msg.schema.TestMsgEventDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (mypack.msg.schema.TestMsgEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static mypack.msg.schema.TestMsgEventDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mypack.msg.schema.TestMsgEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mypack.msg.schema.TestMsgEventDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mypack.msg.schema.TestMsgEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mypack.msg.schema.TestMsgEventDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mypack.msg.schema.TestMsgEventDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
