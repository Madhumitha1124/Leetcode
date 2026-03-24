class MyLinkedList {
    class Node{
        int val;
        Node prev;
        Node next;
        Node(int val){
            this.val=val;
            prev=null;
            next=null;
        }
    }
    Node head,tail;
    int cnt;
    public MyLinkedList() {
         head=null;
         tail=null;
        cnt=0;
    }
    
    public int get(int index) {
         Node temp=head;
        if(index<0 || index>=cnt){
            return -1;
        }
        
           
            for(int i=0;i<index;i++){
                temp=temp.next;
        }
        return temp.val;
        
    }
    
    public void addAtHead(int val) {
        Node nn=new Node(val);
         Node temp=head;
        if(head==null){
            head=nn;
            tail=nn;
        }
        
        else{
           
            nn.next=head;
            head.prev=nn;
            head=nn;
            
        }
        cnt+=1;
        
    }
    
    public void addAtTail(int val) {
        Node nn=new Node(val);
        if(head==null){
            head=nn;
            tail=nn;
        }
       
        else{
            tail.next=nn;
            nn.prev=tail;
            tail=nn;
            
        }
        cnt+=1;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>cnt){
            return ;
        }
        if(index==0){
            addAtHead(val);

        }
        else if(index==cnt){
            addAtTail(val);
        }
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            Node nn=new Node(val);
            nn.prev=temp;
            nn.next=temp.next;
            temp.next=nn;
           nn.next.prev=nn;
            cnt+=1;
        }
        
    }
    
    public void deleteAtIndex(int index) {
    if(index < 0 || index >= cnt){
        return;
    }

    if(index == 0){
        head = head.next;
        if(head != null){
            head.prev = null;
        } else {
            tail = null;
        }
        cnt--;
    }
    else if(index == cnt - 1){
        tail = tail.prev;
        if(tail != null){
            tail.next = null;
        } else {
            head = null;
        }
        cnt--;
    }
    else{
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(temp.next != null){
            temp.next.prev = temp;
        }
        cnt--;
    }
}
        
    }


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */