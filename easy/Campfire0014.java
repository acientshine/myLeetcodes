public class Campfire0014 {

    /**
     * 字典树
     * */
    class TriedTree {
        Node root;
        int size = 0;

        public TriedTree() {
            this.root = new Node();
        }

        class Node {
            Node[] nodes = new Node[26];

            char val;

            int k = 0;
        }

        public void add(String s) {
            if (s == null || s.length() == 0) {
                return;
            }
            Node head = this.root;
            for (int i = 0; i < s.length(); i++) {
                int ch = s.charAt(i) - 'a';
                if (head.nodes[ch] == null) {
                    head.nodes[ch] = new Node();
                    head.nodes[ch].val = s.charAt(i);
                }
                head.nodes[ch].k += 1;
                head = head.nodes[ch];
            }
        }

        public String getMaxPrefix() {
            if (this.root == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            Node maxPrefixNode = null;
            for (Node node : this.root.nodes) {
                if (node != null && node.k >= this.size) {
                    if (maxPrefixNode == null) {
                        maxPrefixNode = node;
                    } else {
                        maxPrefixNode = maxPrefixNode.k <= node.k ? node : maxPrefixNode;
                    }
                }
            }
            if (maxPrefixNode != null) {
                sb.append(maxPrefixNode.val);
                getPrefix(maxPrefixNode, sb);
            }
            return sb.toString();
        }

        public void getPrefix(Node node, StringBuilder sb) {
            if (node == null) {
                return;
            }
            Node maxPrefixNode = null;
            for (Node node1 : node.nodes) {
                if (node1 != null && node1.k >= this.size) {
                    if (maxPrefixNode == null) {
                        maxPrefixNode = node1;
                    } else {
                        maxPrefixNode = maxPrefixNode.k <= node1.k ? node1 : maxPrefixNode;
                    }
                }
            }
            if (maxPrefixNode != null) {
                sb.append(maxPrefixNode.val);
                getPrefix(maxPrefixNode, sb);
            }
        }
    }

    /**
     * 最长公共前缀
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        TriedTree tree = new TriedTree();
        tree.size = strs.length;
        for (String s : strs) {
            tree.add(s);
        }
        return tree.getMaxPrefix();
    }

    public static void main(String[] args) {
        Campfire0014 campfire0014 = new Campfire0014();
        String r = campfire0014.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(r);

        String r1 = campfire0014.longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        System.out.println(r1);
    }
}
