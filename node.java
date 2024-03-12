   while(node.next!=null){
            if(node.val==node.next.val){
                node.next=node.next.next;
            }
            else{
                node=node.next;
            }