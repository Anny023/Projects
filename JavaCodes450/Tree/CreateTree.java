package Tree;

public class CreateTree {
    
        int data;
        CreateTree left;
        CreateTree right;

        public CreateTree(int data){
           this.data=data;
        }
    
    public static void main(String[] args){
        CreateTree root=new CreateTree(1);
        root.left=new CreateTree(2);
        root.right=new CreateTree(3);
        

    }
}
