package controller;
import model.*;
import view.ViewConstructor;

import java.util.List;

/*
���� ����� ���������� �� ������ �������
 */


public class TreeControl {
    private TreeMethods treeMethods;
    private PersonMethods personMethods;
    private ViewConstructor viewConstructor;

    public TreeControl() {
        this.treeMethods = new TreeMethods();
        this.personMethods = new PersonMethods();
        this.viewConstructor = new ViewConstructor(this);
    }


    // ������ �� �������� ������
    public Tree<TreePerson> createTree() {
        return treeMethods.newTree();
    }

    // ������ �� �������� ��������

    public Human createHuman(String name, int gender){
        return personMethods.newHuman(name, gender);
    }

    // ������ �� ���������� � ������

    public void addToTree (TreePerson obj, Tree tree){ // �������� ������ (������������ ���������) � ������ �� ������, ���������� �� ������� ����������
        treeMethods.add(obj, tree);
//        System.out.println("���������� ���������");
    }

    public void addToTree (TreePerson[] obj, Tree tree){ // �������� ������ (������������ ���������) � ������ �� ������, ���������� �� ������� ����������
        for (TreePerson item : obj) {
            treeMethods.add(item, tree);
        }
    }

    /**
* ���� ������
     * <p>
* **0, **1 (������ ������ �����) ������ (���������) <br>
* *0*, *1* (������ �����) ��������� ���������� �������� �������<br>
* 0**, 1**, 2**... (� ��� �����������) ��� ������� =><br>
*<br>
* 1 = ����/������<br>
* 2 = ���/����<br>
*<br>
*<br>
* 3 = ��������<br>
* 4 = ����/����<br>
* --<br>
* 5 = ���/����<br>
* 6 = ������<br>
*/
    public void createLink (TreePerson first, TreePerson second, int tipeLink){
        personMethods.createLink(first, second, tipeLink);
    }

    public void createLink (TreePerson[] first, TreePerson[] second, int tipeLink){
        for (int i = 0; i < first.length; i++) {
            personMethods.createLink(first[i], second[i], tipeLink);
        }
    }

    public void viewHeirs(Human startPerson){ // ���������� ������ �������� ������ �����
        viewConstructor.viewHeirs(startPerson);
    }

    public List<Link> getAllLink(Human person, Character filter){
        return personMethods.getAllLink(person, filter);
    }
//    public void addTree(FamiliesI person);
//
//    public void addTree();
//
//    public void printTree();
//
//    public int getGender();
//
//    public void addLink(Link link);
//
//    public List<Link> getLink();
//    public Link getLink(int i);

//    public void addLink();


}
