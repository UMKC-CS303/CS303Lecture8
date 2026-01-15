public class OutsideNode<E>{
    E element;
    OutsideNode<E> next;

    public OutsideNode(E element) {
      this.element = element;
    }

    public OutsideNode(E element, OutsideNode<E> next) {
      this.element = element;
      this.next = next;
    }
 }
