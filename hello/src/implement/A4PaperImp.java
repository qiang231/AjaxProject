package implement;

import iface.IPaper;

public class A4PaperImp implements IPaper {
    @Override
    public String getSize() {
        return "A4";
    }
}
