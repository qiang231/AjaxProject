package print;

import iface.IInkBox;
import iface.IPaper;

/**
 * 使用标准的墨盒和纸张进行打印
 */
public class Printer {
    private IInkBox inkBox;
    private IPaper paper;

    public void print(String content){
        if (inkBox == null || null == paper) {
            System.out.println("墨盒和纸张出现错误，请重新安装");
        }
        String color = inkBox.getColor();
        String size = paper.getSize();
        System.out.println("以下文字是" + color + "颜色的：");
        System.out.println("使用内容：" + size);
        System.out.println("打印内容：" + content );
    }

    public IInkBox getInkBox() {
        return inkBox;
    }

    public void setInkBox(IInkBox inkBox) {
        this.inkBox = inkBox;
    }

    public IPaper getPaper() {
        return paper;
    }

    public void setPaper(IPaper paper) {
        this.paper = paper;
    }
}
