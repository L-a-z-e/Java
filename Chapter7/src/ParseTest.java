interface Parseable{
    public abstract void parse(String fileName);
}

class ParserManager{
    public static Parseable getPaser(String type){
        if(type.equals("XML"))
            return new XMLParser();
        else{
            Parseable p = new HTMLParser();
            return p;
        }
    }
}

class XMLParser implements Parseable {
    @Override
    public void parse(String fileName) {
        System.out.println(fileName + " - XML parsing completed");
    }
}

class HTMLParser implements Parseable {
    @Override
    public void parse(String fileName) {
        System.out.println(fileName + " - HTML parsing completed");
    }
}
public class ParseTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getPaser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getPaser("HTML");
        parser.parse("document2.html");
    }
}
