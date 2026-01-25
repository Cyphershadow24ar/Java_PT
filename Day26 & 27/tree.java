public class tree {
    public static void main(String[] args) {
        /*
        void PreOrder(BinaryTreeNode root){
            if(root != null){
                System.out.print(root.data + " ");
                PreOrder(root.left);
                PreOrder(root.right);
            }
        }

        1. Traverse the left subtree in POst Order
        2. Traverse the right subtree in Post-order
        3. Visit the root

        void Postorder(BinaryTreeNode root){
            if(root != null){
                Postorder(root.left);
                Postorder(root.right);
                System.out.print(root.data + " ");
            }
        }

    Find the Height or Depth of a Binary Tree
    Recurrence Relation

    hight 
        // Recurrence: H(node) = 1 + max(H(left), H(right))
    public static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    Depth 
    // Recurrence: H(node) = 1 + max(H(left), H(right))
    public static int heightInEdges(Node root) {
        if (root == null) return -1;
        return 1 + Math.max(heightInEdges(root.left), heightInEdges(root.right));
    }

        Comapring two BInary tree 

        // Recurrence: D(node) = 1 + D(parent)
    public static int depth(Node root, Node target, int level) {
        if (root == null) return -1;
        if (root == target) return level;

        int left = depth(root.left, target, level + 1);
        if (left != -1) return left;

        return depth(root.right, target, level + 1);
    }



    Recurisve  Relation

    return  =0                      if root is leaf 
    return max(H.left, h.right) + 1      otherwise

    int height(Node root){
        if(root == null) return -1;

        if(root.left == null && root.right == null){
            return 0;
        }
        else
            return Math.max(height(root.left),height(root.right)) + 1;
    }

        */
    }

}
