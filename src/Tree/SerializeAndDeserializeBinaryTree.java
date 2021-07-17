package Tree;

import common.TreeNode;

import java.util.LinkedList;

public class SerializeAndDeserializeBinaryTree {
    String SEP = ",";
    String NONE = "#";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }

    public void serialize(TreeNode treeNode, StringBuilder sb) {
        if (treeNode == null) {
            sb.append(NONE).append(SEP);
            return;
        }
        sb.append(treeNode.val).append(SEP);
        serialize(treeNode.left, sb);
        serialize(treeNode.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        LinkedList<String> list = new LinkedList<>();
        for (String s : data.split(SEP)) {
            list.addLast(s);
        }
        return deserialize(list);
    }

    public TreeNode deserialize(LinkedList<String> list) {
        if (list.isEmpty()) {
            return null;
        }
        String val = list.removeFirst();
        if (NONE.equals(val)) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = deserialize(list);
        root.right = deserialize(list);
        return root;
    }
}
