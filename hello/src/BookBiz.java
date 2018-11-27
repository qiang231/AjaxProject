/**
 * 对图书的增删改查
 */

public class BookBiz {
    /**
     *
     * @param book  销售的图书对象
     * @return      销售成功返回销售的数量，失败返回-1
     */

    public int sellBook(Book book){
        //1.判断库存是否大于1
        //2.图书的库存-1
        //3.返回销售的数量
        if (!(book.getCount() > 1)){
            return -1;
        }else {
            book.setCount(book.getCount() - 1);
            return 1;
        }
    }



}
