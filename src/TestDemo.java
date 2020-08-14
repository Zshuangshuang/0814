/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-14
 * Time:21:32
 **/
class MyArrayList{
private int[] elem;
private int usedSize;
public final int SIZE = 20;

    public MyArrayList() {
        this.elem = new int[SIZE];
        this.usedSize = 0;
    }

    public int[] getElem() {
        return elem;
    }

    public void setElem(int[] elem) {
        this.elem = elem;
    }

 public void add(int pos,int data){
        if (pos <0 || pos>this.usedSize){
            throw new ArrayIndexOutOfBoundsException("pos位置不合法");

        }


     for (int i = this.usedSize; i >= pos; i--) {
            this.elem[i+1] = this.elem[i];
     }
     this.elem[pos] = data;
     this.usedSize++;
 }
 public void display(){
     for (int i = 0; i<this.usedSize;i++) {
         System.out.print(this.elem[i]+" ");
     }
 }
 public int search(int key){
     for (int i = 0; i < this.usedSize; i++) {
         if (this.elem[i] == key){
             return i;
         }
     }
        return -1;
 }
 public void remove(int toRemove){
        int ret = search(toRemove);
        if (ret == -1){
            throw new ArrayIndexOutOfBoundsException("没有要删除的元素");
        }
     for (int i = ret; i < this.usedSize-1 ; i++) {
         this.elem[i] = this.elem[i+1];
     }
     this.usedSize--;
 }
}
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,19);
        myArrayList.add(1,20);
        myArrayList.add(2,33);
        myArrayList.display();
        myArrayList.remove(19);
        myArrayList.display();
    }
}
