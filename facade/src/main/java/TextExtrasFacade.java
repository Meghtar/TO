public class TextExtrasFacade {

    public String AddExtrasToText(String text, boolean smallExtras) {
        HeaderAdder headerAdder;
        FooterAdder footerAdder;
        if(smallExtras == true) {
            headerAdder = new SmallHeaderAdder();
            footerAdder = new SmallFooterAdder();
        } else {
            headerAdder = new BigHeaderAdder();
            footerAdder = new BigFooterAdder();
        }

        text = headerAdder.addHeader(text);
        text = footerAdder.addFooter(text);

        return text;
    }
}
