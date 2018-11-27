package BookV1;

/**
 * 对图书的操作
 */
public class BookBiz {

    //基本的业务方法
    //增加图书
    /**
     * 获得图书仓库中图书的对象个数
     * @return
     */
    public int getBookCount(){
        int count = 0;
        for (Book book:Data.bookStore
             ) {
            if (book == null) {
                break;
            }
            count++;
        }
        return count;
    }

    public int getBookCount(Book...books){

        int count = 0;
        for (Book book:books
        ) {
            if (book == null) {
                break;
            }
            count++;
        }
        return count;
    }


    /**
     * 将传入的图书放入到图书仓库
     * @param book
     * @return  假设图书仓库空间已满，返回false
     */

    public boolean addBook(Book book){
        int bookCount = getBookCount();

        if (Data.bookStore.length == bookCount) {
            return false;
        }

        //如果仓库未满，就将传入的图书对象放置在数组的最后一个位置
        Data.bookStore[bookCount] = book;
        return true;
    }

    /**
     * 删除传入的图书信息
     * @param book
     * @return  是否删除成功
     */

    public boolean delBook(Book book){
        int bookCount = getBookCount();
        int delIndex = -1;
        for (int i = 0; i < bookCount; i++) {

//            if (book.getBookId().equals(Data.bookStore[i].getBookId())){
            if (book.equals(Data.bookStore[i])) {
                delIndex = i;
                break;
            }
        }
        if (delIndex == -1)
            return false;       //没有找到要删除的元素时，直接结束方法返回false
        //执行数组删除套路
        for (int i = delIndex; i < bookCount -1; i++) {
            Data.bookStore[i] = Data.bookStore[i + 1];

        }
        //将最后一个元素置为空
        Data.bookStore[bookCount - 1] = null;
        return true;
    }

    /**
     * 查找图书
     * @param bookId 通过图书ID查找对应的图书对象
     * @return
     */
    public Book findById(String bookId){
        int bookCount = getBookCount();
        for (int i = 0; i < bookCount; i++) {
            if (bookId.equals(Data.bookStore[i].getBookId())) {
//                System.out.println("找到了" + Data.bookStore[i].getBookName() + "这本书");
                return Data.bookStore[i];
            }
        }
//        System.out.println("查无此书！");
        return null;

    }

    /**
     * 入库：为仓库中现有的图书增加库存
     * @param bookId
     * @param count
     * @return 如果入库的bookId不存在，入库失败
     */

    public boolean inStore(String bookId, int count){
        Book book = findById(bookId);
        if (book == null) {
            return false;
        }
        //增加库存
        book.setCount(book.getCount() + count);
        return true;
    }

    /**
     * 出库
     * @param bookId
     * @param count
     * @return 现有库存小于出库量，出库失败
     */
    public boolean outStore(String bookId, int count){
        Book book = findById(bookId);
        if (book == null) {
            return false;
        }
        if (book.getCount() < count){
            return false;
        }
        book.setCount(book.getCount() - count);
        return true;
    }
}
