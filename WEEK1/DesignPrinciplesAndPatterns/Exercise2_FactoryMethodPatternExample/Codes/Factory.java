package WEEK1.DesignPrinciplesAndPatterns.Exercise2_FactoryMethodPatternExample.Codes;
public class Factory extends DocumentFactory {

    @Override
    public Object createDocument(String doc) {
        // TODO Auto-generated method stub
        if(doc.equals("PDF")) return new pDocument();
        else if (doc.equals("WORD")) return new wDocument();
        else if(doc.equals("EXCEL")) return new eDocument();
        return null;
    }

    public static void main(String[] args) {
        Factory f = new Factory();
        WordDocument wd = (WordDocument) f.createDocument("WORD");
        PdfDocument  pd = (PdfDocument) f.createDocument("PDF");
        ExcelDocument ed = (ExcelDocument) f.createDocument("EXCEL");

        wd.getDocument();
        pd.getDocument();
        ed.getDocument();
    }


}
