package LeeCode;

/**
 * 两链表反向相加之和
 */
public class LeeCode002 {
    public static void main(String args[]){
        StringBuffer resultStr = new StringBuffer(String.valueOf(807));
        ListNode resultNode = new ListNode();
        for(int i=0;i<resultStr.length();i++){
            System.out.println(resultStr.substring(i,i+1));
            resultNode.val = Integer.parseInt(resultStr.substring(i,i+1));
            ListNode listNode = new ListNode();
            resultNode.next = listNode;
            resultNode = resultNode.next;

        }
        System.out.println();
        while (resultNode!=null){
            System.out.println(1111);
            System.out.println(resultNode.val);
            resultNode = resultNode.next;
        }

    }
     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         StringBuffer stringBuffer1 = new StringBuffer();
         StringBuffer stringBuffer2 = new StringBuffer();
        while (l1!=null){
            stringBuffer1.append(l1.val);
            l1=l1.next;
        }while (l2!=null){
            stringBuffer2.append(l2.val);
            l2=l2.next;
        }
        int result = Integer.parseInt(String.valueOf(stringBuffer1.reverse()))+Integer.parseInt(String.valueOf(stringBuffer2.reverse()));
        StringBuffer resultStr = new StringBuffer(String.valueOf(result));
        ListNode resultNode = new ListNode();
        for(int i=0;i<resultStr.length();i++){
            resultNode.val = Integer.parseInt(resultStr.substring(i,i+1));
            if (resultNode.next!=null){
                resultNode=resultNode.next;
            }
        }
        return resultNode;
    }
    public static  void add(String l1,String l2){
         int result = Integer.parseInt(String.valueOf(new StringBuffer(l1).reverse()))+Integer.parseInt(String.valueOf(new StringBuffer(l2).reverse()));
        System.out.println(result);
         StringBuffer resultStr = new StringBuffer(String.valueOf(result)).reverse();
        System.out.println(resultStr);
    }
}
