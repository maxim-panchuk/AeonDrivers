package com.backend.aeondrivers.utils.document;

import com.backend.aeondrivers.person.driver.Car;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * @author tsypk on 28.11.2021 02:05
 * @project AeonDrivers
 */
@Named
@ApplicationScoped
public class DocumentService {
    public TreeNode createDocuments() {
        TreeNode root = new DefaultTreeNode(new Car("Лада", "к682нм 78 rus",true, false, true), null);

        TreeNode car1 = new DefaultTreeNode(new Car("Lada nine", "у314лк 14 rus",true, false, true), root);

        TreeNode car2 = new DefaultTreeNode(new Car("Toyota mark 2", "е913рк 777 rus",false, true, true), root);

        return root;
    }
}
