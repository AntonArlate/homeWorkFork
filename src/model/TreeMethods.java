package model;

public class TreeMethods {
//    private List<Tree> treeList;

    public TreeMethods() {
//        this.treeList = new ArrayList<>();
    }


    public Tree<TreePerson> newTree(){
        Tree<TreePerson> newTree = new Tree<>();
//        treeList.add(newTree);
        return newTree;
    }

    public void add(TreePerson obj, Tree tree){
        tree.add(obj);


    }
}
